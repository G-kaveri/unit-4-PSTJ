import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> student1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            student1.add(sc.nextLine());
        }

        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<String> student2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            student2.add(sc.nextLine());
        }

        student1.retainAll(student2);
        System.out.println(student1);

        sc.close();
    }
}
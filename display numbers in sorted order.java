import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> marks = new TreeSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println(marks);
        sc.close();
    }
}
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> items = new LinkedHashSet<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            items.add(sc.nextLine());
        }

        for (String item : items) {
            System.out.println(item);
        }

        sc.close();
    }
}
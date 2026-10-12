import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            history.push(sc.nextLine());
        }

        if (!history.isEmpty()) {
            history.pop();
        }

        if (!history.isEmpty()) {
            System.out.println(history.peek());
        } else {
            System.out.println("No page in history");
        }

        sc.close();
    }
}
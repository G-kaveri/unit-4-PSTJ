import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, List<String>> groups = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        System.out.println(groups.values());
        sc.close();
    }
}
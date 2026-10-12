import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.next();
            freq.put(tag, freq.getOrDefault(tag, 0) + 1);
        }

        List<String> tags = new ArrayList<>(freq.keySet());

        tags.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        for (String tag : tags) {
            System.out.println(tag + " " + freq.get(tag));
        }

        sc.close();
    }
}
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        int k = sc.nextInt();
        List<String> words = new ArrayList<>(freq.keySet());

        words.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        for (int i = 0; i < Math.min(k, words.size()); i++) {
            System.out.println(words.get(i));
        }

        sc.close();
    }
}
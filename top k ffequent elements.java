import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int k = sc.nextInt();
        List<Integer> values = new ArrayList<>(freq.keySet());

        values.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        for (int i = 0; i < Math.min(k, values.size()); i++) {
            System.out.print(values.get(i));
            if (i < Math.min(k, values.size()) - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        sc.close();
    }
}
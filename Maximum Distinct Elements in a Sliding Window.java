import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println(0);
            sc.close();
            return;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int distinct = 0;
        int maxDistinct = 0;

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

            if (freq.get(arr[i]) == 1) {
                distinct++;
            }

            if (i >= k) {
                int old = arr[i - k];
                freq.put(old, freq.get(old) - 1);

                if (freq.get(old) == 0) {
                    freq.remove(old);
                    distinct--;
                }
            }

            if (i >= k - 1) {
                maxDistinct = Math.max(maxDistinct, distinct);
            }
        }

        System.out.println(maxDistinct);
        sc.close();
    }
}
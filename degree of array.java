import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
        }

        int degree = Collections.max(freq.values());
        int answer = n;

        for (int key : freq.keySet()) {
            if (freq.get(key) == degree) {
                answer = Math.min(answer, last.get(key) - first.get(key) + 1);
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
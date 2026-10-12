import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                System.out.println(map.get(need) + " " + i);
                sc.close();
                return;
            }

            map.put(nums[i], i);
        }

        sc.close();
    }
}
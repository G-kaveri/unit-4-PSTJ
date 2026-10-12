import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[6];

        for (int i = 0; i < n; i++) {
            freq[sc.nextInt()]++;
        }

        int answer = 1;

        for (int i = 2; i <= 5; i++) {
            if (freq[i] > freq[answer]) {
                answer = i;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
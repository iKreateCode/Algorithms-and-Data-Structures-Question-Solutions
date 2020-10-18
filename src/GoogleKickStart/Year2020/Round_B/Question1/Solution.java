package GoogleKickStart.Year2020.Round_B.Question1;

import java.util.*;
import java.io.*;

public class Solution {
    public static Integer solve(int B, int[] A) {
        int sum = 0;

        if (B >= 3){
            for (int i=1; i < A.length-1; i++) {
                if (A[i] > A[i - 1] && A[i] > A[i + 1]) sum ++;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int heights = in.nextInt();
            int[] checkpoints = new int[heights];
            for (int h = 0; h < heights; h++) checkpoints[h] = in.nextInt();
            System.out.println("Case #" + i + ": " +  solve(t, checkpoints));
        }
    }
}
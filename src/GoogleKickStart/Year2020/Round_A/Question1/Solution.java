package GoogleKickStart.Year2020.Round_A.Question1;

import java.util.*;
import java.io.*;

public class Solution {
    public static String solve(int B, int[] A) {
        int sum = 0;
        int noHouses = 0;
        ArrayList<Integer> costOfHouses = new ArrayList<Integer>();
        for (int a : A){
            costOfHouses.add(a);
        }
        Collections.sort(costOfHouses);
        // find the lowest from them whilst <= B
        for (int a : costOfHouses){
            if (a <= B){
                if (a + noHouses <= B){
                    noHouses += a;
                    sum++;
                }
            }
        }
        return String.valueOf(sum);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int houses = in.nextInt();
            int budget = in.nextInt();
            int[] prices = new int[houses];
            for (int h = 0; h < houses; h++) prices[h] = in.nextInt();
            System.out.println("Case #" + i + ": " +  solve(budget, prices));
        }
    }
}

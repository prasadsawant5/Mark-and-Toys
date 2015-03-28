import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        double k = stdin.nextDouble();
        double prices[] = new double[n];
        for(int i = 0; i < n; i++) prices[i] = stdin.nextInt();
        
        int answer = 0;
        // Compute the final answer from n,k,prices 
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            k = k - prices[i];
            
            if (k > 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

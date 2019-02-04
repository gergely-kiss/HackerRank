import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String binary = convertToBinary(n);
        int consecutiveOnes = countMaximumConsecutiveOnes(binary);
        System.out.println(consecutiveOnes);
    }

    public static String convertToBinary(int n){
        String binary = "";
        while ( n > 0){
            binary = n % 2 == 0 ? 0 + binary : 1 + binary;
            n/=2;
        }
        return binary;
    }
    public static int countMaximumConsecutiveOnes(String s) {
        char[] binary = s.toCharArray();
        int maxConsecutiveOnes = 0;
        int tempConsecutiveOnes = 0;

        for(int i = 0; i<binary.length; i++) {
            if(binary[i] == '1') {
                tempConsecutiveOnes++;
                if (tempConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = tempConsecutiveOnes;
                }
            }else {
                tempConsecutiveOnes = 0;
                if(binary.length - i < maxConsecutiveOnes) {
                    break;
                }
            }
        }
        return maxConsecutiveOnes;
    }
}

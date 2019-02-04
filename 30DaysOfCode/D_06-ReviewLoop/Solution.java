import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        String input;

        for (int i = 0; i < count; i++) {
            input = scan.next();
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(input.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println(" ");
        }
    }
}

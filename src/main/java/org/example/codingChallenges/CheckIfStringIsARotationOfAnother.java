package org.example.codingChallenges;

import java.util.Scanner;

public class CheckIfStringIsARotationOfAnother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String str1 = scanner.next();

        char[] strToCharArr = str.toCharArray();
        char[] str1ToCharArr = str1.toCharArray();

        for( char s : strToCharArr ) {
            boolean equal = false;
            for (char s1 : str1ToCharArr) {
                if (s1 == s) {
                    equal = true;
                    break;
                }
            }

            if (!equal) {
                System.out.println("false");
                break;
            }
        }
    }
}

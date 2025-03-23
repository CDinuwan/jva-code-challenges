package org.example.codingChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.next();
        String secondStr = scanner.next();
        scanner.close(); // Close scanner

        if (firstStr.length() != secondStr.length()) {
            System.out.println("Not an anagram");
            return; // Exit early
        }

        char[] firstCharArr = firstStr.toCharArray();
        char[] secondCharArr = secondStr.toCharArray();

        Arrays.sort(firstCharArr);
        Arrays.sort(secondCharArr);

        if (Arrays.equals(firstCharArr, secondCharArr)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}

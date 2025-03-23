package org.example.codingChallenges;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String reverseStr = "";

        char[] charArr = input.toCharArray();

        for(char l : charArr) {
            reverseStr = l + reverseStr;
        }

        System.out.println(reverseStr);
    }
}

package org.example.codingChallenges;

import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        int index = scanner.nextInt();

        int len = inputStr.length();

        String result = inputStr.substring(len-index) + inputStr.substring(0, len - index);

        System.out.println(result);
    }


}

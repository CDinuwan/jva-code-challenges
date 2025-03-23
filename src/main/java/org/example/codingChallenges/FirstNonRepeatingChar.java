package org.example.codingChallenges;

import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();

        char[] charArr = value.toCharArray();

        for (char item : charArr) {
            int count = 0;
            for (char c : charArr) {
                if (item == c) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(item);
                break;
            }
        }
    }
}

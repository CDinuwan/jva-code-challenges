package org.example.codingChallenges;

public class MissingNumberOfArray {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 5, 6}; // Missing number: 4
        int n = intArr.length + 1; // Since one number is missing

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : intArr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}

package org.example.codingChallenges;

public class Solution {

    public static void main(String[] args) {

        int[] intArr = {2,3,4,5,9,6,1};
        int max = 0;
        int secondLargest = 0;

        for (int num : intArr) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if(num > secondLargest && num != max) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}

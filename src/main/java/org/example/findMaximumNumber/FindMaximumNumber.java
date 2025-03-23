package org.example.findMaximumNumber;

public class FindMaximumNumber {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 2};
        int maxNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);
    }
}

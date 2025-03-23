package org.example.codingChallenges;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (!seen.add(num)) {  // If `add` returns false, the number is already in the set
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}

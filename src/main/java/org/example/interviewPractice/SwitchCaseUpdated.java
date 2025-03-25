package org.example.interviewPractice;

public class SwitchCaseUpdated {

    public static void main(String[] args) {
        int n = (int) (Math.random()*10);
        System.out.println(n);
        String dayName = switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Invalid";
        };
        System.out.println(dayName);
    }
}

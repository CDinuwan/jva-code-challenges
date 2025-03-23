package org.example.interviewPractice;

public class StringBufferPractise {

    public static void main(String[] args) {
        //StringBuffer is thread safe
        StringBuffer stringBuffer = new StringBuffer("Hello World");
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.append(" Java"));
        System.out.println(stringBuffer.charAt(8));
        System.out.println(stringBuffer);

        //StringBuilder isn't thread safe
        StringBuilder stringBuilder = new StringBuilder("Hello World!");
        stringBuilder.append(" Java");
        System.out.println(stringBuilder.substring(5));
        System.out.println(stringBuilder);
    }
}

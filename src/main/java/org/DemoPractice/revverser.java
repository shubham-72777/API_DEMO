package org.DemoPractice;

public class revverser {
    public static void main(String[] args) {
        String a = "I am interviewer, at ५pm";
        String reversed = reverseString(a);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }
}

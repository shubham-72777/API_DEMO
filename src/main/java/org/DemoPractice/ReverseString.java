package org.DemoPractice;

public class ReverseString {
    public static void main(String[] args) {
        String input = "I am interviewer, at ५pm";

        String[] words = input.split(",");
//        String [] words =wordss.split(" "),;
        StringBuilder output = new StringBuilder();
        for (String abc : words) {
            for (int i = abc.length()-1; i >= 0; i--) {
                String[] wordss = abc.split(" ");
                StringBuilder output1 = new StringBuilder();
                output1.append(words[i]);
                output1.append(" ");
            }
        }

        System.out.println(output.toString().trim());
    }
}

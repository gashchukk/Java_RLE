package com.tasks6.rle;

public class Application {
    public static void main(String[] args) {
            String input = args[0];
            String encoded = encodeRLE(input);
            System.out.println(encoded);
    }

    public static String encodeRLE(String input) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        char prevChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == prevChar) {
                count++;
            } else {
                if (count > 1) {
                    encoded.append(prevChar).append(count);
                } else {
                    encoded.append(prevChar);
                }
                count = 1;
                prevChar = currentChar;
            }
        }

        if (count > 1) {
            encoded.append(prevChar).append(count);
        } else {
            encoded.append(prevChar);
        }

        return encoded.toString();
    }
}

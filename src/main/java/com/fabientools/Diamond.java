package com.fabientools;

public class Diamond {
    public static String print(int n) {
        // Pre-conditions
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        // Processing
        StringBuffer buffer = new StringBuffer();
        if (n == 1) {
            buffer.append("*");
        }

        buffer.append("\n");
        return buffer.toString();
    }
}

package com.fabientools;

import static java.lang.Math.abs;

public class Diamond {
    public static String print(int n) {
        // Pre-conditions
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        // Processing
        StringBuffer buffer = new StringBuffer();
        int median = (n - 1) / 2;
        for (int row = 0; row < n; row++) {
            int distance = median - abs(row - median) + 1;
            for (int col = 0; col < (distance + median); col++) {
                String character = abs(col - median) < distance ? "*" : " ";
                buffer.append(character);
            }

            buffer.append("\n");
        }

        return buffer.toString();
    }
}

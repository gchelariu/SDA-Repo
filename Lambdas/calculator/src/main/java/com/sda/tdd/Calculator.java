package com.sda.tdd;

//cerinta: Vezi OneNote JavaAdvance-4 (TDD)

public class Calculator {

    public int add(String s) {
        if ("".equals(s)) {
            return 0;
        }

        String[] split = s.split(",|\n");
        int sum = 0;
        for (String temp : split) {
            int value = Integer.parseInt(temp);
            if (value < 0) {
                throw new IllegalArgumentException("negatives not allowed");
            }
            sum += Integer.valueOf(temp);
        }

        return sum;
    }
}

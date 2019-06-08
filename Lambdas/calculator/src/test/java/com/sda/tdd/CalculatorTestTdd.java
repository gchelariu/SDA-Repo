package com.sda.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestTdd {

    private Calculator target = new Calculator();

    @Test
    public void test1() {
        assertEquals(0, target.add(""));
    }

    @Test
    public void test2() {
        assertEquals(0+1+2+3,target.add("0,1,2,3"));
    }

    @Test
    public void test3() {
        assertEquals(100, target.add("100"));
        assertEquals(100, target.add("20,80"));
    }

    @Test
    public void test4() {
        assertEquals(0+1+2+3,target.add("0,1\n2,3"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void test5() {
        target.add("-1,0");
    }
}
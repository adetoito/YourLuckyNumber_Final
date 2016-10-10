package com.company;

public class RNG {

    public double number;

    public RNG (double num) {

        number = num;

    }

    public int perfectRandom (double num) {

        num = Math.pow(num, 2);
        return (int) num;

    }

}

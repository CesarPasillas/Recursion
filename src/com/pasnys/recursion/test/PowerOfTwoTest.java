package com.pasnys.recursion.test;

import com.pasnys.recursion.PowerOfTwo;

public class PowerOfTwoTest {

    public static void main(String... args){
        int numberToLookUntil = 5;
        PowerOfTwo pot = new PowerOfTwo(numberToLookUntil);

        System.out.println("The power of 2 for the " + numberToLookUntil + " is " + (int) pot.calculatePowerOfTwo());
    }
}

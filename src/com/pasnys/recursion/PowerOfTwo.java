package com.pasnys.recursion;

/**
 * A power of two is a number of the form 2n where n is an integer, that is, the result of exponentiation with number two as the base and integer n as the exponent.
 *
 * In a context where only integers are considered, n is restricted to non-negative values,[1] so there are 1, 2, and 2 multiplied by itself a certain number of times
 *
 *
 n	2n
 1	2
 2	4
 3	8
 4	16
 5	32
 6	64
 7	128
 8	256
 9	512
 10	1,024
 11	2,048
 12	4,096
 13	8,192
 14	16,384
 15	32,768
 */
public class PowerOfTwo {

    private int powerOfTwoOf;
    private int n = 0;
    private double powerOfTwo = 0;

    public PowerOfTwo(int powerOfTwoOf){
        this.powerOfTwoOf = powerOfTwoOf;
    }

    public double calculatePowerOfTwo(){
        //We use the number 2 as argument because is the first number in the Power Of Two
        return calculatePowerOfTwo(2);
    }

    public double calculatePowerOfTwo(double previous){
        //In this case we know the n times that we need to do the recursive call, each time that we increase to control the recursive calls
        n++;

        //Here we calculate the power of two.
        powerOfTwo = previous + powerOfTwo;
        System.out.println("Power of 2^" + n + " = " + powerOfTwo);
        if (n == powerOfTwoOf){

            return powerOfTwo;
        } else {
            calculatePowerOfTwo(powerOfTwo);
        }

        return powerOfTwo;
    }

}

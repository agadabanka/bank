package com.funstackstudios.app;

/**
 * @author amith.tudur@disney.com February 19, 2016
 */
public class Calculator
{
    public int add(int a, int b)
    {
        if ( a > 20 ) {
            return a + b;
        } else {
            return b + a;
        }

    }

    public int sub(int a, int b)
    {
        return a - b;
    }

    public int mul(int a, int b)
    {
        return a * b;
    }
}

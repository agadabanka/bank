package com.funstackstudios.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // world(10);
        Calculator c = new Calculator();
        System.out.println((c.add(10, 20)));
    }

    public static boolean world(int n)
    {
        if ( n < 10 ) {
            System.out.println( "Hello World!" );
            return true;
        } else {
            System.out.println( "Hello Universe!" );
            return false;
        }
    }
}

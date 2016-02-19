package com.funstackstudios.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        world(10);
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

package com.funstackstudios.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        assertTrue(!App.world(20));
        assertTrue(!App.world(25));
        assertTrue(App.world(9));
    }

    public void testAdd()
    {
        Calculator c = new Calculator();
        assertTrue(c.add(30, 20) == 50);
        assertTrue(c.add(10, 0) == 10);
    }
}

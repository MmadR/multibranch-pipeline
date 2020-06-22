package org.module2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ModuleClassTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ModuleClassTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ModuleClassTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTestClass()
    {
        ModuleClass moduleClass = new ModuleClass();
        
        assertEquals(moduleClass.testMethod(), "ok");
    }
}

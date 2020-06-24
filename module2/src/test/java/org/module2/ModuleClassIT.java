package org.module2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ModuleClassIT
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ModuleClassIT(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ModuleClassIT.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTest2Class()
    {
        ModuleClass moduleClass = new ModuleClass();
        
        assertEquals(moduleClass.testMethod2(), "bye");
    }
}

package jcodecollector.util;

import junit.framework.*;

/**
 * The class <code>OSTest</code> contains tests for the class <code>{@link OS}</code>.
 *
 * @generatedBy CodePro at 12/05/13 15:26
 * @author matthew
 * @version $Revision: 1.0 $
 */
public class OSTest extends TestCase {
    /**
     * Run the boolean isLinux() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public void testIsLinux_1()
        throws Exception {

        boolean result = OS.isLinux();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isLinux() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public void testIsLinux_2()
        throws Exception {

        boolean result = OS.isLinux();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isMacOSX() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public void testIsMacOSX_1()
        throws Exception {

        boolean result = OS.isMacOSX();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isMacOSX() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public void testIsMacOSX_2()
        throws Exception {

        boolean result = OS.isMacOSX();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isWindows() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public void testIsWindows_1()
        throws Exception {

        boolean result = OS.isWindows();

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWindows() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public void testIsWindows_2()
        throws Exception {

        boolean result = OS.isWindows();

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @see TestCase#setUp()
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    protected void setUp()
        throws Exception {
        super.setUp();
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @see TestCase#tearDown()
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    protected void tearDown()
        throws Exception {
        super.tearDown();
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 12/05/13 15:26
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            // Run all of the tests
            junit.textui.TestRunner.run(OSTest.class);
        } else {
            // Run only the named tests
            TestSuite suite = new TestSuite("Selected tests");
            for (int i = 0; i < args.length; i++) {
                TestCase test = new OSTest();
                test.setName(args[i]);
                suite.addTest(test);
            }
            junit.textui.TestRunner.run(suite);
        }
    }
}
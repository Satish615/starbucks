package starbucks ;


        import static org.junit.Assert.*;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;

    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1

        // Assertion (Replace with appropriate test)

        kp.touch(3,8);
        assertEquals(kp.lastKey(),"X");


    }

    @Test
    public void testTwo()
    {
        // Press 2

        // Assertion (Replace with appropriate test)
        kp.touch(2,8);
        assertEquals(kp.lastKey(),"0");
    }

    @Test
    public void testThree()
    {
        // Press 3

        kp.touch(1,8);
        assertEquals(kp.lastKey()," ");
    }

    @Test
    public void testFour()
    {
        // Press 4

        // Assertion (Replace with appropriate test)
        kp.touch(1,5);
        assertEquals(kp.lastKey(),"1");
    }

    @Test
    public void testFive()
    {
        // Press 5

        kp.touch(4,5);
        assertEquals(kp.lastKey(),"4");
    }

    @Test
    public void testSix()
    {
        // Press 6

        // Assertion (Replace with appropriate test)
        kp.touch(3,6);
        assertEquals(kp.lastKey(),"6");
    }

    @Test
    public void testSeven()
    {
        // Press 7

        kp.touch(1,5);
        assertEquals(kp.lastKey(),"1");
    }

    @Test
    public void testEight()
    {
        // Press 8

        kp.touch(1,7);
        assertEquals(kp.lastKey(),"7");
    }

    @Test
    public void testNine()
    {
        // Press 9

        kp.touch(0,8);
        assertEquals(kp.lastKey(),"9");
    }

    @Test
    public void testZero()
    {
        // Press 0
        kp.touch(2,8);
        assertEquals(kp.lastKey(),"0");
    }

    @Test
    public void testBackspace()
    {
        // Press Backspace

        kp.touch(1,8);
        assertEquals(kp.lastKey()," ");
    }

    @Test
    public void testNoKey()
    {
        // Press Empty Key
        kp.touch(1,8);
        assertEquals(kp.lastKey()," ");
    }



    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

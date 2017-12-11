import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class aqwTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class aqwTest
{
    private qq qq1;
    private qq qq2;

    /**
     * Default constructor for test class aqwTest
     */
    public aqwTest()
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
        qq1 = new qq();
        qq2 = new qq();
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

    @Test
    public void firstTest()
    {
        qq1.foo();
        qq1.test();
    }

    @Test
    public void second()
    {
        assertEquals(4, qq1.test());
    }
}



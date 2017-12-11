import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestManual.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestManual
{
    /**
     * Default constructor for test class TestManual
     */
    public TestManual()
    {
    }
    
    @Test
    public void foo()
    {
        assertEquals(5, 8);
        assertEquals(8, 8);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
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

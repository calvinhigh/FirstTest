

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTest
{
    /**
     * Default constructor for test class ClockTest
     */
    public ClockTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TimeMatch()
    {
        ClockTime clockTim3 = new ClockTime(11, 11, 11);
        ClockTime clockTim4 = new ClockTime(11, 11, 11);
        clockTim4.equals(11);
    }
}


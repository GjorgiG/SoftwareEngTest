package test;

import main.ReVise;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RatingsTest {

    private ReVise ReVise;

    @Before
    public void setUp() {
        ReVise = new ReVise();
    }

    @Test
    public void testValidRating() {
        int rating = 4;
        assertTrue(ReVise.isValidRating(rating));
    }

    @Test
    public void testInvalidRating() {
        int rating = 6;
        assertFalse(ReVise.isValidRating(rating));
    }
}

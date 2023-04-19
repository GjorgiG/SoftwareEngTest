package test;

import main.ReVise;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegisterTest {

    private ReVise ReVise;

    @Before
    public void setUp() {
        ReVise = new ReVise();
    }


    @Test
    public void testValidEmail() {
        String email = "example@email.com";
        assertTrue(ReVise.isValidEmail(email));
    }

    @Test
    public void testInvalidEmail() {
        String email = "not a valid email";
        assertFalse(ReVise.isValidEmail(email));
    }
}

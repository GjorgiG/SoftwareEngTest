package test;

import main.ReVise;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTest {

    private main.ReVise ReVise;

    @Before
    public void setUp() {
        ReVise = new ReVise();
    }

    @Test
    public void testValidCredentials() throws Exception {
        String username = "user1";
        String password = "password1";

        assertTrue(ReVise.isValidUser(username, password));
    }

    @Test
    public void testInvalidCredentials() throws Exception {
        String username = "";
        String password = "12345";

        assertFalse(ReVise.isValidUser(username, password));
    }
}


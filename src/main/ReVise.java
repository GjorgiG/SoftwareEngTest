package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReVise {

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        // Regular expression pattern to validate email format
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Create a pattern object and match it with the input email string
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidRating(int rating) {
        return rating >= 1 && rating <= 5;
    }

    public boolean isValidUser(String username, String password) {
        // Check if the username and password meet your validation criteria
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty() && password.length() >= 6) {
            // In this example, we're just checking if the username and password are not null, not empty, and the password length is at least 6 characters
            return true;
        }

        // If the username and password are not valid, return false
        return false;
    }
}

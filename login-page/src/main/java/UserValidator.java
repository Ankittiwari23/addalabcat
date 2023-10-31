public class UserValidator {
    private static final String predefinedUsername = "ram";
    private static final String predefinedPassword = "3025";

    public static boolean validate(String inputUsername, String inputPassword) {
        return inputUsername.equals(predefinedUsername) && inputPassword.equals(predefinedPassword);
    }
}

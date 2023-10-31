import static org.junit.Assert.*;
import org.junit.Test;
public class UserValidatorTest {
 @Test
 public void testValidUser() {
 assertTrue(UserValidator.validate("myuser", "mypassword"));
 }
 @Test
 public void testInvalidUser() {
 assertFalse(UserValidator.validate("wronguser", "wrongpassword"));
 }
}
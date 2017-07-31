package chapter20;


public class PasswordUtils {
    @UseCase(id = 47, description="first")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id=48, description="second")
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
}
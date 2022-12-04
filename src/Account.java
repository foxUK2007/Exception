import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private String login;
    private String password;
    private static String confirmPassword;

    public Account(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public static void setLogin(String login) throws WrongLoginException {
        Pattern pattern = Pattern.compile("[a-z]{3,}['_'][0-9]{3,}");
        Matcher matcher = pattern.matcher(login);
        if (matcher.matches()) {
        } else {
            throw new WrongLoginException("Некорректное имя пользователя");
        }

    }

    public String getPassword() {
        return password;
    }

    public static void setPassword(String password) throws WrongPasswordException {
        Pattern pattern = Pattern.compile("[a-z]{3,}['_'][0-9]{3,}");
        Matcher matcherPassword = pattern.matcher(password);
        Matcher matcherConfPassword = pattern.matcher(confirmPassword);
        if (password.length() == confirmPassword.length() & matcherPassword.matches() & matcherConfPassword.matches()) {
        } else {
            throw new WrongPasswordException("Некорректный пароль");
        }
    }

    public String getConfirmPassword() {
        return password;
    }

    public static void checkAccount(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        Pattern pattern = Pattern.compile("[a-z]{3,}['_'][0-9]{3,}");
        Matcher matcher = pattern.matcher(login);
        if (matcher.matches()) {
        } else {
            throw new WrongLoginException("Некорректное имя пользователя");
        }
        Matcher matcherPassword = pattern.matcher(password);
        Matcher matcherConfPassword = pattern.matcher(confirmPassword);
        if (password.length() == confirmPassword.length() & matcherPassword.matches() & matcherConfPassword.matches()) {
        } else {
            throw new WrongPasswordException("Некорректный пароль");
        }
    }
}

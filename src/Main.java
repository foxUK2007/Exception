import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isChecked = false;
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword;
        while (!isChecked) {
            System.out.println("Введите имя пользователя:");
            login = scanner.nextLine();
            System.out.println("Введите пароль:");
            password = scanner.nextLine();
            System.out.println("Подтвердите пароль:");
            confirmPassword = scanner.nextLine();
            try {
                Account.checkAccount(login, password, confirmPassword);
                System.out.println("Некорректное имя пользователя");
                isChecked = true;
            } catch (WrongLoginException e) {
                System.out.println("Некорректное имя пользователя");
            } catch (WrongPasswordException e) {
                System.out.println("Некорректный пароль");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            Authorization.addNewProfile("refsdr", "123", "123");
        } catch (WrongLoginExeption e) {
            System.out.println("Ошибка логина");
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
        }
    }
}

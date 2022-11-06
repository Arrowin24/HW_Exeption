public class Authorization {

    public static void addNewProfile(String login, String password, String confirmPassword) throws WrongLoginExeption, WrongPasswordException {
        if (isAvailableFormat(login)) {
            System.out.println("Логин корректен!");
        } else {
            throw new WrongLoginExeption();
        }
        if (isAvailableFormat(password)) {
            System.out.println("Пароль корректен");
        } else {
            throw new WrongPasswordException("В пароле находятся недоступные символы.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("В поле \"Подтверждение пароля\" введенное значение не совпадает с паролем");
        }
        System.out.println("Создан новый профиль");
    }

    private static boolean isAvailableFormat(String str) {
        return str.matches("\\w{1,20}");
    }
}

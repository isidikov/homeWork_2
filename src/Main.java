import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();

            String result = canGoForAWalk(age, temperature);
            System.out.println("Возраст: " + age + " лет, Температура: " + temperature + " градусов - " + result);
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(61); // Генерация случайного возраста от 0 до 60 лет
    }

    public static int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(51) - 20; // Генерация случайной температуры от -20 до 30 градусов
    }

    public static String canGoForAWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}

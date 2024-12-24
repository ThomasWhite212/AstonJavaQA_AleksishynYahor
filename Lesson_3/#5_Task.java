// 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да - вернуть true, в противном случае - false.

public class Task_5 {
    public static void main(String[] args) {
        int a = 100;  // Можно изменять это значение
        int b = 5;  // Можно изменять это значение

        boolean result = isSumInRange(a, b);

        System.out.println(result);
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}

// 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.

public class Task_7 {

    public static void main(String[] args) {
        System.out.println(isNegative(-5)); // Можно менять число number
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
}

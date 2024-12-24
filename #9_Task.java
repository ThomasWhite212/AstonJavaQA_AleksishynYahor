// 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й - високосный.

public class Task_9 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2001)); // Можно задать год
    }

    public static boolean isLeapYear(int year) {
        // Проверка на високосность - Високосный должен быть кратный 4 но не кратный 100 или кратным 400
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    }
}

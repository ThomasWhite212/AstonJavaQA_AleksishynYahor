// 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class Task_8 {

    public static void main(String[] args) {
        printString("Hello", 5);  // Можно задавать поле text и количество выводов count
    }

    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}

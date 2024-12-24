// 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение "a >= b", в противном случае "a < b";

public class Task_4 {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 30; // Можно задать любое значение
        int b = 40; // Можно задать любое значение

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

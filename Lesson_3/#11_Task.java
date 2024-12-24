// 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 12345678.... 100;

public class Task_11 {

    public static void main(String[] args) {
        // Создание пустого массива длиной 100
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;  // Заполнение массива значениями от 1 до 100
        }

        // Вывод массива
        printArray(array);
    }

    // Метод для вывода массива в консоль
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

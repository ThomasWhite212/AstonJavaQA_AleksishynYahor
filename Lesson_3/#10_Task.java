// 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Task_10 {

    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 1, 0, 0, 1, 1, 0}; // Можно изменять заданный массив

        System.out.println("Исходный массив:");
        printArray(array); // Вывод исходного массива
        System.out.println(); // Переход на новую строку

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;  // Замена 0 на 1
            } else {
                array[i] = 0;  // Замена 1 на 0
            }
        }

        System.out.println("Измененный массив:");
        printArray(array); // Вывод измененного массива
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

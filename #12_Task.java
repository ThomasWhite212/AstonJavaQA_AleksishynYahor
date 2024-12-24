// 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class Task_12 {

    public static void main(String[] args) {
        // Исходный массив
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        printArray(array);
        System.out.println(); // Вывод исходного массива

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;  // Умножение на 2, если число меньше 6
            }
        }
        // Вывод измененного массива
        System.out.println("Измененный массив:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

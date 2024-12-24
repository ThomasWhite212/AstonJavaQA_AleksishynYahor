// 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.


public class Task_14 {

    public static void main(String[] args) {

        int len = 7; // Можно изменять длинну массива
        int initialValue = 666; // Можно изменять значение для каждого элемента

        int[] array = createArray(len, initialValue);

        printArray(array);
    }

    public static int[] createArray(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

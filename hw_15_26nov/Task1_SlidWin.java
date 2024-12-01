package de.telran.hw_15_26nov;

public class Task1_SlidWin {
    // 1 уровень сложности: 1) СКОЛЬЗЯЩЕЕ ОКНО
    //Дан массив целых чисел размера «n», наша цель — вычислить минимальную сумму «k» последовательных элементов в массиве.
    //
    //Ввод: arr[] = {10, 20, 30, 40}, k = 2
    //Вывод: 30
    //
    //Вход: arr[] = {1, 45, 2, 10, 23, 3, 1, 0, 20}, k = 4
    //Выход: 24
    //Мы получаем минимальную сумму, добавляя подмассив {3, 1, 0, 20} размера 4.

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {1, 45, 2, 10, 23, 3, 1, 0, 20};

        System.out.println(" Для {10, 20, 30, 40}, k=2   Миним.сумма = " + getMinSumWin(arr1, 2));
        System.out.println(" Для {1, 45, 2, 10, 23, 3, 1, 0, 20}, k = 4    Миним.сумма = " + getMinSumWin(arr2, 4));

    }

    public static int getMinSumWin(int[] arr, int k) {
        int length = arr.length;
        if (length < k) {
            System.out.println(" Длина массива меньше размера Окна");
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int windowSum = sum;
        for (int i = k; i < length; i++) {
            windowSum += arr[i] - arr[i - k];
            sum = Math.min(sum, windowSum);
        }
        return sum;
    }

}

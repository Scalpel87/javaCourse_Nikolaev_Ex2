import java.util.Arrays;

/**
 * Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.
 * 1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
 * 2.Напишите программу, которая выводит все двузначные числа массива.
 * 3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
 * 4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
 * 5.***Напишите программу, которая переворачивает массив в обратном порядке.
 *
 * @author     Sergey Nikolaev
 */

public class HomeWork1 {
    public static void main(String[] args) {
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};
        System.out.print("Являются чётными числами: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.print(array[i] + " ");
        }
        System.out.print("\nВсе двузначные числа массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) System.out.print(array[i] + " ");
        }
        System.out.print("\nНаибольшее число массива: ");
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.print(max + "\nСумма элементов массива: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int[] mirror = new int[array.length];
        int count = 0;
        for (int i = array.length-1; i >= 0; i--) {
            mirror[count] = array[i];
            count++;
        }
        System.out.print(sum + "\nМассив в обратном порядке: " + Arrays.toString(mirror));
    }
}

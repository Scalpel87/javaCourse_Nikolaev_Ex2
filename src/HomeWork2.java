import java.util.Arrays;
import java.util.Scanner;

/**
 * С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
 * 1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
 * 2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
 * 3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
 * 4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.
 * 5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.
 *
 * @author     Sergey Nikolaev
 */
public class HomeWork2 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Введите значение для " + (i+1) + " строки, " + (j+1) + " столбца");
                array[i][j] = scr.nextInt();
            }
        }
        System.out.println("\nДвумерный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nНомера строк и суммы их элементов:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + (i+1) + ": ");
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("\nНомера столбцов и суммы их элементов:");
        for (int j = 0; j < array[0].length; j++) {
            System.out.print("Column " + (j+1) + ": ");
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("\nВсе нечётные элементы массива заменены на 1, а чётные на 0:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) System.out.print("0 ");
                    else System.out.print("1 ");
            }
            System.out.println();
        }
        System.out.println("\nЦелое среднее арифметическое каждой строки:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + (i+1) + ": ");
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println(sum/array[i].length);
        }
        int[] arrayTemp = new int[array.length*array[0].length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTemp[count] = array[i][j];
                count++;
            }
        }
        count = 0;
        int[] mirror = new int[arrayTemp.length];
        for (int i = arrayTemp.length-1; i >= 0; i--) {
            mirror[count] = arrayTemp[i];
            count++;
        }
        System.out.println("\nПеревёрнутый одномерный массив из исходного:\n" + Arrays.toString(mirror));
        scr.close();
    }
}

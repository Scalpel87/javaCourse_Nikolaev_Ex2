import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scr = new Scanner(System.in);
        int choise = scr.nextInt();

        switch (choise){
            case 1:
                System.out.println("F");
            case 2:
                System.out.println("T");
            default:
                System.out.println("E");
        }
    }
}
/*
1234
9874
3211
 */
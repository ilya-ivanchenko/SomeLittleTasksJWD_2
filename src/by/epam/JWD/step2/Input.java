package  by.epam.JWD.step2;

import java.util.Random;
import java.util.Scanner;

public class Input {

    public int inputRandom() {
        int number;
        Random random = new Random();
        number = random.nextInt(10);
        return number;
    }

    public int[] inputScannerArray() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Вводите только целые числа: ");
        }
        int s = sc.nextInt();
        int arr[] = new int[s];

        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите "  + i  + " элемент массива: ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print("Вводите только целые числа: ");
            }
            arr[i]  = sc.nextInt();
        }
        return  arr;
    }

    public int[][] inputScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы n*n: ");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Вводите только целые числа: ");
        }
        int s = sc.nextInt();
        int array[][] = new int[s][s];
        return array;
       // System.out.println();
    }
}
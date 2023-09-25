package baitap.baitap3;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = gennaralRandomAray(10000);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(Arrays.toString(selectionSort(arr)));
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }

    public static int[] gennaralRandomAray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

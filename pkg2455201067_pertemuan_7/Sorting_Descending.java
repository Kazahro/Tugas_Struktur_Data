/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_7;

/**
 *
 * @author WINDOWS
 */
public class Sorting_Descending {

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] < key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] > a[max]) max = j;
            int temp = a[i]; a[i] = a[max]; a[max] = temp;
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] < a[j + 1]) {
                    int temp = a[j]; a[j] = a[j + 1]; a[j + 1] = temp;
                }
    }

    public static void print(String name, int[] a) {
        System.out.print(name + ": ");
        for (int n : a) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {4, 10, 5, 7, 11};

        int[] a = data.clone();
        insertionSort(a);
        print("Insertion", a);

        int[] b = data.clone();
        selectionSort(b);
        print("Selection", b);

        int[] c = data.clone();
        bubbleSort(c);
        print("Bubble   ", c);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author WINDOWS
 */
public class Sort_Nama {
    public static void main(String[] args) {
        String[] nama = {"Zara", "Andi", "Rina", "Budi", "Tono", "Citra", "Eka"};

        // Insertion Sort
        String[] insertion = nama.clone();
        for (int i = 1; i < insertion.length; i++) {
            String key = insertion[i];
            int j = i - 1;
            while (j >= 0 && insertion[j].compareTo(key) > 0) {
                insertion[j + 1] = insertion[j];
                j--;
            }
            insertion[j + 1] = key;
        }
        System.out.println("Insertion Sort:");
        tampil(insertion);

        // Selection Sort
        String[] selection = nama.clone();
        for (int i = 0; i < selection.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < selection.length; j++) {
                if (selection[j].compareTo(selection[min]) < 0) {
                    min = j;
                }
            }
            String temp = selection[i];
            selection[i] = selection[min];
            selection[min] = temp;
        }
        System.out.println("Selection Sort:");
        tampil(selection);

        // Bubble Sort
        String[] bubble = nama.clone();
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - 1 - i; j++) {
                if (bubble[j].compareTo(bubble[j + 1]) > 0) {
                    String temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort:");
        tampil(bubble);
    }

    static void tampil(String[] data) {
        for (String nama : data)
            System.out.print(nama + " ");
        System.out.println();
    }
}
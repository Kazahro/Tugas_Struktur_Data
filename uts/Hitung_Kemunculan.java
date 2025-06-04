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
public class Hitung_Kemunculan {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};
        boolean[] sudahDihitung = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!sudahDihitung[i]) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        sudahDihitung[j] = true;
                    }
                }
                System.out.println("Nomor " + array[i] + " muncul sebanyak " + count + " kali.");
            }
        }
    }
}
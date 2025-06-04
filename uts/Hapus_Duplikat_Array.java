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
public class Hapus_Duplikat_Array {
    public static void main(String[] args) {
        int[] angka = {1, 2, 2, 3, 4, 4, 5};
        int jumlahUnik = 0;

        for (int i = 0; i < angka.length; i++) {
            int j;
            for (j = 0; j < jumlahUnik; j++) {
                if (angka[i] == angka[j]) {
                    break;
                }
            }
            if (j == jumlahUnik) {
                angka[jumlahUnik] = angka[i];
                jumlahUnik++;
            }
        }

        for (int i = 0; i < jumlahUnik; i++) {
            System.out.print(angka[i]);
            if (i < jumlahUnik - 1) System.out.print(", ");
        }
    }
}

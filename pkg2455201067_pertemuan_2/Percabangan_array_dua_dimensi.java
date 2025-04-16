/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_2;

/**
 *
 * @author WINDOWS
 */
public class Percabangan_array_dua_dimensi {
    public static void main(String[] args) {
        int[][] nilai = {
            {80, 70, 90},
            {60, 40, 50},
            {85, 90, 95}
        };

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa " + (i + 1) + ":");

            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] >= 75) {
                    System.out.println("  Mata pelajaran " + (j + 1) + ": Lulus (" + nilai[i][j] + ")");
                } else {
                    System.out.println("  Mata pelajaran " + (j + 1) + ": Tidak Lulus (" + nilai[i][j] + ")");
                }
            }

            System.out.println();
        }
    }
}

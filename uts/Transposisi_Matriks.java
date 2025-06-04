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
public class Transposisi_Matriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks awal:");
        cetak(matriks);

        int[][] transpose = new int[3][3];
        
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                transpose[j][i] = matriks[i][j];

        System.out.println("\nHasil transposisi:");
        cetak(transpose);
    }

    public static void cetak(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}

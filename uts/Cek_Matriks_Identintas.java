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
public class Cek_Matriks_Identintas {
    public static void main(String[] args) {
        int[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if ((i == j && m[i][j] != 1) || (i != j && m[i][j] != 0)) {
                    System.out.println("Bukan matriks identitas.");
                    return;
                }

        System.out.println("Matriks identitas.");
    }
}
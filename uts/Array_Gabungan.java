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
public class Array_Gabungan {
   public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] gabungan = {
            array1[0], array1[1], array1[2], array1[3], array1[4],
            array2[0], array2[1], array2[2], array2[3], array2[4]
        };

        System.out.print("Array gabungan: [");
        for (int i = 0; i < gabungan.length; i++) {
            System.out.print(gabungan[i]);
            if (i != gabungan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
   }
}
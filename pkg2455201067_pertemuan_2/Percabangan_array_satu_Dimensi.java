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
public class Percabangan_array_satu_Dimensi {
    public static void main(String[] args) {
        int[] nilai = {85, 70, 40, 90, 60};

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 75) {
                System.out.println("Nilai " + nilai[i] + ": Lulus");
            } else {
                System.out.println("Nilai " + nilai[i] + ": Tidak Lulus");
            }
        }
    }
}

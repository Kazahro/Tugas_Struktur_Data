/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_2;

import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class Percabangan_WHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 1;

        while (angka <= 10) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah angka genap");
            } else {
                System.out.println(angka + " adalah angka ganjil");
            }
            angka++;
        }
    }
}

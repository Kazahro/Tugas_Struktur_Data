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
public class Percabangan_D0_WHILE {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;

        do {
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            if (angka % 2 == 0) {
                System.out.println(angka + " adalah angka genap");
            } else {
                System.out.println(angka + " adalah angka ganjil");
            }

            System.out.print("Ulangi? (ya/tidak): ");
            input.nextLine();
            ulangi = input.nextLine();

        } while (ulangi.equalsIgnoreCase("ya"));

        System.out.println("Program selesai!");
    }
} 

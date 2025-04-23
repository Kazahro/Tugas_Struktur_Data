/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_4;

/**
 *
 * @author WINDOWS
 */
public class Method_Fungsi_Parameter {
    public static void main(String[] args) {
        
        int sisiKubus = 4;
        double alasSegitiga = 6;
        double tinggiSegitiga = 8;

        int volume = hitungVolumeKubus(sisiKubus);
        double luas = hitungLuasSegitiga(alasSegitiga, tinggiSegitiga);

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas segitiga: " + luas);
    }
    public static int hitungVolumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}

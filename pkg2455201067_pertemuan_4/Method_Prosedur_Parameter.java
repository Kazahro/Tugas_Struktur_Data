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
public class Method_Prosedur_Parameter {
    public static void main(String[] args) {
        float hargaBarang = 100000;
        float diskon = 10;

        float totalBayar = (float) hitungTotal(hargaBarang, diskon);

        System.out.println("Harga Awal   : Rp" + hargaBarang);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Total Bayar  : Rp" + totalBayar);
    }
    public static double hitungTotal(double harga, double diskonPersen) {
        double diskon = harga * (diskonPersen / 100);
        return harga - diskon;
    }
}

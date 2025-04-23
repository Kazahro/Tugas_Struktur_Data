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
public class contoh_Method {
    public static void main(String[] args) {
        
        contoh_Method contoh = new contoh_Method();
        contoh.luasLingkaranProsedur();
        contoh.luasLingkaranFungsi();
    }
    
    //cara pertama membuat method
    //Method Prosedur
    //Ditandai dengan awalan Void
    
    void luasLingkaranProsedur (){
        double jari2 = 10;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        System.out.println("Luas Lingkaran Pakai Method Prosedur = " + luas);
    }
    
    //cara kedua
    //Membuat method dengan Fungsi
    //Ditandai dengan nilai balik "return" dan diawali dengan tipe data
    
    double luasLingkaranFungsi (){
        float jari2 = 15;
        float phi = (float) 3.14;
        float luas = phi*jari2*jari2;
        System.out.println("Luas Lingkaran Pakai Method Fungsi = " + luas);
        return luas;
    }
}

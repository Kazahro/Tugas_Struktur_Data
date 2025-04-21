/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201064_pertemuan_3;

/**
 *
 * @author WINDOWS
 */
public class PBO_Bangun_Datar {
    
    public static void main(String[] args) {
      
        //Desklarasi Objek Lingkaran dari Class Master Bangun Datar
        PBO_Master_Bangun_Datar Lingkaran = new PBO_Master_Bangun_Datar();
        Lingkaran.luasLingkaran = Lingkaran.phi * Lingkaran.jari2 * Lingkaran.jari2;
        System.out.println("Luas Lingkaran" + Lingkaran.luasLingkaran);
        
        //Deklarasi Objek Persegi Dari Class Master Bangun Dater
        PBO_Master_Bangun_Datar Persegi = new PBO_Master_Bangun_Datar();
        Persegi.luasPersegi = Persegi.sisi * Persegi.sisi;
        System.out.println("Luas Persegi " + Persegi.luasPersegi);
        
        PBO_Master_Bangun_Datar tes = new PBO_Master_Bangun_Datar();
    }
    
}

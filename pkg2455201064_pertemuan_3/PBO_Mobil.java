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
public class PBO_Mobil {
    public static void main(String[] args) {
        Master_BPO_Mobil sedan = new Master_BPO_Mobil();
        sedan.karakteristrik = "kenyamanan, desainBody" ;
        sedan.merkMobil = "suzuki" ;
        sedan.tahunPembuatan = "2000" ;
        sedan.warnaMobil = "Putih" ;
        
        System.out.println("1. mobil sedan");
        System.out.println("karakteristrik = " + sedan.karakteristrik);
        System.out.println("merkMobil = " + sedan.merkMobil);
        System.out.println("tahunPembuatan = " + sedan.tahunPembuatan);
        System.out.println("warnaMobil = " + sedan.warnaMobil);
        
        sedan.jalan();
        sedan.berhenti();
    }
}

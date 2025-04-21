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
public class PBO_Player {
    public static void main(String[] args) {
        
        Master_PBO_Player Petani = new Master_PBO_Player();
        Petani.nama = "Andi ";
        Petani.kecepatan = 10 ;
        Petani.poinKesehatan = 0 ;
        Petani.lari();

        if (Petani.sudahMati()) {
            System.out.println(Petani.nama + " sudah mati.");
        } else {
            System.out.println(Petani.nama + " masih hidup.");
        }
    }}
    

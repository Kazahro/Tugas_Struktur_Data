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
public class Master_PBO_Player {
    
   String nama;
   int kecepatan;
   int poinKesehatan;
   
   void lari() {
       System.out.println(nama + "sedang berlari");
       System.out.println(poinKesehatan + " kecepatan");
   }
   boolean sudahMati(){
       return poinKesehatan <= 0;
       
   }
}

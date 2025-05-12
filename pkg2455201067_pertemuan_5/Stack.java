/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_5;

/**
 *
 * @author WINDOWS
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stack = new String[5];
        int top = -1;

        stack[++top] = "Matematika Diskrit";
        stack[++top] = "Struktur Data";
        stack[++top] = "Sistem Digital";

        System.out.println("Mata kuliah hari ini:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

        System.out.println("\nMata kuliah untuk matkul pertama : " + stack[top--]);

        System.out.println("Setelah :");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }  
}
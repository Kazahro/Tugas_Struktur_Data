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
    import java.util.Stack;
import java.util.Scanner;

public class Studikasus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String[] kataArray = kalimat.split(" ");

        System.out.println("Hasil kata yang dibalik:");
        for (String kata : kataArray) {
            System.out.print(balikKata(kata) + " ");
        }
    }
    
    public static String balikKata(String kata) {
        Stack<Character> stack = new Stack<>();

        for (char c : kata.toCharArray()) {
            stack.push(c);
        }

        StringBuilder hasil = new StringBuilder();
        while (!stack.isEmpty()) {
            hasil.append(stack.pop());
        }

        return hasil.toString();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_6;

/**
 *
 * @author WINDOWS
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_library {

    public static void main(String[] args) {
        
        // QUEUE (Antrian) dengan Library
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        
        System.out.println("Queue: " + queue);
        System.out.println("Hapus dari queue: " + queue.poll());
        System.out.println("Queue sekarang: " + queue);

        System.out.println();

        // STACK (Tumpukan) dengan Library
        Stack<String> stack = new Stack<>();
        stack.push("X");
        stack.push("Y");
        stack.push("Z");
        
        System.out.println("Stack: " + stack);
        System.out.println("Hapus dari stack: " + stack.pop());
        System.out.println("Stack sekarang: " + stack);
    }
}
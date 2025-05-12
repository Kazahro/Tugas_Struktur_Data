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
   import java.util.Stack;

public class Queue_manual {
    public static void main(String[] args) {

        // QUEUE MANUAL
        String[] queue = new String[5];
        int front = 0, rear = 0;

        // Tambah ke queue
        queue[rear++] = "A";
        queue[rear++] = "B";
        queue[rear++] = "C";

        // Tampilkan queue
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();

        // Hapus dari queue (dequeue 1 data)
        System.out.println("Hapus dari queue: " + queue[front++]);

        // Tampilkan queue setelah dequeue
        System.out.print("Queue sekarang: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();

        System.out.println();

        // STACK (pakai library)
        Stack<String> stack = new Stack<>();
        stack.push("X");
        stack.push("Y");
        stack.push("Z");

        System.out.println("Stack: " + stack);
        System.out.println("Hapus dari stack: " + stack.pop());
        System.out.println("Stack sekarang: " + stack);
    }
}

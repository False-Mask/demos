package com.example.multi_thread;

public class Orderliness {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            int[] arr = new int[4];
            Thread t1 = new Thread(() -> {

                arr[0] = arr[3];
                arr[1] = 1;
            });

            Thread t2 = new Thread(() -> {
                arr[2] = arr[1];
                arr[3] = 1;
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            if (arr[0] == 1 && arr[2] == 1) {
                System.out.println("reorder happened!");
            }
        }

    }

}

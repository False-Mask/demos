package com.example.multi_thread;

public class Visibility {

    static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            while (flag);
        }).start();

        Thread.sleep(1000);
        flag = false;

    }

}
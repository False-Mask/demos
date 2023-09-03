package com.example.asm.clz;

public class VisitJumpInsnTest {

    public static void main(String[] args) {
        int a = 0;
        if(a == 1) {
            System.out.println("Hello World");
        }

        Integer i = null;
        Integer one = Integer.valueOf(1);
        if(i == one) {
            System.out.println("Hello World");
        }



    }

}


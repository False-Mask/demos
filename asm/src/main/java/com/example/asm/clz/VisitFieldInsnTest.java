package com.example.asm.clz;

public class VisitFieldInsnTest {

    public static int STATIC_FIELD = 1;

    int memberField = 1;

    public static void main(String[] args) {

        STATIC_FIELD = 0;

        new VisitFieldInsnTest().memberField = 0;


    }

}

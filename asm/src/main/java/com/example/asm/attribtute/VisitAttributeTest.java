package com.example.asm.attribtute;


import com.example.asm.annotation.anno.RuntimeAnnotation;

@RuntimeAnnotation
public class VisitAttributeTest {


    private int a = 0;
    private boolean b = false;

    public static void a() {
        for(int i = 0;i < 100; i++) {
            System.out.println("Hello World");
        }
    }

    class A {

    }


}

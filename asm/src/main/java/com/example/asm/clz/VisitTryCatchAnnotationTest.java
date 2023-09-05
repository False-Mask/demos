package com.example.asm.clz;

public class VisitTryCatchAnnotationTest {

    public static void a() {
        try {
            int a = 1/0;
        } catch (@AnnotationTest Exception e) {

        }
    }

}

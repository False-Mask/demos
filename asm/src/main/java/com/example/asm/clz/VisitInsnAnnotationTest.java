package com.example.asm.clz;

public class VisitInsnAnnotationTest {

    public static void a() {
        @AnnotationTest int a = 0;
        @AnnotationTest Integer b = 1;
        VisitInsnAnnotationTest i = new @AnnotationTest VisitInsnAnnotationTest();

    }

}

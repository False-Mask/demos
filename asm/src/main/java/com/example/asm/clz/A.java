package com.example.asm.clz;

public class A {

    public static class B {

        public static class C {

            public static class D {

                public static void d() {
                    class E {

                    }

                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("Hello world");
                        }
                    }.run();
                }

            }
        }

    }
}

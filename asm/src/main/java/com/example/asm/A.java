package com.example.asm;

public class A {

    static class B {

        static class C {

            static class D {

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

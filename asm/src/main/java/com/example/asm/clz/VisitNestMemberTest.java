package com.example.asm.clz;

public class VisitNestMemberTest {

    class A {
        class C {

        }
    }

    static class B {
        class D {

        }

        static class E {

            void main() {
                class F {

                }
            }

        }
    }

}

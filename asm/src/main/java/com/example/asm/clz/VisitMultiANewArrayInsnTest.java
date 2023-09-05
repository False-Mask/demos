package com.example.asm.clz;

public class VisitMultiANewArrayInsnTest {

    public static void main(String[] args) {
        a();
    }


    public static void a() {
        int[][][] a = new int[10][10][];
        a[0][0] = new int[]{12,3,34,23,45,234,5234};
        a[0][1] = new int[]{1,2};
        System.out.println(a[0][0]);
    }

}

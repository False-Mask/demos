package com.example.test_internal;

import com.example.internal.MyClass;

public class T {

    public static void main(String[] args) {

        MyClass.test();

        MyClass m = new MyClass();

        m.setInternalX$internal(10);

        System.out.println(m.getInternalX$internal());

        m.internalA$internal();

    }

}

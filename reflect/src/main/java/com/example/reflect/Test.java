package com.example.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {

        Class<ReflectionTest> clz = ReflectionTest.class;
        Method a = clz.getDeclaredMethod("a");
        a.setAccessible(true);
        ReflectionTest test = new ReflectionTest();


        long relectionTime = measure(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    a.invoke(test);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println("反射耗时：");
        System.out.println("总耗时：" + relectionTime);
        System.out.println("单次耗时：" + relectionTime * 1.0 / Integer.MAX_VALUE);

        long invoke = measure(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    a.invoke(test);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println("直接调用");
        System.out.println("总耗时：" + invoke);
        System.out.println("单次耗时：" + invoke * 1.0 / Integer.MAX_VALUE);


        Thread.sleep(Long.MAX_VALUE);


    }

    public static long measure(Runnable r) {
        long begin = System.currentTimeMillis();
        r.run();
        return System.currentTimeMillis() - begin;
    }

}


class ReflectionTest {
    private void a() {
        int b = 1 + 1;
    }

    public void b() {
        int a = 1 + 1;
    }

}
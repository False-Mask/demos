package com.example.aspectj.aop;

import android.util.Log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LogAspecjTest {

    private static String TAG = "LogAspectj";

//    @Before("execution(* androidx.appcompat.app.AppCompatActivity.AppCompatActivity+.onCreate(..))")
    @Before("execution(* android.app.Activity+.onCreate(..))")
    public void log() {
        Log.e(TAG, "log ......");
    }

}

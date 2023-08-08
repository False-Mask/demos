package com.example.asm.clz;

import com.example.asm.annotation.anno.TypeCountAnno;

public class VisitMethodParamCount {

    public void a1(@TypeCountAnno boolean a) {

    }

    public void a2(@TypeCountAnno boolean a, byte b) {

    }

    public void a3(@TypeCountAnno boolean a,byte b,short c) {

    }

    public void a4(@TypeCountAnno boolean a,byte b,short c,int d) {

    }

    @TypeCountAnno
    public void t1( String a) {

    }

}

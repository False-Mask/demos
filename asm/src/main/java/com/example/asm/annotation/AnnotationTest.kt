package com.example.asm.annotation

import com.example.asm.annotation.anno.Meta
import com.example.asm.annotation.anno.NestedAnnotation
import com.example.asm.annotation.anno.PrimaryAnnotation

@PrimaryAnnotation(
    b = false,
    s = 1,
    i = 2,
    l = 3,
    f = 4f,
    d = 5.0
)

@NestedAnnotation(
    nested = Meta(),
    primary = PrimaryAnnotation(
        b = true,
        s = 1,
    )
)
class AnnotationTest {

    var x = 1

}
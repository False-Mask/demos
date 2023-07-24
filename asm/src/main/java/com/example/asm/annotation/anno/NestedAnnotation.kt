package com.example.asm.annotation.anno

annotation class NestedAnnotation(
    val nested: Meta = Meta(),
    val primary: PrimaryAnnotation = PrimaryAnnotation(
        b = false,
        s = 1,
        i = 2,
        l = 3,
        f = 4f,
        d = 5.0
    )
)

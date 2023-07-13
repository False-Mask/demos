package com.example.coroutine

import kotlinx.coroutines.delay
import kotlin.concurrent.thread
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun a() {
    delay(1)
}


suspend fun b() {
    a()
    delay(1000)
    a()
    a()
}

suspend fun testSuspend() = suspendCoroutine<Int> {
    thread {
        Thread.sleep(1000)
        it.resume(10)
    }
}
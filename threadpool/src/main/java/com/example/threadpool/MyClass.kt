package com.example.threadpool

import java.util.concurrent.Executors
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

fun main() {

    var newFixedThreadPool = Executors.newFixedThreadPool(1)
        .apply {

        }

    ThreadPoolExecutor(1,10,1L,TimeUnit.MINUTES, SynchronousQueue())
        .apply {
        }

    newFixedThreadPool.execute {

    }

}
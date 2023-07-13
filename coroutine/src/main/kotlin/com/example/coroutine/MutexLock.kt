package com.example.coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex

suspend fun main() {

    val mtx = Mutex()

    val coroutineScope = CoroutineScope(Dispatchers.IO)



    repeat(1000) {


        coroutineScope.launch {

            println(Thread.currentThread().hashCode())



        }



    }

    Thread.sleep(10000)

    Dispatchers.Default

    coroutineScope.coroutineContext.job.join()
}
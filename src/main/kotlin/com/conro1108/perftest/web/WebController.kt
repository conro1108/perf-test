package com.conro1108.perftest.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList
import kotlin.random.Random
import kotlin.system.measureTimeMillis

@RestController
class WebController {

    @GetMapping("/arrayList/{count}")
    fun arrayListInsert(@PathVariable count: Int): String {
        val list = ArrayList<Int>()

        val execTime = measureTimeMillis {
            repeat(count) {
                list.add(Random.nextInt())
            }
        }

        return "Inserted " + count + " Ints into ArrayList in " + execTime + "ms"
    }

    @GetMapping("/mutableList/{count}")
    fun mutableListInsert(@PathVariable count: Int): String {
        val list = mutableListOf<Int>()

        val execTime = measureTimeMillis {
            repeat(count) {
                list.add(Random.nextInt())
            }
        }

        return "Inserted " + count + " Ints into MutableList in " + execTime + "ms"
    }
}
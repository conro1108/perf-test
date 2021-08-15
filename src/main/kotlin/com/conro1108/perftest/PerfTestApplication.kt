package com.conro1108.perftest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PerfTestApplication

fun main(args: Array<String>) {
	runApplication<PerfTestApplication>(*args)
}

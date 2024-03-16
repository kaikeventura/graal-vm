package com.kaikeventura.graalvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraalVmApplication

fun main(args: Array<String>) {
	runApplication<GraalVmApplication>(*args)
}

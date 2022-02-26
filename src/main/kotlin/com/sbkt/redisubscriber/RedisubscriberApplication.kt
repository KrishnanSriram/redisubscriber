package com.sbkt.redisubscriber

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisubscriberApplication

fun main(args: Array<String>) {
	runApplication<RedisubscriberApplication>(*args)
}

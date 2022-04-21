package com.inventorymanagement.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TestApplication

fun main(args: Array<String>) {
	runApplication<TestApplication>(*args)
}

data class Message(val id: String, val message: String)

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello"),
		Message("2", ","),
		Message("3", "World")
	)
}

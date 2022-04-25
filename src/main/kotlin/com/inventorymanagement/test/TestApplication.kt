package com.inventorymanagement.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class TestApplication

fun main(args: Array<String>) {
	runApplication<TestApplication>(*args)
}

package com.inventorymanagement.test.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("Customers")
data class Customer(val id: String?, val name: String, val age: Int, val address: Array<String>, val email: String)
package com.inventorymanagement.test.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("Inventory")
data class Inventory(val id: String?, val name: String, val price: Double, val quantity: Int)
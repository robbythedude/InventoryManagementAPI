package com.inventorymanagement.test.repo

import com.inventorymanagement.test.model.Inventory
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface InventoryRepository: MongoRepository<Inventory, String> {

    @Query("{id: '?0'}")
    fun getInventoryByID(id: String): Inventory?

}
package com.inventorymanagement.test.service

import com.inventorymanagement.test.model.Inventory
import com.inventorymanagement.test.repo.InventoryRepository
import org.springframework.stereotype.Service

@Service("inventoryService")
class InventoryService(val database: InventoryRepository) {

    fun getAllInventory(): List<Inventory> {
        return database.findAll()
    }

    fun getInventoryByID(id: String): Inventory? {
        return database.getInventoryByID(id)
    }

    fun saveInventory(inventory: Inventory) {
        database.save(inventory)
    }

}
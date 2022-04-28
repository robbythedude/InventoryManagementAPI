package com.inventorymanagement.test.controller

import com.inventorymanagement.test.model.Inventory
import com.inventorymanagement.test.service.InventoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class InventoryController(val inventoryService: InventoryService) {

    @GetMapping("/inventory")
    fun getAllInventory() : List<Inventory> = inventoryService.getAllInventory()

    @GetMapping("/inventory/{id}")
    fun getInventoryByID(@PathVariable id: String): Inventory? = inventoryService.getInventoryByID(id)

    @PostMapping("/inventory")
    fun saveInventory(@RequestBody body: Inventory) = inventoryService.saveInventory(body)

}
package com.inventorymanagement.test.controller

import com.inventorymanagement.test.model.Customer
import com.inventorymanagement.test.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val customerService: CustomerService) {

    @GetMapping("/customer")
    fun getAllCustomers(): List<Customer> = customerService.getAllCustomers()

    @GetMapping("/customer/{id}")
    fun getCustomerByID(@PathVariable id: String): Customer? = customerService.getCustomerByID(id)

    @PostMapping("/customer")
    fun createCustomer(@RequestBody customer: Customer) {
        customerService.createCustomer(customer)
    }

}
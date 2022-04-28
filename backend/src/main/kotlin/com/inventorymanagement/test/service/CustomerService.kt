package com.inventorymanagement.test.service

import com.inventorymanagement.test.repo.CustomerRepository
import com.inventorymanagement.test.model.Customer
import org.springframework.stereotype.Service

@Service("customerService")
class CustomerService(val database: CustomerRepository) {

    fun getAllCustomers(): List<Customer> {
       return database.findAll()
    }

    fun getCustomerByID(id: String): Customer? = database.getCustomerByID(id)

    fun createCustomer(customer: Customer) {
        database.save(customer)
    }
}
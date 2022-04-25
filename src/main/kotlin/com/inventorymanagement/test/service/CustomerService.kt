package com.inventorymanagement.test.service

import com.inventorymanagement.test.repo.CustomerRepository
import com.inventorymanagement.test.model.Customer
import org.springframework.stereotype.Service

@Service("customerService")
class CustomerService(val dataBase: CustomerRepository) {

    fun getAllCustomers(): List<Customer> {
       return dataBase.findAll()
    }

    fun getCustomerByID(id: String): Customer? = dataBase.getCustomerByID(id)

    fun createCustomer(customer: Customer) {
        dataBase.save(customer)
    }
}
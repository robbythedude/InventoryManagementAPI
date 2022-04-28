package com.inventorymanagement.test.repo

import com.inventorymanagement.test.model.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<Customer, String> {

    @Query("{id: '?0'}")
    fun getCustomerByID(id: String): Customer?

}
package com.itmo.microservices.demo.feed.api.model

data class ToyRequest(
        val id: Int,
        val name: String,
        val description: String,
        val count: Int,
        val cost: Int,
        val discount: Int,
        val country: String,
        val manufacturer: String,
        val vendorCode: Int
)
package com.itmo.microservices.demo.feed.api.model

import java.util.*

data class ToyResponse(
        val id: Int? = null,
        val name: String,
        val description: String,
        val count: Int,
        val cost: Int,
        val discount: Int,
        val country: String,
        val manufacturer: String,
        val vendorCode: Int
)
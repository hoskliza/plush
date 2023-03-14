package com.itmo.microservices.demo.cart.api.service

import com.itmo.microservices.demo.checkout.api.model.PickupPointsResult
import java.util.*

interface CartService {
    fun addToy(id: UUID)
    fun removeToy(id: UUID)
}
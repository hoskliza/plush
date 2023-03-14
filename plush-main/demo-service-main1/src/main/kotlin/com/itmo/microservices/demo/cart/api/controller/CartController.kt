package com.itmo.microservices.demo.cart.api.controller

import com.itmo.microservices.demo.checkout.api.model.PickupPointsResult
import com.itmo.microservices.demo.checkout.api.service.CartService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/cart")
class CartController(private val cartService: CartService) {
    @PostMapping("/addToy/{id}")
    fun addToy(@PathVariable toyId: UUID) { cartService.addToy(toyId) }

    @DeleteMapping("/removeToy/{id}")
    fun removeToy(@PathVariable toyId: UUID) { cartService.removeToy(toyId) }
}
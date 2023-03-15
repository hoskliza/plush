package com.itmo.microservices.demo.purchase.api.controller

import com.itmo.microservices.demo.purchase.api.model.PurchaseResult
import com.itmo.microservices.demo.purchase.api.model.PurchaseRequest
import com.itmo.microservices.demo.purchase.api.service.PurchaseService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/purchase")
class PurchaseController(private val purchaseService: PurchaseService) {
    @PostMapping("/{id}")
    fun initiatePurchase(@PathVariable purchaseID: UUID) { purchaseService.initiatePurchase(purchaseID) }

    @PutMapping("/{id}")
    fun cancelPurchase(@PathVariable purchaseID: UUID) { purchaseService.cancelPurchase(purchaseID) }

    @GetMapping("/{id}")
    fun getStatusPurchase(@PathVariable purchaseID: UUID) { purchaseService.getStatusPurchase(purchaseID)}
}
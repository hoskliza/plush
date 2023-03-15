package com.itmo.microservices.demo.purchase.api.service

import com.itmo.microservices.demo.purchase.api.controller.PurchaseController
import java.util.*
interface PurchaseService {
    fun initiatePurchase(id: UUID)
    fun cancelPurchase(id: UUID)
    fun getStatusPurchase(id: UUID)
}
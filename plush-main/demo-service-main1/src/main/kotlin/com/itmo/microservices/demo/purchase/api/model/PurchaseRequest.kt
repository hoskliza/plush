package com.itmo.microservices.demo.purchase.api.model

data class PurchaseRequest(
        val toy: Array<Cart>,
        val delivery: Boolean,
        val address: String,
        val dateTime: date,
        val onlinePayment: Boolean,
        val cardNumber: Int,
        val cardOwner: Int,
        val cvc: Int
)
package com.itmo.microservices.demo.feed.impl.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Toy {
    @Id
    @GeneratedValue
    var id: Int? = null
    var name: String = ""
    var description: String = ""
    var count: Int = 0
    var cost: Double = 0.0
    val discount: Int = 0
    val country: String = ""
    val manufacturer: String = ""
    val vendorCode: Int = 0
}
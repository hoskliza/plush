package com.itmo.microservices.demo.feed.api.model

data class ToyListResponse(
        val toys: Array<ToyResponse>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ToyListResponse

        if (!toys.contentEquals(other.toys)) return false

        return true
    }

    override fun hashCode(): Int {
        return toys.contentHashCode()
    }
}
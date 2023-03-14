package com.itmo.microservices.demo.feed.impl.service

import com.itmo.microservices.demo.feed.api.model.ToyResponse
import com.itmo.microservices.demo.feed.api.model.ToyListResponse
import com.itmo.microservices.demo.feed.api.service.FeedService
import com.itmo.microservices.demo.feed.impl.entity.Toy
import com.itmo.microservices.demo.feed.impl.repository.FeedRepository
import org.springframework.stereotype.Service

@Service
class DefaultFeedService(private val repository: FeedRepository): FeedService {
    override fun getPaperCatalog(): ToyListResponse {
        var toy = Toy()
        toy.name = "123"
        repository.save(toy)

        return ToyListResponse(arrayOf(ToyResponse(1, "123", "123", 1, 248, 499, "Chile", "Igrucio",444445)))
    }
}
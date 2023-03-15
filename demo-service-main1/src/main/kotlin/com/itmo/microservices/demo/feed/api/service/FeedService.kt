package com.itmo.microservices.demo.feed.api.service

import com.itmo.microservices.demo.feed.api.model.ToyListResponse;

interface FeedService {
    fun getPaperCatalog(): ToyListResponse
}
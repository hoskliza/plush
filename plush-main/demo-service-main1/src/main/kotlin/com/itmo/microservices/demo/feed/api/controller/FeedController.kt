package com.itmo.microservices.demo.feed.api.controller

import com.itmo.microservices.demo.feed.api.service.FeedService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/feed")
class FeedController(private val feedService: FeedService) {

    @GetMapping("/list_toy")
    fun getToyCatalog(): toyListResponse =
            feedService.getToyCatalog()
}

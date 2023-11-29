package com.project.reactive.controller

import com.project.reactive.service.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(
        private val greetingService: GreetingService
) {

    @GetMapping("/greet")
    suspend fun greet():String {
        return greetingService.greet()
    }

}
package com.project.reactive.service

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun greet() : String{
        println("Hello, world!")
        return "hello World"

    }

}

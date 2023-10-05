package com.example.kotlinmvc.contoller.get

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api") // localhost:8080/api
class GetApiContoller {

    @GetMapping("/hello") // localhost:8080/api/hello
    fun hello(): String {
        return "hello kotlin"
    }
}
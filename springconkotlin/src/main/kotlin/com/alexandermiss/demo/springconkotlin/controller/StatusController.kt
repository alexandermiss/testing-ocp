package com.alexandermiss.demo.springconkotlin.controller

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StatusController {

    @GetMapping(value= ["/status"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun status() : ResponseEntity<Any> {
        val resp : HashMap<String, String> = HashMap();
        resp["status"] = ":D";
        return ResponseEntity.ok(resp);
    }
}
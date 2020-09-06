package com.github.b1412.demo.controller

import com.github.b1412.demo.entity.User
import com.github.b1412.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController (
@Autowired
val service: UserService
){
@GetMapping
fun list(): ResponseEntity<*> {
return ResponseEntity.ok(service.findAll())
}

@PostMapping
fun add(@Validated user: User): ResponseEntity<*> {
return ResponseEntity.ok(service.add(user))
}
}

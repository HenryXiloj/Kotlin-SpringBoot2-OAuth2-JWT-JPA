package com.hxiloj.controller

import com.hxiloj.model.User
import com.hxiloj.service.UserService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/ws")
class UserController (private val userService: UserService){

    @GetMapping("/users")
    fun getAllUsers(): List<User> = userService.getAllUsers()
}
package com.hxiloj.service

import com.hxiloj.model.User


interface UserService {

    fun getAllUsers(): List<User>

}
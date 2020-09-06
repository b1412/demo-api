package com.github.b1412.demo.service

import com.github.b1412.demo.dao.UserDao
import com.github.b1412.demo.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService(
@Autowired
val dao: UserDao
){
fun findAll(): List<User> {
return dao.findAll()
}

fun add(user: User): User {
return dao.save(user)
}
}

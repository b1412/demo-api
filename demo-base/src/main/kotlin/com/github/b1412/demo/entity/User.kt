package com.github.b1412.demo.entity

import javax.persistence.Entity
import com.github.b1412.api.entity.BaseEntity
@Entity
data class User(
    var username: String? = null
) : BaseEntity()

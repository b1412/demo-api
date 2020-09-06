package com.github.b1412.cannon.controller

import org.hamcrest.Matchers.hasSize
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class UserControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `save and get user`() {
        val requestBody = """
           {
             "username":"test"
           }
        """
        mockMvc.perform(post("/user")
            .content(requestBody)
            .contentType(APPLICATION_JSON_VALUE))
            .andExpect(status().isOk)
        mockMvc.perform(get("/user"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.[*]", hasSize<Any>(1)))
    }
}

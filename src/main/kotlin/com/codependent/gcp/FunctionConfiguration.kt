package com.codependent.gcp

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.security.SecureRandom
import java.util.*

@Configuration
class FunctionConfiguration {

    private val random = SecureRandom()

    @Bean
    fun uppercase(): (String) -> String = { it.uppercase(Locale.getDefault()) }

    @Bean
    fun random(): (String) -> String = { "$it${random.nextDouble()}" }

}

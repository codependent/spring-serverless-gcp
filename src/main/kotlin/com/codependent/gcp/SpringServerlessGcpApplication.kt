package com.codependent.gcp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.security.SecureRandom
import java.util.*

@SpringBootApplication
class SpringServerlessGcpApplication{

    private val random = SecureRandom()

    @Bean
    fun uppercase(): (String) -> String = { it.uppercase(Locale.getDefault()) }

    @Bean
    fun random(): (String) -> String = { "$it${random.nextDouble()}" }

}

fun main(args: Array<String>) {
    runApplication<SpringServerlessGcpApplication>(*args)
}


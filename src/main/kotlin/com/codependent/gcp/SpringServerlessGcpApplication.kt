package com.codependent.gcp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class SpringServerlessGcpApplication

fun main(args: Array<String>) {
    runApplication<SpringServerlessGcpApplication>(*args)
}


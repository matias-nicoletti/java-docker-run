package com.matiasnicoletti.javadockerrun

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.system.exitProcess

@SpringBootApplication
class JavaDockerRunApplication : CommandLineRunner {

    @Value("\${param1}")
    private val param1: String? = null

    @Value("\${param2}")
    private val param2: String? = null

    override fun run(vararg args: String?) {
        println("STARTING THE APPLICATION")

        println("Hello World! jvm parameters: ${args.joinToString()}")

        println("Hello World! spring boot parameters: ${arrayOf(param1,param2).joinToString()}")

        println("APPLICATION FINISHED")

        exitProcess(0)
    }
}

fun main(args: Array<String>) {
    runApplication<JavaDockerRunApplication>(*args)
}

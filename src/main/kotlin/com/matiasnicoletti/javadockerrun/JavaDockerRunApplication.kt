package com.matiasnicoletti.javadockerrun

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.system.exitProcess

@SpringBootApplication
class JavaDockerRunApplication : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("STARTING THE APPLICATION")

        println("Hello World! parameters: ${args.joinToString()}")

        println("APPLICATION FINISHED")
        exitProcess(0)
    }
}

fun main(args: Array<String>) {
    runApplication<JavaDockerRunApplication>(*args)
}

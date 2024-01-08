package ru.vsu.cs.raspopov.coreservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoreServiceApplication

fun main(args: Array<String>) {
    runApplication<CoreServiceApplication>(*args)
}

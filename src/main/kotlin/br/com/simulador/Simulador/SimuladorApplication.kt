package br.com.simulador.Simulador

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimuladorApplication

fun main(args: Array<String>) {
    runApplication<SimuladorApplication>(*args)
}

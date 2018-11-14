package br.com.simulador.Simulador.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TesteController {

    @RequestMapping("/testeController")
    fun list(): String {
//        val user = User()
//        user.name = "Walter"
//        user.email = "vvaltim@gmail.com"
//        user.password = "123456ab"
        return "teste"
    }


}
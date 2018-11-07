package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.model.User
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TesteController {

    @RequestMapping("/TesteController")
    fun list(): User {
        val user = User()
        user.name = "Walter"
        user.email = "vvaltim@gmail.com"
        user.password = "123456ab"
        return user
    }


}
package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.model.ConciliationHearing
import br.com.simulador.Simulador.repository.ConciliationHearingRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ConciliationHearingController(val conciliationHearingRepository: ConciliationHearingRepository) {

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/conciliation/createOrUpdate")
    fun saveOrCreateConciliation(@RequestBody conciliationHearing: ConciliationHearing) : ConciliationHearing {
        return conciliationHearingRepository.save(conciliationHearing)
    }
}
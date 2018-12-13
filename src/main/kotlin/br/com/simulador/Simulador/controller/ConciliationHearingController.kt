package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.exception.TeacherNotFoundException
import br.com.simulador.Simulador.model.ConciliationHearing
import br.com.simulador.Simulador.repository.ConciliationHearingRepository
import javassist.NotFoundException
import org.springframework.web.bind.annotation.*

@RestController
class ConciliationHearingController(val conciliationHearingRepository: ConciliationHearingRepository) {

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/conciliation/createOrUpdate")
    fun saveOrCreateConciliation(@RequestBody conciliationHearing: ConciliationHearing) : ConciliationHearing {
        return conciliationHearingRepository.save(conciliationHearing)
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/conciliation/listByCodConciliation/{id}")
    fun getAllTeamByCodProf(@PathVariable id: Long): ConciliationHearing? {
        val result = conciliationHearingRepository.findById(id)
        return conciliationHearingRepository.findById(id).orElseThrow { TeacherNotFoundException() }
    }
}
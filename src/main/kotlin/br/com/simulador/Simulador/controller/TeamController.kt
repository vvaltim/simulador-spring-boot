package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.model.Team
import br.com.simulador.Simulador.repository.TeamRepository
import org.springframework.web.bind.annotation.*

@RestController
class TeamController(val teamRepository: TeamRepository) {
    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/team/allTeam/{id}")
    fun getAllTeamByCodProf(@PathVariable id: Long): List<Team> {
        val allTeam = teamRepository.findAll()
        return allTeam.filter { it.codTeacher == id && it.active }
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/team/create")
    fun createTeam(@RequestBody team: Team): Team {
        return teamRepository.save(team)
    }
}
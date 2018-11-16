package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.model.Team
import br.com.simulador.Simulador.repository.TeamRepository
import org.springframework.web.bind.annotation.*

@RestController
class TeamController(val teamRepository: TeamRepository) {
    @GetMapping("/team/allTeam/{id}")
    fun getAllTeamByCodProf(@PathVariable id: Long): List<Team> {
        val allTeam = teamRepository.findAll()
        return allTeam.filter { it.codTeacher == id }
    }

    @PostMapping("/team/create")
    fun createTeam(@RequestBody team: Team): Team {
        return teamRepository.save(team)
    }
}
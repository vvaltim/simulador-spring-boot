package br.com.simulador.Simulador.repository

import br.com.simulador.Simulador.model.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository: JpaRepository<Team, Long> {
}
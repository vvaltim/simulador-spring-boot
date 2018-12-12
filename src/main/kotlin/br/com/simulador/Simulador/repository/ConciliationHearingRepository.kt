package br.com.simulador.Simulador.repository

import br.com.simulador.Simulador.model.ConciliationHearing
import org.springframework.data.jpa.repository.JpaRepository

interface ConciliationHearingRepository : JpaRepository<ConciliationHearing, Long>
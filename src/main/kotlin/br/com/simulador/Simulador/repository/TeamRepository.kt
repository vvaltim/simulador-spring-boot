package br.com.simulador.Simulador.repository

import br.com.simulador.Simulador.model.Team
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface TeamRepository: JpaRepository<Team, Long>{
    @Query("SELECT t FROM Team t WHERE  t.codTeacher = :codTeacher AND t.active = :active")
    fun findTeamByCodTeacher(
            @Param("codTeacher") codTeacher: Long,
            @Param("active") active: Boolean
    ) : List<Team>
}
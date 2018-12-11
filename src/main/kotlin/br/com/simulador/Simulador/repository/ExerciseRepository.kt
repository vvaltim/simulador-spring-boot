package br.com.simulador.Simulador.repository

import br.com.simulador.Simulador.model.Exercise
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ExerciseRepository: JpaRepository<Exercise, Long> {

    //TODO:Adicionar os status que precisam de iteração do professor
    @Query("SELECT e FROM Exercise e WHERE  e.codTeacher = :codTeacher AND e.status = 2")
    fun findExerciseByCodTeacher(
            @Param("codTeacher") codTeacher: Long
    ): List<Exercise>
}
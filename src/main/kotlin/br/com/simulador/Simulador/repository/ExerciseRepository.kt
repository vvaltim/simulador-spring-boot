package br.com.simulador.Simulador.repository

import br.com.simulador.Simulador.model.Exercise
import org.springframework.data.jpa.repository.JpaRepository

interface ExerciseRepository: JpaRepository<Exercise, Long> {
}
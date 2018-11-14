package br.com.simulador.Simulador.repository

import br.com.simulador.Simulador.model.Teacher
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository: JpaRepository<Teacher, Long> {
}
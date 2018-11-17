package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "EXERCISE")
class Exercise {
    @Id
    @GeneratedValue
    @Column(name = "COD_EXERCISE", nullable = false)
    var codExercise: Long? = 0

    @Column(name = "COD_TEACHER", nullable = false)
    var codTeacher: Long? = 0

    @Column(name = "COD_TEAM", nullable = false)
    var codTeam: Long? = 0

    @Column(name = "CASE_DESCRIPTION", nullable = false)
    var caseDescription: String? = null
}
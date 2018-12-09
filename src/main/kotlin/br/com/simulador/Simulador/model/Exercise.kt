package br.com.simulador.Simulador.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
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

    @Column(name = "CASE_DESCRIPTION", nullable = false, length = 5000)
    var caseDescription: String? = null

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "DATE_CREATE", nullable = false)
    var dateCreate: Date? = null

    @Column(name = "STATUS", nullable = false)
    var status: Int? = null

    @Column(name = "INITIAL_PETITION", nullable = true, length = 5000)
    var initialPetition: String? = null

    @Column(name = "CORRECTION_INITIAL_PETITION", nullable = true, length = 5000)
    var correctionInitialPetition: String? = null

    @Column(name = "COD_CONCILIATION_HEARING", nullable = true)
    var codConciliationHearing: Long? = null

    @Column(name = "CONTESTATION", nullable = true, length = 5000)
    var contestation: String? = null

    @Column(name = "COD_SANITATION_PROCESS", nullable = true)
    var codSanitationProcess: Long? = null
}
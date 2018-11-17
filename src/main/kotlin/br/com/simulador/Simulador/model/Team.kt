package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "TEAM")
class Team {
    @Id
    @GeneratedValue
    @Column(name = "COD_TEAM")
    var codTeam: Long = 0

    @Column(name = "PERIOD", nullable = false)
    var period: Long = 0

    @Column(name = "YEAR", nullable = false)
    var year: Long = 0

    @Column(name = "SEMESTER", nullable = false)
    var semester: Long = 0

    @Column(name = "COD_TEACHER", nullable = false)
    var codTeacher: Long = 0

    @Column(name = "DISCIPLINE", nullable = false)
    var discipline: String? = ""

    @Column(name = "USERNAME", nullable = false)
    var username: String = ""

    @Column(name = "PASSWORD", nullable = false)
    var password: String = ""

    @Column(name = "ACTIVE", nullable = false)
    var active: Boolean = true

    //    @ManyToOne
//    @JoinColumn(name = "TEACHER", referencedColumnName = "TEACHER")
//    var codTeacher: Teacher? = null
}
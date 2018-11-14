package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "TEAM")
class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERIOD", nullable = false)
    var period: Long = 0

    @Column(name = "YEAR", nullable = false)
    var year: Long = 0

    @Column(name = "SEMESTER", nullable = false)
    var semester: Long = 0

    @Column(name = "COD_TEACHER", nullable = false)
    var codTeacher: Long = 0

//    @ManyToOne
//    @JoinColumn(name = "TEACHER", referencedColumnName = "TEACHER")
//    var codTeacher: Teacher? = null

    @Column(name = "USERNAME", nullable = false)
    var username: String = ""

    @Column(name = "PASSWORD", nullable = false)
    var password: String = ""

    @Column(name = "ACTIVE", nullable = false)
    var active: Boolean = true
}
package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "TEACHER")
class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_TEACHER", nullable = false)
    var codTeacher: Long? = 0

    @Column(name = "NAME", nullable = false)
    var name: String? = ""

    @Column(name = "EMAIL", nullable = false)
    var email: String? = ""

    @Column(name = "PASSWORD", nullable = false)
    var password: String? = ""
}
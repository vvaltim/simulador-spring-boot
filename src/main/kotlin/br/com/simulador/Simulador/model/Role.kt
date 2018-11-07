package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "role")
class Role {
    //regerente a autorização
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private val id: Int = 0

    @Column(name = "role")
    private val role: String? = null
}
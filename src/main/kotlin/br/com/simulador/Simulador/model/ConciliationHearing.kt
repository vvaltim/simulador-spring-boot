package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "CONCILIATION_HEARING")
class ConciliationHearing {
    @Id
    @GeneratedValue
    @Column(name = "COD_CONCILIATION_HEARING", nullable = true)
    var codConciliationHearing: Long? = null

    @Column(name = "")
}
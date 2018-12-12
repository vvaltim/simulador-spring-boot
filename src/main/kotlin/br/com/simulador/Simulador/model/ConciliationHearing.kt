package br.com.simulador.Simulador.model

import javax.persistence.*

@Entity
@Table(name = "CONCILIATION_HEARING")
class ConciliationHearing {
    @Id
    @GeneratedValue
    @Column(name = "COD_CONCILIATION_HEARING", nullable = false)
    var codConciliationHearing: Long? = null

    @Column(name = "JUSTIFICATION", nullable = false, length = 5000)
    var justification: String? = null

//    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "DATE", nullable = false)
    var date: String? = null

    @Column(name = "LOCATION", nullable = false)
    var location: String? = null

    @Column(name = "ADDRESS_COMPLEMENT", nullable = true)
    var addressComplement: String? = null
}
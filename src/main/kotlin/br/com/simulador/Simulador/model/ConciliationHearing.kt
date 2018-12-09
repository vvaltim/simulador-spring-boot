package br.com.simulador.Simulador.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "CONCILIATION_HEARING")
class ConciliationHearing {
    @Id
    @GeneratedValue
    @Column(name = "COD_CONCILIATION_HEARING", nullable = false)
    var codConciliationHearing: Long? = null

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "DATE", nullable = false)
    var date: Date? = null

    @Column(name = "LOCATION", nullable = false)
    var location: String? = null

    @Column(name = "ADDRESS_COMPLEMENT")
    var addressComplement: String? = null
}
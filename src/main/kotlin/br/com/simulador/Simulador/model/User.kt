package br.com.simulador.Simulador.model

import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany



@Entity
@Table(name = "user")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    var id: Int? = null

    @Column(name = "email")
    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please provide an email")
    var email: String? = null

    @Column(name = "password")
    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
    @Transient
    var password: String? = null

    @Column(name = "name")
    @NotEmpty(message = "*Informe o seu nome")
    var name: String? = null

    @Column(name = "active")
    private var active: Int = 0

    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
    @JoinTable(name = "user_role", joinColumns = [(JoinColumn(name = "user_id"))], inverseJoinColumns = [(JoinColumn(name = "role_id"))])
    private var roles: Set<Role>? = null
}
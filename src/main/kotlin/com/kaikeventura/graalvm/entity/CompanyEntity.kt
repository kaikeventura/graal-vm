package com.kaikeventura.graalvm.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity(name = "company")
data class CompanyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    val name: String,

    @OneToMany(mappedBy = "company")
    val taxes: Set<TaxEntity>? = null
)

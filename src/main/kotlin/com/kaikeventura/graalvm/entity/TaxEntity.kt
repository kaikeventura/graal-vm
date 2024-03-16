package com.kaikeventura.graalvm.entity

import jakarta.persistence.*

@Entity(name = "tax")
data class TaxEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @Enumerated(EnumType.STRING)
    val type: TaxType,

    val percentage: Double,

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    val company: CompanyEntity
)

enum class TaxType {
    IPI, IOF, PIS
}

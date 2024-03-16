package com.kaikeventura.graalvm.repository

import com.kaikeventura.graalvm.entity.CompanyEntity
import com.kaikeventura.graalvm.entity.TaxEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CompanyRepository : JpaRepository<CompanyEntity, String>

@Repository
interface TaxRepository : JpaRepository<TaxEntity, String> {
    fun findAllByCompanyId(companyId: String): List<TaxEntity>
}

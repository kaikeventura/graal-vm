package com.kaikeventura.graalvm.controller

import com.kaikeventura.graalvm.service.CompanyService
import com.kaikeventura.graalvm.service.CompanyTaxes
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/company")
class CompanyController(
    private val companyService: CompanyService
) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{companyId}/taxes")
    fun getCompanyTaxes(@PathVariable companyId: UUID): CompanyTaxes =
        companyService.getCompanyTaxes(companyId)
}

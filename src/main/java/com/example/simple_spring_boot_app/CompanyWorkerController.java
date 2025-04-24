package com.example.simple_spring_boot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/company-workers")
public class CompanyWorkerController {

    public final CompanyWorkerService companyWorkerService;

    public CompanyWorkerController(CompanyWorkerService companyWorkerService){
        this.companyWorkerService = companyWorkerService;
    }

    @GetMapping
    public List<CompanyWorker> getAllCompanyWorkers() {
        return companyWorkerService.getAllCompanyWorkers();
    }
}

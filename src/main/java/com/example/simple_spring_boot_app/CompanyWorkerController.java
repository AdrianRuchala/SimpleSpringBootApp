package com.example.simple_spring_boot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/company-workers")
public class CompanyWorkerController {

    @GetMapping
    public List<CompanyWorker> getCompanyWorkers() {
        return List.of(
                new CompanyWorker(1, "Jan Kowalski", "Finance"),
                new CompanyWorker(2, "Marek Nowak", "Legal")
        );
    }
}

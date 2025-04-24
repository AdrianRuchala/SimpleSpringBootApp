package com.example.simple_spring_boot_app;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CompanyWorkerService {
    private final CompanyWorkerRepository companyWorkerRepository;

    public CompanyWorkerService(CompanyWorkerRepository companyWorkerRepository) {
        this.companyWorkerRepository = companyWorkerRepository;
    }

    public List<CompanyWorker> getAllCompanyWorkers() {
        return companyWorkerRepository.findAll();
    }
}

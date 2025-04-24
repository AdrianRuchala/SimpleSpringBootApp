package com.example.simple_spring_boot_app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyWorkerRepository extends JpaRepository <CompanyWorker, Integer> {
}

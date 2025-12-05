package com.demo.demo_java;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class softwareEngineerService {
    private final SoftEngineerRepo softEngineerRepo;

    public softwareEngineerService(SoftEngineerRepo softEngineerRepo) {
        this.softEngineerRepo = softEngineerRepo;
    }

    public List<SoftEngineer> getSoftEngineer() {
        return softEngineerRepo.findAll();
    }
}
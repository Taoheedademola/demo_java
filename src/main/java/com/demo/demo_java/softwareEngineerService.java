package com.demo.demo_java;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {
    private final SoftEngineerRepo softEngineerRepo;

    public SoftwareEngineerService(SoftEngineerRepo softEngineerRepo) {
        this.softEngineerRepo = softEngineerRepo;
    }

    public List<SoftEngineer> getAllSoftEngineer() {
        return softEngineerRepo.findAll();
    }

    public void insertSoftwareEngineer(SoftEngineer softEngineer) {
        softEngineerRepo.save(softEngineer);
    }

}
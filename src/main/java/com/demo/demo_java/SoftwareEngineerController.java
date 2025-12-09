package com.demo.demo_java;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

        private final SoftwareEngineerService softwareEngineerService;

        public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
                this.softwareEngineerService = softwareEngineerService;
        }

        @GetMapping
        public List<SoftEngineer> getEngineers() {
                return softwareEngineerService.getAllSoftEngineer();
        }

        @PostMapping
        public void addNewSoftwareEngineer(@RequestBody SoftEngineer softEngineer) {
                softwareEngineerService.insertSoftwareEngineer(softEngineer);
        }
}

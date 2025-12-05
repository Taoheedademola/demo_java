package com.demo.demo_java;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class sofwareEngineerController {

        private final demo_java.softwareEngineerService softwareEngineerService;

        @GetMapping
        public List<SoftEngineer> getEngineers() {

                return softwareEngineerService.getSoftEngineer();
        }
}

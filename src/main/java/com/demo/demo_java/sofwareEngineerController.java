package com.demo.demo_java;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class sofwareEngineerController {

    @GetMapping
    public List<SoftEngineer> getEngineers() {

        return List.of(
                new SoftEngineer(
                        1,
                        "James",
                        "Js, Node, React, CSS"),
                new SoftEngineer(
                        2,
                        "Dames",
                        "VJs, NodeJs, React, CSS"));
    }
}

package com.comi.comi.controller;

import com.comi.comi.domain.Models;
import com.comi.comi.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping
    public List<Models> getAllModels() {
        return modelService.getAllModels();
    }

    @PostMapping
    public Models addModel(@RequestBody Models models) {
        return modelService.addModels(models);
    }
}

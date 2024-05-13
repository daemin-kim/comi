package com.comi.comi.service;

import com.comi.comi.domain.Models;
import com.comi.comi.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public List<Models> getAllModels() {
        return modelRepository.findAll();
    }

    public Models addModels(Models models) {
        return modelRepository.save(models);
    }
}

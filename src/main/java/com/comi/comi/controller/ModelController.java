package com.comi.comi.controller;

import com.comi.comi.domain.Models;
import com.comi.comi.service.ModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@Api(value = "모델 관리", tags = "모델")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping
    @ApiOperation(value = "모든 모델 조회", response = Models.class, responseContainer = "List")
    public List<Models> getAllModels() {
        return modelService.getAllModels();
    }

    @PostMapping
    @ApiOperation(value = "새 모델 추가", response = Models.class)
    public Models addModel(
            @ApiParam(value = "추가될 모델 정보", required = true) @RequestBody Models models) {
        return modelService.addModels(models);
    }
}

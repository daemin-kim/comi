package com.comi.comi.controller;

import com.comi.comi.domain.Settings;
import com.comi.comi.service.SettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
@Api(value = "설정 관리", tags = "설정")
public class SettingController {

    @Autowired
    private SettingService settingService;

    @PostMapping
    @ApiOperation(value = "설정 추가", response = Settings.class)
    public Settings addSetting(
            @ApiParam(value = "추가될 설정 정보", required = true) @RequestBody Settings settings) {
        return settingService.saveSetting(settings);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "설정 업데이트", response = Settings.class)
    public Settings updateSetting(
            @ApiParam(value = "업데이트할 설정 ID", required = true) @PathVariable int id,
            @ApiParam(value = "업데이트할 설정 정보", required = true) @RequestBody Settings settings) {
        return settingService.updateSetting(id, settings);
    }

    @GetMapping("/{userId}")
    @ApiOperation(value = "사용자 ID로 설정 조회", response = Settings.class)
    public Settings getSettingByUserId(
            @ApiParam(value = "조회할 사용자 ID", required = true) @PathVariable("userId") int userId) {
        return settingService.getSettingByUserId(userId);
    }
}

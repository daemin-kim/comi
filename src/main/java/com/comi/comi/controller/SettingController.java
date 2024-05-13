package com.comi.comi.controller;

import com.comi.comi.domain.Settings;
import com.comi.comi.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
public class SettingController {

    @Autowired
    private SettingService settingService;

    @PostMapping
    public Settings addSetting(@RequestBody Settings settings) {
        return settingService.saveSetting(settings);
    }

    @PutMapping("/{id}")
    public Settings updateSetting(@PathVariable int id, @RequestBody Settings settings) {
        return settingService.updateSetting(id, settings);
    }

    @GetMapping("/{userId}")
    public Settings getSettingByUserId(@PathVariable Settings userId) {
        return settingService.getSettingByUserId(userId);
    }
}

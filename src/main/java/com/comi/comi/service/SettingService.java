package com.comi.comi.service;

import com.comi.comi.domain.Settings;
import com.comi.comi.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingService {

    @Autowired
    private SettingRepository settingRepository;

    public Settings saveSetting(Settings setting) {
        return settingRepository.save(setting);
    }

    public Settings updateSetting(int id, Settings setting) {
        return settingRepository.findById(id)
                .map(existingSetting -> {
                    existingSetting.setProficiencyLevel(setting.getProficiencyLevel());
                    existingSetting.setLearningLanguage(setting.getLearningLanguage());
                    return settingRepository.save(existingSetting);
                }).orElseThrow(() -> new RuntimeException("Setting not found with id " + id));
    }

    public Settings getSettingByUserId(Settings userId) {
        return settingRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Setting not found for user id " + userId));
    }
}

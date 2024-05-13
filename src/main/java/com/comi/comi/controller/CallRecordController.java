package com.comi.comi.controller;

import com.comi.comi.domain.CallRecords;
import com.comi.comi.service.CallRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/callRecords")
public class CallRecordController {

    @Autowired
    private CallRecordService callRecordService;

    @PostMapping
    public CallRecords createCallRecord(@RequestBody CallRecords callRecord) {
        return callRecordService.createCallRecord(callRecord);
    }

    @GetMapping
    public List<CallRecords> getCallRecords(@RequestParam(defaultValue = "0") int page) {
        return callRecordService.getAllCallRecords(page);
    }
}

package com.comi.comi.controller;

import com.comi.comi.domain.CallRecords;
import com.comi.comi.service.CallRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/callRecords")
@Api(value = "통화 기록 관리", tags = "통화 기록")
public class CallRecordController {

    @Autowired
    private CallRecordService callRecordService;

    @PostMapping
    @ApiOperation(value = "새 통화 기록 생성", response = CallRecords.class)
    public CallRecords createCallRecord(
            @ApiParam(value = "생성될 통화 기록", required = true) @RequestBody CallRecords callRecord) {
        return callRecordService.createCallRecord(callRecord);
    }

    @GetMapping
    @ApiOperation(value = "통화 기록 목록 조회", response = CallRecords.class, responseContainer = "List")
    public List<CallRecords> getCallRecords(
            @ApiParam(value = "페이지 번호", example = "0", required = false) @RequestParam(defaultValue = "0") int page) {
        return callRecordService.getAllCallRecords(page);
    }
}

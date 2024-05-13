package com.comi.comi.service;

import com.comi.comi.domain.CallRecords;
import com.comi.comi.repository.CallRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallRecordService {

    @Autowired
    private CallRecordRepository callRecordRepository;

    public CallRecords createCallRecord(CallRecords callRecord) {
        return callRecordRepository.save(callRecord);
    }

    public List<CallRecords> getAllCallRecords(int page) {
        return callRecordRepository.findAll(PageRequest.of(page, 10)).getContent();
    }
}

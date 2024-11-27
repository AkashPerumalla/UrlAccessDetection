package com.avantel.urlcalldetection.service;

//package com.example.webtracker.service;

//import com.example.webtracker.model.AccessRecord;
//import com.example.webtracker.repository.AccessRecordRepository;
import org.springframework.stereotype.Service;

import com.avantel.urlcalldetection.model.AccessRecord;
import com.avantel.urlcalldetection.repository.AccessRecordRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AccessRecordService {

    private final AccessRecordRepository repository;

    public AccessRecordService(AccessRecordRepository repository) {
        this.repository = repository;
    }

    public AccessRecord logAccess() {
        AccessRecord record = new AccessRecord();
        record.setAccessTime(LocalDateTime.now());
        record.setValue("callDetected");
        return repository.save(record);
    }

    public List<AccessRecord> getAllRecords() {
        return repository.findAll();
    }
}

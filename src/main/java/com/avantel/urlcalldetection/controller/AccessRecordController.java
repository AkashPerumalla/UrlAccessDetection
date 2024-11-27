package com.avantel.urlcalldetection.controller;

//package com.example.webtracker.controller;

//import com.example.webtracker.model.AccessRecord;
//import com.example.webtracker.service.AccessRecordService;
import org.springframework.web.bind.annotation.*;

import com.avantel.urlcalldetection.model.AccessRecord;
import com.avantel.urlcalldetection.service.AccessRecordService;

import java.util.List;

@RestController
@RequestMapping("/api/access")
public class AccessRecordController {

    private final AccessRecordService service;

    public AccessRecordController(AccessRecordService service) {
        this.service = service;
    }

    @PostMapping("/log")
    public AccessRecord logAccess() {
        return service.logAccess();
    }

    @GetMapping("/records")
    public List<AccessRecord> getRecords() {
        return service.getAllRecords();
    }
}


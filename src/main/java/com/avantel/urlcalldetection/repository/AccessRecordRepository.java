package com.avantel.urlcalldetection.repository;

//package com.example.webtracker.repository;

//import com.example.webtracker.model.AccessRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import com.avantel.urlcalldetection.model.AccessRecord;

public interface AccessRecordRepository extends JpaRepository<AccessRecord, Long> {
}

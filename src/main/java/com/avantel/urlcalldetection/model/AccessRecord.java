package com.avantel.urlcalldetection.model;

//package com.example.webtracker.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AccessRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "log_value") // Renamed column
	private String value;

	@Column(name = "access_time")
	private LocalDateTime accessTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LocalDateTime getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(LocalDateTime accessTime) {
		this.accessTime = accessTime;
	}

	
}

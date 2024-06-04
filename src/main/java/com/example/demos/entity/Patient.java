package com.example.demos.entity;


import lombok.Data;

@Data
public class Patient {
    private Long id;
    private String patientId;
    private String patientName;
    private String attendant;
    private String problemCase;
}



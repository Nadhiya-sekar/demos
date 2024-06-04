package com.example.demos.service;

import com.example.demos.entity.Patient;

import java.util.List;

public interface PatientService {
    void insertPatient(Patient patient);

    Patient addPatient(Patient patient);
    List<Patient> getAllPatients();

    Patient getPatientById(Long id);
}



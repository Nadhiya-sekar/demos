package com.example.demos.service;

import com.example.demos.entity.Patient;
import com.example.demos.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public void insertPatient(Patient patient) {
        patientMapper.insertPatient(patient);
    }

    @Override
    public Patient addPatient(Patient patient) {
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientMapper.getAllPatients();
    }

    @Override
    public Patient getPatientById(Long id) {
        // Implement your logic to fetch patient by id
        // For example:
        // return patientMapper.getPatientById(id);
        return null; // Replace this with your actual implementation
    }
}


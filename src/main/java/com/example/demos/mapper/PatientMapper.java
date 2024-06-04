package com.example.demos.mapper;

import com.example.demos.entity.Patient;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {

    @Insert("INSERT INTO public.patient(patient_id, patient_name, attendant, problem_case) " +
            "VALUES (#{patient.patientId}, #{patient.patientName}, #{patient.attendant}, #{patient.problemCase})")
    void insertPatient(@Param("patient") Patient patient);

    @Select("SELECT * FROM public.patient WHERE patient_name = #{givenName}")
    Patient getPatientByGName(@Param("givenName") String givenName);

    @Select("SELECT * FROM public.patient")
    List<Patient> getAllPatients();
}

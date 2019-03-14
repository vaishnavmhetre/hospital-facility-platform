package models.doctor;

import models.patient.Patient;
import models.prescription.PrescriptionItem;
import models.test.Test;

import java.util.ArrayList;

public class Doctor {

    /* Fields */

    Integer docId;
    String name;
    String department;
    String specialization;
    Integer phNo;
    String address;

    public Doctor(Integer docId, String name, String department, String specialization, Integer phNo, String address){
        this.docId = docId;
        this.name = name;
        this.department = department;
        this.specialization = specialization;
        this.phNo = phNo;
        this.address = address;
    }

    public void prescribeMedicines() {
        //  TODO - Prescribe medicines to Patient
    }

    public void checkReports(Patient patient) {
        /*
            TODO
                1. Validate whether Patient is valid and is checked by this doctor
                2. Return reports of patient
         */
    }

    public void prescribeMedicines(Patient patient, ArrayList<PrescriptionItem> prescriptionItems) {
        /*
            TODO
                1. Validate whether Patient is valid and is checked by this doctor
                2. Create Prescription from prescription items
         */
    }

    public void prescribeTests(Patient patient, ArrayList<Test> tests) {
        /*
            TODO
                1. Validate whether Patient is valid and is checked by this doctor
                2. Prescribe given tests
         */
    }

    public void drawSalary(){
        //  TODO - Compute and return Salary
    }

}

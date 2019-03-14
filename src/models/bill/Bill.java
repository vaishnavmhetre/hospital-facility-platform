package models.bill;

import models.patient.Patient;

public class Bill {

    Integer billNo;
    Patient patient;
    Float amount;

    public Bill(Integer billNo, Patient patient, Float amount){
        this.billNo = billNo;
        this.patient = patient;
        this.amount = amount;
    }

}

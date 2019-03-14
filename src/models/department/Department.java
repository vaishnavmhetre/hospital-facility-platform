package models.department;

import models.doctor.Doctor;

import java.util.ArrayList;

public class Department {

    Integer id;
    String name;
    ArrayList<Doctor> doctors;  // Assumed this for relation visualization

    public Department(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Department(Integer id, String name, ArrayList<Doctor> doctors){
        this.id = id;
        this.name = name;
        this.doctors = doctors;
    }

    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

    public void addDoctors(ArrayList<Doctor> doctors){
        this.doctors.addAll(doctors);
    }

    public Doctor removeDoctor(int index){
        return this.doctors.remove(index);
    }

    public boolean removeDoctor(Doctor doctor){
        return this.doctors.remove(doctor);
    }
}

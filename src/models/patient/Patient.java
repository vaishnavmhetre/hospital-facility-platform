package models.patient;

public class Patient {

    Integer id;
    String name;
    Integer telNo;
    String address;
    Integer age;
    String sex;
    Integer roomNo;

    public Patient(Integer id, String name, Integer telNo, String address, Integer age, String sex, Integer roomNo) {
        this.id = id;
        this.name = name;
        this.telNo = telNo;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.roomNo = roomNo;
    }

    public void payBills() {

        //  TODO - Calculate and provide access to pay the Bills.

    }
}

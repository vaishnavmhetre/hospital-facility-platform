package models.staff.base;

public class Person {

    Integer id;
    String name;
    String type;

    public Person(Integer id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void drawSalary(){
        //  TODO - Compute and return Salary
    }

}

package Exercitiul3;

import Exercitiul2.Employee;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class PersonData  {
    private Employee e1;
    public PersonData(String firstName, String lastName, Date birthday, String address,Date dataAngajarii,String pozitie) {
        e1=new Employee(firstName, lastName,birthday,address,dataAngajarii,pozitie);
    }
    public String fullName() {
        return e1.getFirstName() + " " + e1.getLastName();
    }
    public int getAge() {
        return e1.dateOfEmployement().getYear()- e1.getBirthday().getYear();
    }

}

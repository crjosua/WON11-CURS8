package Exercitiul2;

import java.util.Date;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private Date birthday;
    public String address;
    private Date dataAngajarii;
    public String pozitie;

    public Employee(String firstName, String lastName, Date birthday, String address,Date dataAngajarii,String pozitie) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.dataAngajarii = dataAngajarii;
        this.pozitie = pozitie;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }
    public Date dateOfEmployement() {
        return dataAngajarii;
    }
    public String getPozitie() {
        return pozitie;
    }
}

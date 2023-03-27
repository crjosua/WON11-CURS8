package Exercitiul2;

import java.util.Date;

public class Programmer extends Employee {
    private String language;


    public Programmer(String firstName, String lastName, Date birthday, String address, Date dataAngajarii, String pozitie, String language) {
        super(firstName,lastName,birthday,address,dataAngajarii,pozitie);
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
    public String getPozitie() {
        return pozitie + " programmer";
    }
}

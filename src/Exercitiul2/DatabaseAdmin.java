package Exercitiul2;

import java.util.Date;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;


    public DatabaseAdmin (String firstName, String lastName, Date birthday, String address, Date dataAngajarii, String pozitie,String dbTechnology) {
        super(firstName,lastName,birthday,address,dataAngajarii,pozitie);
        this.dbTechnology = dbTechnology;

    }
    public String getAddress() {
        return address + " dbAdmin";
    }
    public String getDbTechnology() {
        return dbTechnology;
    }
}


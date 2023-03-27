package Exercitiul3;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        PersonData p1 = new PersonData("Morar","Timotei",new Date(1997,9,1),"Aleea Trandafirilor",new Date(2022,9,1),"Manager");
        System.out.println(p1.fullName());
        System.out.println(p1.getAge());

    }
}

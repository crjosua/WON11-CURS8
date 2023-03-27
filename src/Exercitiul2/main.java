package Exercitiul2;

import java.time.LocalDateTime;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Morar","Timotei-Cristian",new Date(2000,9,10),"Aleea Trandafirilor Abrud",new Date(2022,1,23),"Web developer","Engleza");
        DatabaseAdmin databaseAdmin1 = new DatabaseAdmin("Josua","Cojocariu",new Date(2002,11,9),"Zorilor Balcaciu",new Date(2019,11,13),"Manager","Oracle");
        System.out.println(programmer1.getLanguage());
        System.out.println(programmer1.getPozitie());
        System.out.println(databaseAdmin1.getDbTechnology());
        System.out.println(databaseAdmin1.getAddress());
    }
}

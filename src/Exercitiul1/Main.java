package Exercitiul1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(10.99, "Sampon", "Pentru un volum mare al parului", 5);
        Cosmetics cosmetics1 = new Cosmetics(5.99, "Strugurel", "Perfect pentru zilele cu buze crapate", 10, "Rosu", 0.2);
        Electronics electronics1 = new Electronics(399, "Prelungitor", "Asigura casei tale o gaura pentru fiecare camera", 1, "Emag", 0.6, 0.2, 2, 10);
        System.out.println(cosmetics1.getName());
        System.out.println(cosmetics1.getColor());
        System.out.println(cosmetics1.getPrice());
        System.out.println(cosmetics1.getDescription());
    }
}




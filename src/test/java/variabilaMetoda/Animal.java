package variabilaMetoda;

import org.testng.annotations.Test;
public class Animal {

    public String nume;
    public String specie;
    public int varsta;
    public double greutate;
    public String culoare;
    public boolean domesticit;
    public char gen;

    @Test
    public void metodaTest() {
        prezentareAnimal("Bella ", "Caine ", 3,  20.5, " Maro");
        prezentareAnimal("Max ", "Pisica ", 2, 5.0, " Negru");
        prezentareAnimal("Luna ", "Iepure ", 1, 2.5, " Alb");
        prezentareAnimal("Charlie ", "Papagal ", 4, 0.3, " Verde");
        prezentareAnimal("Rocky ", "Hamster ", 1, 0.2, " Gri");
    }

    public void prezentareAnimal(String nume, String specie, int varsta, double greutate, String culoare) {
        System.out.print("Numele este: " + nume + ".");
        System.out.print(" Specia este: " + specie+ ".");
        System.out.print(" Varsta: " + varsta+ ".");
        System.out.print(" Greutatea: " + greutate+ ".");
        System.out.println(" Culoarea: " + culoare + ".");

    }
}

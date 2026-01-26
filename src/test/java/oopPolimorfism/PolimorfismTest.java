package oopPolimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void testPolimorfism() {
       // test polimorfism dinamic
        Masina masina1 = new Masina("Toyota", "Corolla", 2020);
        masina1.pornesteAutomobil(); // Va apela metoda din clasa Masina
        Trotineta trotineta1 = new Trotineta("Xiaomi", "M365", 2019);
        trotineta1.pornesteAutomobil(); // Va apela metoda din clasa Trotineta

        //test polimorfism static
        Masina masina2 = new Masina("Ford", "Focus", 2018);
        masina2.pornesteAutomobil(); // Va apela metoda din clasa Masina
        masina2.aplicaReducere();
        masina2.aplicareReducere(20);
    }
}

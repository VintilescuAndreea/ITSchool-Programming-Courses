package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MasinaTest {

    @Test
    public void MasinaTest() {

        Masina masina1 = new Masina("S", 2020, "Rosu", Arrays.asList("Scaune incalzite", "Sistem de navigatie", "Pilot automat"), true, "Tesla");
        masina1.prezentareMasina();
        System.out.println("========================");

        Masina masina2 = new Masina("Civic", 2018, "Albastru", List.of("Aer conditionat", "Bluetooth"), false, "Honda");
        masina2.prezentareMasina();

        System.out.println("========================");

        Masina masina3 = new Masina("Dacia", "Logan", "Gri", 2021, 1500, false, List.of("Geamuri electrice", "Sistem audio"));
        masina3.prezentareMasina();
        masina3.calculImpozit();

    }
}

// tema sa nu apara pretul pentru primele 2 masini desi initial au fost vandute fara pret
package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {

    //avem cerinta sa prezentam toti elevii de la sc 1
    @Test
    public void testMetoda() {
        Elev ion = new Elev("Popescu", 16, "Ion");
        Elev maria = new Elev("Ionescu", 17, "Maria");
        Elev andrei = new Elev("Georgescu", 16, "Andrei");
        Elev elena = new Elev("Dumitrescu", 14, "Elena");

        ion.prezentareElev();
        elena.prezentareElev();
        andrei.calculareEcuson();

    }
}
/* static este un keyword pe care il folosim cu scopul de a salva o valoare default pt o variabila definita. daca fol acest keyword
   salvam spatiu in memorie deoarece valoarea variabilei nu se mai salveaza pt fiecare obiect in parte, ci o singura data in clasa.
 */
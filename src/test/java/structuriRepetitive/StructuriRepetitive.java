package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {


    /* Structurile repetitive sunt cele care permit executarea unui cod de mai multe ori, atata timp cat o conditie este adevarata.
     Exista 4 tipuri de structuri repetitive:
     - for
     - while
     - for each
     - do...while

     */
    @Test
    public void metodaTest() {

        afisareNumereConsecutive(4);
        afisareNumarPare(4);
        afisareNumereConsecutive2(50);


    }
    public void afisareNumereConsecutive(int capat) {
        for(int index = 0; index < capat; index++) {
            System.out.println(" Se afiseaza numarul:" + index);
        }

    }

    // metoda de mai sus cu for - facuta cu while

    public void afisareNumereConsecutive2(int capat){
        int index = 0;
        while(index < capat){
            System.out.println(" Se afiseaza numarul:" + index);
            index++;
        }
    }

    public void afisareNumarPare(int capat) {
        for(int index = 0; index < 4; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul "+ index+ " este par.");
            }
        }
    }
}

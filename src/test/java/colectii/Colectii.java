package colectii;

import org.testng.annotations.Test;

import java.util.*;

/* Exista mai multe tipuri de colectii in Java:
 - Array (Array)
 - Liste (List)
 - Seturi (Set)
 - Mapari (Map)

 Array-urile sunt structuri de date primitive/de baza cu dimensiune fixa care stocheaza elemente de acelasi tip.
 Listele sunt colectii ordonate care permit elemente duplicate cu dimensiune dinamica.
 Seturile sunt colectii neordonate care nu permit elemente duplicate.
 Maparile sunt structuri de date asociative care stocheaza perechi cheie-valoare, unde fiecare cheie este unica.


 Cele mai comune implementari ale acestor colectii sunt:
 - ArrayList (implementare a listei)
 - HashSet (implementare a setului)
 - HashMap (implementare a maparii)

!! Metoda split() se poate folosi pentru a transforma un String intr-un Array, folosind un separator specificat.
Se poate folosi doar cu Array-urile, nu si cu Listele deoarece unele metode sunt specifice doar Array-urilor, printre care si split().
 */
public class Colectii {

    @Test
    public void metodaTest() {
    //cursantiArray();
    //cursantiList();
    //masinaList()
    //exempleMap();
    //tariOrase();
    caietRetete();

    }
// ============== ARRAY ==============
    public void cursantiArray() {
        String[] cursanti = new String[5];
        cursanti[0] = "Ana";
        cursanti[1] = "Ion";
        cursanti[2] = "Maria";
        cursanti[3] = "Vasile";
        cursanti[4] = "Elena";

        for (int i = 0; i < cursanti.length; i++) {
            System.out.println("Cursantul de pe pozitia " + i + " este: " + cursanti[i]);
        }

//        for(String cursant : cursanti) {
//            System.out.println("Cursant: " + cursant);
//        }
    }

// ============== LISTE ==============
    public void cursantiList() {
        List<String> cursanti = new ArrayList<String>();

        cursanti.add("Andra");
        cursanti.add("Mioara");
        cursanti.add("Daria");
        cursanti.add("Cristina");

        for (int i = 0; i < cursanti.size(); i++) {
            System.out.println("Cursantul de pe pozitia " + i + " este: " + cursanti.get(i));
            // La liste nu mai folosim length, ci size()!!
        }
    }

    public void masinaList(){
        List<String> masini = new ArrayList<String>();

        masini.add("Dacia");
        masini.add("Renault");
        masini.add("BMW");
        masini.add("Audi");

        for (int i = 0; i < masini.size(); i++) {
            System.out.println("Masina de pe pozitia " + i + " este: " + masini.get(i));

        }
    }

// ============== MAP-URI ==============
    /* Maps-uri sunt colectii care stocheaza perechi cheie-valoare, unde fiecare cheie este unica. Parcurgerea se face pe baza
    cheilor folosind keySet() sau entrySet().
     */

    public void exempleMap() {

        // Exemplu de creare a unui HashMap
         Map<String, String> elemente = new HashMap<>();

        // Adaugarea elementelor in HashMap
         elemente.put("Dacia", "Logan");
         elemente.put("Skoda", "Octavia");
         elemente.put("BMW", "X5");
         elemente.put("Audi", "A6");


        // Parcurgerea HashMap folosind keySet()
         for (String key : elemente.keySet()) {
             System.out.println("Cheia este: " + key + ", iar valoarea: " + elemente.get(key));
         }

        // Parcurgerea HashMap folosind entrySet()
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println("Nume: " + entry.getKey() + ", Varsta: " + entry.getValue());
        // }
    }

    public void tariOrase(){

        Map<String, List<String>> tariOrase = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Bucuresti", "Cluj-Napoca", "Timisoara");
        List<String> oraseFranta = Arrays.asList("Paris", "Lyon", "Marseille");
        List<String> oraseItalia = Arrays.asList("Roma", "Milano", "Napoli");

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Franta", oraseFranta);
        tariOrase.put("Italia", oraseItalia);

        for (String key : tariOrase.keySet()) {
            System.out.println("Tara este: " + key + ", iar orasele cunoscute: " + tariOrase.get(key));
        }

    }

    public void caietRetete(){

        Map<String, List<String>> ingrediente = new HashMap<>();

        List<String> supaPui = Arrays.asList("Morcov", "Cartof", "Ceapa");
        List<String> salataFructe = Arrays.asList("Mar", "Banana", "Portocala");
        List<String> clatiteCiocolata = Arrays.asList("Faina", "Lapte", "Oua");

        ingrediente.put("Supa de pui", supaPui);
        ingrediente.put("Salata de fructe", salataFructe);
        ingrediente.put("Clatite cu ciocolata", clatiteCiocolata);

        for (String key : ingrediente.keySet()) {
            System.out.println("Ingredientele pentru " + key + " sunt: " + ingrediente.get(key));
    }

    }
}



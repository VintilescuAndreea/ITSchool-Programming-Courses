package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    /* O clasa este un sablon care defineste comportamentul unei entitati din viata reala.
    Intr-un fisier JAVA recunoastem o clasa dupa cuvantul cheie 'class'.
    O clasa trebuie obligatoriu sa aiba un nume. Aceasta contine variabile si metode.
     */

    /* O variabila este proprietatea unei clase. Aceasta poate fi de doua feluri: globala si locala.
    Variabila globala este aceea pe care o definim la inceputul clasei si este vizibila in tot fisierul; in timp ce variabila locala
    trebuie declarata in interiorul unei metode si este vizibila doar la nivelul metodei.
    O variabila globala trebuie sa contina un access control ( public ), tip de data si un nume.
    O variabila nu este obligatoriu sa contina intotdeauna o valoare.
     */

    // variabile globale
    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean restante;

    /* O metoda este actiunea unei clase. O clasa poate avea mai multe metode care se diferentiaza prin numele lor.
    Metodele pot fi de doua feluri: void si retur. O metoda cu void are ca rol sa execute actiunea si sa o afiseze si trebuie sa contina
    acces control ( public ), cuvantul cheie ' void', numele metodei, paranteze rotunde si acolade.
     */
    @Test
    public void prezentareStudent() {
        nume = "Vintilescu";
        prenume = "Andreea";
        varsta = 25;
        inaltime = 1.5;
        greutate = 58.5f;
        restante = true;
        gen = 'F';
        System.out.print(prenume+ " "); // Concatenarea este lipirea a unuia sau mai multor stringuri.
        System.out.print(prenume.concat(" ")); // Acelasi lucru ca mai sus
        System.out.println(nume);
        System.out.println(String.format("numele este %s", nume)); // sau System.out.printf("numele este %s%n" , nume);
        System.out.println(varsta);
        System.out.println(inaltime);
    }
}

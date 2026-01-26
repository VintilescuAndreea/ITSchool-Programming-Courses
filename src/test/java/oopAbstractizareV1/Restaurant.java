package oopAbstractizareV1;

public class Restaurant {
    private String nume;
    private String adresa;
    private int telefon;

    public Restaurant(String nume, String adresa, int telefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
    }



}


/* Abstractizarea reprezinta un concept OOP prin care putem defini comportamentul unei clase, fara a ne preocupa de detaliile de implementare.
   In Java, abstractizarea se poate realiza prin intermediul:
         1. claselor abstracte
         2. interfetelor.

   • Interfata este o structura care contine doar metode abstracte (fara implementare) si constante.Clasa care implementeaza interfata
   trebuie sa furnizeze implementarea pentru toate metodele definite in interfata. Toate metodele din interfata sunt abstracte si publice.
   O interfata nu poate contine un constructor si nu poate fi instantiata direct= > nu putem crea obiecte dintr-o interfata.
   O interfata poate mosteni mai multe interfete folosind cuvantul cheie "extends".
   O clasa poate implementa mai multe interfete folosind cuvantul cheie "implements".




*/
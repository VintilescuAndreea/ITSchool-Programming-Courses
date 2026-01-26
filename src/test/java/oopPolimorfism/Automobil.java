package oopPolimorfism;

public class Automobil {

    private String marca;
    private String model;
    private int anFabricatie;

    public Automobil(String marca, String model, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    // Polimorfism dinamic
    public void pornesteAutomobil() {
        System.out.println("Automobilul " + marca + " porneste de la mobil.");
    }


    // Polimorfism static
    public void aplicaReducere() {
        System.out.println("La achizitionarea automobilului " + marca + " se aplica o reducere standard de 5%.");
    }

    public void aplicareReducere(int procentReducere) {
        System.out.println("Se aplica o reducere de " + procentReducere + "% la automobilul " + marca);
    }

    public void aplicareReducere(String cuponReducere) {
        System.out.println("Se aplica un cupon"+ cuponReducere + "pentru autovehiculul marca " + marca);
    }

}

/*
 Polimorfismul reprezinta un concept prin care putem realiza o singura actiune in mai multe moduri diferite.
 De exemplu, o metoda poate avea acelasi nume, dar poate functiona diferit. Acest lucru se poate realiza
 prin supraincarcarea metodelor (method overloading) sau prin suprascrierea metodelor (method overriding).

 Polimorfismul poate fi impartit in doua categorii principale:
 1. Polimorfism dinamic - overrideing: apare doar in relatia de mostenire si implica  crearea unei metode in clasa derivata
        care are acelasi nume si semnatura ca o metoda din clasa de baza.
 2. Polimorfism static - overloading: apare in cadrul aceleiasi clase, insa se diferentiaza prin crearea mai multor metode
        cu acelasi nume, dar cu nr. si tipul parametrilor diferiti.




*/
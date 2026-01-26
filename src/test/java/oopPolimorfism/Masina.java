package oopPolimorfism;

public class Masina extends Automobil{

    public Masina(String marca, String model, int anFabricatie) {
        super(marca, model, anFabricatie);
    }


    public void pornesteAutomobil() {
        //super.pornesteAutomobil(); // daca vreau sa apelez si metoda din clasa parinte
        System.out.println("Masina porneste de la cheia de contact.");
    }
}

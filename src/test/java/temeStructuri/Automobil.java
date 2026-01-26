package temeStructuri;

import org.testng.annotations.Test;

public class Automobil {

    // Variabile globale
    public String marca;
    public String model;
    public int anFabricatie;
    public double capacitateMotor;
    public float consum;
    public char tipCombustibil;
    public boolean esteNoua;

    @Test
    public void prezentareMasina() {
        marca = "Dacia";
        model = "Logan";
        anFabricatie = 2022;
        capacitateMotor = 1.0;
        consum = 5.5f;
        tipCombustibil = 'B'; // Benzina
        esteNoua = true;

        System.out.print(marca + " ");
        System.out.print(model.concat(" "));
        System.out.println(anFabricatie);
        System.out.println(String.format("Marca este %s", marca));
        System.out.println(capacitateMotor);
        System.out.println(consum);
    }
}

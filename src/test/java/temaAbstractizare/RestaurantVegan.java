package temaAbstractizare;

public class RestaurantVegan extends Restaurant {

    private String nume;
    private String adresa;
    private String program;
    private int capacitate;
    private int vegan;

    public RestaurantVegan(String nume, String adresa, String program, int capacitate) {
        super(nume, adresa, program, capacitate);
        this.nume = nume;
        this.adresa = adresa;
        this.program = program;
        this.capacitate = capacitate;
        this.vegan = 0;
    }
}

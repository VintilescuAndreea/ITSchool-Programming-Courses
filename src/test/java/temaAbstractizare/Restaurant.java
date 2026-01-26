package temaAbstractizare;

/*
    Facem o clasa generala: Restaurant - declaram niste proprietati generale
    Incepem sa facem variantele specifice: doua clase (una restaurant vegan, una non vegan), ambele mostenesc clasa restaurant
    Facem o interfata - RestaurantVeganInterface - defineste regulile pentru un restaurant vegan (doua metode abstracte 1 -ServesteMancareVegana 2- MeniuVegan)
    La fel si pentru RestarantulNonVegan ( doua metode abstracte 1 -ServesteMancareNonVegana 2 - MeniuNonVegan)
    Deschidem un nou restaurant mixt ( O alta clasa RestaurantMixt ) care mosteneste clasa Restaurant si care implementeaza ambele interfete
*/
public class Restaurant {

    private String nume;
    private String adresa;
    private String program;
    private int capacitate;

    public Restaurant(String nume, String adresa, String program, int capacitate){
        this.nume = nume;
        this.adresa = adresa;
        this.program = program;
        this.capacitate = capacitate;
    }

    public void infoRestaurant(){
        System.out.println("Numele restaurantului este " + nume);
        System.out.println("Adresa restaurantului este " + adresa);
        System.out.println("Programul de functionare al restaurantului este " + program);
        System.out.println("Capacitatea restaurantului este de " + capacitate + " persoane.");
    }
}

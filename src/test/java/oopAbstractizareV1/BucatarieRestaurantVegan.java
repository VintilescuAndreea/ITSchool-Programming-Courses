package oopAbstractizareV1;

public class BucatarieRestaurantVegan extends Restaurant implements IRestaurantVegan{


    public BucatarieRestaurantVegan(String nume, String adresa, int telefon) {
        super(nume, adresa, telefon);
    }

    @Override
    public void servesteHummus() {

    }

    @Override
    public void servesteFalafel() {

    }

    @Override
    public void servesteSalata() {

    }
}

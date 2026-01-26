package oopAbstractizareV1;

public class BucatarieRestaurant extends Restaurant implements IRestaurantVegan, IRestaurantNonVegan {

    public BucatarieRestaurant(String nume, String adresa, int telefon) {
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

    @Override
    public void servestePaste() {

    }

    @Override
    public void servesteFriptura() {

    }

    @Override
    public void servesteCiorba() {

    }

    @Override
    public void servesteCostite() {

    }
}

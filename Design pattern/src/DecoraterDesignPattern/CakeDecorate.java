package DecoraterDesignPattern;

public class CakeDecorate implements Cake {

    protected Cake c;

    public CakeDecorate(Cake cake) {

        this.c = cake;
    }

    @Override
    public float price() {
        return c.price();
    }
}

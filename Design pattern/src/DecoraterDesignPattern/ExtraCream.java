package DecoraterDesignPattern;

public class ExtraCream extends CakeDecorate {

    public ExtraCream(Cake cake) {
        super(cake);
    }

    @Override
    public float price() {
        return c.price() + 50;
    }

}

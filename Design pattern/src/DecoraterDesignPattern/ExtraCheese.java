package DecoraterDesignPattern;

public class ExtraCheese extends CakeDecorate {

    public ExtraCheese(Cake cake) {
        super(cake);
    }

    @Override
    public float price() {
        return c.price() + 100;
    }

}

package FacadePattern;

public class IPhone implements IMobile {
    @Override
    public void model() {
        System.out.println("Model: iphone x");
    }

    @Override
    public void price() {
        System.out.println("Fiyat: 9000");
    }
}

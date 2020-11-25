package FacadePattern;

public class Samsung implements IMobile {
    @Override
    public void model() {
        System.out.println("Model: Galaxy S10");

    }

    @Override
    public void price() {
        System.out.println("Fiyat: 6000");
    }
}

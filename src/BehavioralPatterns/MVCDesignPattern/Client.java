package BehavioralPatterns.MVCDesignPattern;

public class Client {
    public static void main(String[] args) {
        ModelKisi modelKisi = kisiOlustur();

        ViewKisi viewKisi = new ViewKisi();
        ControllerKisi controllerKisi = new ControllerKisi(modelKisi,viewKisi);

        controllerKisi.updadetView();
        controllerKisi.setKisiAdi("Ahmet");
        controllerKisi.updadetView();;
    }

    private static ModelKisi kisiOlustur(){
        ModelKisi mk = new ModelKisi();
        mk.setIsim("Hakan");
        mk.setSoyIsim("Gençoğlu");
        mk.setYas(43);
        return mk;
    }
}

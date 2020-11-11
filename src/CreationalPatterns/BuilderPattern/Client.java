package CreationalPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args)
    {
        IMuteahhit iglooBuilder = new IgloTipiEv();
        Muhendis muhendis = new Muhendis(iglooBuilder);

        muhendis.InsaataBasla();

        IEv ev = muhendis.getHouse();

        System.out.println("Builder constructed: "+ ev);
    }
}

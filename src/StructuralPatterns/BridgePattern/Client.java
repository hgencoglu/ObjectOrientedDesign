package StructuralPatterns.BridgePattern;

public class Client {
    public static void main (String[] args){

        Shape kirmizi = new Circle(10,20,100, new RedCircle());
        Shape yesil = new Circle(40,50,200, new GreenCircle());

        kirmizi.draw();;
        yesil.draw();
    }
}

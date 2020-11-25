package StructuralPatterns.DecoratorPattern;

public class Client {
    public static void main(String[] args){

        Shape circle = new Circle();
        Shape kirmiziDaire = new RedShape(new Circle());

        System.out.println("Normal Kenarlıklı daire");
        circle.draw();;

        System.out.println("Kırmızı kenarlıklı daire");
        kirmiziDaire.draw();

        Shape dikdortgen = new RedShape(new Rectangle());
        dikdortgen.draw();

    }
}

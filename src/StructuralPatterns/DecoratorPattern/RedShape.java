package StructuralPatterns.DecoratorPattern;

public class RedShape extends ShapeDecorator {
    public RedShape(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw(){

        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Kenarlık Rengi: Kırmızı");
    }
}

package StructuralPatterns.BridgePattern;

public abstract class Shape {

    protected  IDraw iDrawApi;

    protected Shape(IDraw iDrawApi){
        this.iDrawApi=iDrawApi;
    }

    public abstract void draw();
}

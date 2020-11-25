package StructuralPatterns.BridgePattern;

public class Circle extends Shape {
    private int x,y,r;
    public Circle(int x, int y, int r ,IDraw idraw){
        super(idraw);
        this.x=x;
        this.y=y;
        this.r=r;

    }

    @Override
    public void draw() {
        iDrawApi.drawCircle(x,y,r);
    }
}

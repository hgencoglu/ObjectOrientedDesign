package StructuralPatterns.BridgePattern;

public class GreenCircle implements IDraw{
    @Override
    public void drawCircle(int x, int y, int r) {
        System.out.println("Yeşil daire yarıçap:" +r + " x: "+x+" y:"+y+" ");
    }
}

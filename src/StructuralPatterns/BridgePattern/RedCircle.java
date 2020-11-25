package StructuralPatterns.BridgePattern;

public class RedCircle implements IDraw {
    @Override
    public void drawCircle(int x, int y, int r) {
        System.out.println("Kırmızı daire yarıçap:" +r + " x: "+x+" y:"+y+" ");
    }
}

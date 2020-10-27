package DesignPrincipless.OpenClose.BadExample;

public class GraphicEditor {
    public void drawShape (Shape shape)
    {
        if(shape.type==1){drawRectangle((Rectangle) shape);}
        else if(shape.type==2){drawCircle((Circle) shape);}

    }

    public void drawCircle(Circle c){}
    public void drawRectangle (Rectangle r){}

}

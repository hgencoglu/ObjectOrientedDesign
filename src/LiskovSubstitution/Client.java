package LiskovSubstitution;

public class Client {

    private static Rectangle getNewRectangle()
    {// it can be an object returned by some factory ...
        return new Square(); 	}

    public static void main (String args[])
    {
        Rectangle r = new Square();//Client.getNewRectangle();
        r.setWidth(5);	r.setHeight(10);
        System.out.println(r.getArea());

        //Rectangle r2 = new Rectangle();//Client.getNewRectangle();
        r.setWidth(5);	r.setHeight(10);
        System.out.println(r.getArea());

    }


}

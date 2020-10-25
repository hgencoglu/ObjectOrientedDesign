package LiskovSubstitution;

public class Square extends Rectangle {
    public void setWidth(int width){
        m_width = width;  m_height = width;
        System.out.println("Square setWidth");
    }
    public void setHeight(int height){
        m_width = height; m_height = height;
        System.out.println("Square setHeight");
    }
}

package BehavioralPatterns.VisitorDesignPattern;

public class Client {

    public static void main(String[] args){
        ComputerPart cp = new Computer();
        cp.accept(new ComputerPartDisplayVisitor());
    }
}

package BehavioralPatterns.VisitorDesignPattern;

public class Printer implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

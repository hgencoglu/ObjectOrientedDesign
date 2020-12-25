package BehavioralPatterns.VisitorDesignPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

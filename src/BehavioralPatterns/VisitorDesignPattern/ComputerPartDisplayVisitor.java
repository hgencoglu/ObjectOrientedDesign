package BehavioralPatterns.VisitorDesignPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Bilgisayar Görüntüleniyor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Fare Görüntüleniyor");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Klavye Görüntüleniyor");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitör Görüntüleniyor");
    }

    @Override
    public void visit(Printer printer) {
        System.out.println("Printer Görüntüleniyor");
    }
}

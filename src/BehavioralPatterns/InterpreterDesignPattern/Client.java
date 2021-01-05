package BehavioralPatterns.InterpreterDesignPattern;

public class Client {
    //İki Expression erkek
    public static Expression getMaleExpression(){
        Expression hakan = new TerminalExpression("Hakan");
        Expression Mehmet = new TerminalExpression("Mehmet");
        return new VeyaKomutu(hakan,Mehmet);
    }

    //kisinin Evli olması
    public static Expression getMarriedOne(){
        Expression hakan = new TerminalExpression("Hakan");
        Expression evli = new TerminalExpression("Evli");
        return new VeKomutu(hakan, evli);
    }

    public static void main(String[] args) {
        Expression erkekMi = getMaleExpression();
        Expression evliMi=getMarriedOne();

        System.out.println("Hakan bir erkek mi?: "
                +erkekMi.interpreter("hakan"));

        System.out.println("Hakan Evli mi? "
                + evliMi.interpreter("Hakan"));

    }
}

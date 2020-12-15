package BehavioralPatterns.TemplatePattern;

public abstract class Oyun {

    abstract void initialize();
    abstract void basla();
    abstract void bitir();

    public void oyna(){
        initialize();
        basla();
        bitir();

    }


}

package BehavioralPatterns.TemplatePattern;

public class Dama extends Oyun{
    @Override
    void initialize() {
        System.out.println("Dama Oyununun Gereksinimleri Yüklendi");
    }

    @Override
    void basla() {
        System.out.println("Dama Oyunu başladı");
    }

    @Override
    void bitir() {
        System.out.println("Dama Oyunu bitti");
    }
}

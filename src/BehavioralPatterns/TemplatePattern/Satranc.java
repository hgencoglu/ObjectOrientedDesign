package BehavioralPatterns.TemplatePattern;

public class Satranc extends Oyun {
    @Override
    void initialize() {
        System.out.println("Satranc Oyununun Gereksinimleri Yüklendi");
    }

    @Override
    void basla() {
        System.out.println("Satranc Oyunu başladı");
    }

    @Override
    void bitir() {
        System.out.println("Satranc Oyunu bitti");
    }
}

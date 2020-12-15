package BehavioralPatterns.StrategyPattern;

public class Toplama implements IStrategy {
    @Override
    public double hesaplama(double a, double b) {
        return a+b;
    }
}
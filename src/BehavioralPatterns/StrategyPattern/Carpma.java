package BehavioralPatterns.StrategyPattern;

public class Carpma implements IStrategy {
    @Override
    public double hesaplama(double a, double b) {
        return a*b;
    }
}

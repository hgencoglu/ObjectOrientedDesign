package BehavioralPatterns.ChainOfResponsibilityPattern;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level=level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Error Logger Info: "+msg);
    }
}

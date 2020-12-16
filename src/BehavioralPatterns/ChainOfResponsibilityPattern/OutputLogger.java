package BehavioralPatterns.ChainOfResponsibilityPattern;

public class OutputLogger extends Logger {
    public OutputLogger(int level) {
    this.level=level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Output Logger Info="+msg);
    }
}

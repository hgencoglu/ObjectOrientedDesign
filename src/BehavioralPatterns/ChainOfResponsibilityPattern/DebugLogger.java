package BehavioralPatterns.ChainOfResponsibilityPattern;

public class DebugLogger extends Logger{
    public DebugLogger(int level){
        this.level=level;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Debugger Logger Info="+msg);
    }
}

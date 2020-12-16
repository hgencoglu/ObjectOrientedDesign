package BehavioralPatterns.ChainOfResponsibilityPattern;

public abstract class Logger {
    public static int outputinfo=1;
    public static int errorinfo=2;
    public static int debuginfo=3;

    protected int level;
    protected Logger sonraki;
    public void setSonraki(Logger sonraki){
        this.sonraki=sonraki;
    }
    public void logMessage(int level,String message){
        if(this.level<=level){
            displayLogInfo(message);
        }

        if (sonraki!=null){
            sonraki.logMessage(level,message);
        }
    }
    protected abstract void displayLogInfo(String msg);


}

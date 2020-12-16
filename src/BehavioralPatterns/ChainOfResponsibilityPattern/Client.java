package BehavioralPatterns.ChainOfResponsibilityPattern;

public class Client {
    private static Logger zincir(){
        Logger outputLogger = new OutputLogger(Logger.outputinfo);
        Logger errorLogger = new ErrorLogger(Logger.errorinfo);
        outputLogger.setSonraki(errorLogger);
        Logger debugLogger = new DebugLogger(Logger.debuginfo);
        errorLogger.setSonraki(debugLogger);
        return outputLogger;
    }

    public static  void main(String[] args){
        Logger zincirLogger = zincir();
        zincirLogger.logMessage(Logger.outputinfo,"output seviyesi");
        zincirLogger.logMessage(Logger.errorinfo,"error seviyesi");
        zincirLogger.logMessage(Logger.debuginfo,"debug seviyesi");
    }
}

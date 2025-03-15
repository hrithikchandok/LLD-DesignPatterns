package ChainOfResponsibiltiy;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void Log(int loglevel,String message)
    {
        if(loglevel==1)
            System.out.println("ERROR LOG"+message);
        else if(nextLogProcessor!=null)
            super.Log(loglevel,message);
    }
}

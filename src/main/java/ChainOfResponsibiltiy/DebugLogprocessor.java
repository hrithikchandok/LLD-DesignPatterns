package ChainOfResponsibiltiy;

public class DebugLogprocessor extends LogProcessor {
    DebugLogprocessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void Log(int loglevel,String message)
    {
        if(loglevel==2)
            System.out.println("DEBUG LOG"+message);
        else if(nextLogProcessor!=null)
            super.Log(loglevel,message);
    }
}

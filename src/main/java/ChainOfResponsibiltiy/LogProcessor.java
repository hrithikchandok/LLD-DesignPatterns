package ChainOfResponsibiltiy;

public abstract class LogProcessor
{
    private static  int INFO=0;
    private static  int DEBUG=1;
    private static  int ERROR=2;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor)
    {
        this.nextLogProcessor=nextLogProcessor;
    }

    void Log(int loglevel,String message)
    {
        if(nextLogProcessor!=null)
            nextLogProcessor.Log(loglevel,message);
    }



}

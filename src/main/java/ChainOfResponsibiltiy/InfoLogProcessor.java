package ChainOfResponsibiltiy;

public class InfoLogProcessor extends LogProcessor
{
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void Log(int loglevel,String message)
    {
        if(loglevel==0)
            System.out.println("INFO LOG"+message);
        else if(nextLogProcessor!=null)
            super.Log(loglevel,message);
    }
}

package ChainOfResponsibiltiy;

public class Main
{
    public static void main(String[] args){
        LogProcessor log=new InfoLogProcessor(new ErrorLogProcessor(new DebugLogprocessor(null)));

        log.Log(1,"this is Error Messgae ");
        log.Log(0,"IInfo medssdsgae");
        log.Log(2," Debug medssdsgae");

    }
}

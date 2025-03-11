package LoggingFramework;

public class ConsoleAppender implements LogAppender{
    @Override
    public void append(LogLevel logLevel, LogginMessage message) {
         System.out.println(logLevel + ": " + message+":"+"ConsoleAppender");
    }
}

package LoggingFramework;

public class LoggerConfig
{
    LogAppender appender;
    LogLevel level;

    public LoggerConfig(LogAppender appender, LogLevel level) {
        this.appender = appender;
        this.level = level;
    }

}

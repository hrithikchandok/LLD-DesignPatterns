package LoggingFramework;


import java.sql.SQLException;

//singelton Class
public class Logger {
    private static Logger instance = null;
    LoggerConfig config;
    LogginMessage message;

//    public LoggerConfig getConfig() {
//        return config;
//    }

    public void setConfig(LoggerConfig config) {
        this.config = config;
    }

    private Logger()
    {
       config=new LoggerConfig(new ConsoleAppender(), LogLevel.INFO);
    }
    static Logger getInstance()
    {
        if(instance == null)
            instance = new Logger();
        return instance;
    }
    private void log(LogLevel level, String message) throws ClassNotFoundException, SQLException {
        if(level.ordinal()>=config.level.ordinal())
        {
            LogginMessage logginMessage = new LogginMessage(level, message);
            config.appender.append(level,logginMessage);
        }

    }




    void info(String message) throws ClassNotFoundException, SQLException {
        log(LogLevel.INFO, message);
    }
    void debug(String message) throws ClassNotFoundException, SQLException {
        log(LogLevel.DEBUG, message);
    }
    void error(String message) throws ClassNotFoundException, SQLException {
        log(LogLevel.ERROR, message);
    }
    void fatal(String message) throws ClassNotFoundException, SQLException {
        log(LogLevel.FATAL, message);
    }
    void warn(String message) throws ClassNotFoundException, SQLException {
        log(LogLevel.WARN, message);
    }



}

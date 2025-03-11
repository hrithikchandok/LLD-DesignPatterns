package LoggingFramework;

import java.sql.SQLException;

public interface LogAppender
{
     void append(LogLevel logLevel, LogginMessage message) throws ClassNotFoundException, SQLException;
}

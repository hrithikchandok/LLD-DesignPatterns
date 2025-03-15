package LoggingFramework;

import java.time.LocalDate;
import java.util.Date;

public class LogginMessage
{
    LogLevel level;
    String message;
    LocalDate timestamp;

    public LogginMessage(LogLevel level, String message) {
        this.level = level;
        this.message = message;
        this.timestamp = LocalDate.now();
    }

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LogginMessage{" +
                "level=" + level +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

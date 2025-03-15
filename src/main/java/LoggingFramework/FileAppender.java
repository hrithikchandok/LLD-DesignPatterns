package LoggingFramework;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class FileAppender implements LogAppender
{

    @Override
    public void append(LogLevel logLevel, LogginMessage message) throws ClassNotFoundException, SQLException
    {
             try(FileWriter fl=new FileWriter("text.txt",true))
             {
                 fl.write(logLevel.toString());
                 fl.write(message.getMessage());
                 fl.write(message.getTimestamp().toString());
                 System.out.println("Inserted in FILE");
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
    }
}

package LoggingFramework;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      Logger l1= Logger.getInstance();

//       l1.info("this is INFO Logging");
//       l1.debug("this is DEBUG Logging");
//       l1.error("this is ERROR Logging");
//       l1.fatal("this is FATAL Logging");

       l1.setConfig(new LoggerConfig(new DbAppender(),LogLevel.ERROR));
       l1.info("this is INFO Logging in DB");
       l1.debug("this is DEBUG Logging in DB");
       l1.error("this is ERROR Logging in DB");
       l1.fatal("this is FATAL Logging in DB");

       l1.setConfig(new LoggerConfig(new FileAppender(),LogLevel.ERROR));
       l1.info("this is INFO Logging in FileAppender");
       l1.error("this is Error Logging in FileAppender");

    }
}

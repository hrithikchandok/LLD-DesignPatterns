package LoggingFramework;

import java.sql.*;
import java.time.LocalDate;

public class DbAppender implements  LogAppender
{
    String url = "jdbc:mysql://localhost:3306/log";
    String user = "root";
    String password = "BhartiDhall@12345";


    @Override
    public void append(LogLevel logLevel, LogginMessage message) throws ClassNotFoundException, SQLException {




        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String insertQuery = "INSERT INTO LOGDB (LogLevel, Message, CreatedDate) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, logLevel.toString());
                preparedStatement.setString(2, message.getMessage());
                preparedStatement.setDate(3, Date.valueOf(message.getTimestamp()));

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully.");
                } else {
                    System.out.println("Failed to insert data.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    }


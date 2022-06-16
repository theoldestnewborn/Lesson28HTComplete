package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RequestsRepository {

    public void DBChange(String name, String request) {
        try (Connection conn = DriverManager.getConnection(
                DBConfig.URL, DBConfig.USER, DBConfig.PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("insert into requests_db (name, request) " +
                    "VALUES ('"+ name + "', '" + request + "');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

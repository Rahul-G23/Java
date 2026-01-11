import java.sql.*;
class DataAccessException extends Exception {
    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
class DBConnection {
    public void query() throws SQLException {
        throw new SQLException("Connection failed");
    }
}
public class pptRahul {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try {
            dbConnection.query();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

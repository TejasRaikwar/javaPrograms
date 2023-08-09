package anudip.JDBC;
import java.sql.*;

public class testConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306","root","");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

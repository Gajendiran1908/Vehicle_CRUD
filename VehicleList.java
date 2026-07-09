package Bikes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VehicleList {

    static String url = "jdbc:mysql://localhost:3306/vehicle_db";
    static String user = "root";
    static String password = "gajendiran@123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
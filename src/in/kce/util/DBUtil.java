package in.kce.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    public static Connection getConnection() {
        Connection connection = null;

        try {
        	Class.forName("oracle.jdbc.OracleDriver");

            connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@172.16.100.14:1521:orcll",
                "i717824219",
                "i717824219"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
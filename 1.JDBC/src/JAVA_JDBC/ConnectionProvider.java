package JAVA_JDBC;

import ConnectionProvider.*;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp pavailion
 */
public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {

            if (con == null) {

                Class.forName("org.postgresql.Driver");

                String url = "jdbc:postgresql://localhost:5432/postgres";
                String username = "postgres";
                String password = "postgres";

                con = (Connection) DriverManager.getConnection(url, username, password);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }

}

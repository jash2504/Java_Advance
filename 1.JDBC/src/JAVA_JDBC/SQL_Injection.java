package JAVA_JDBC;

import java.util.*;
import java.sql.*;

public class SQL_Injection {

    public static void main(String[] args) throws SQLException {
        try {

            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username1 = "postgres";
            String password1 = "postgres";

            Connection c = DriverManager.getConnection(url, username1, password1);

            Scanner in = new Scanner(System.in);
            System.out.println("Enter username:");
            String uname = in.nextLine();
            System.out.println("Enter password:");
            String pwd = in.nextLine();

//            ' or ''='
            String s = "SELECT * FROM login WHERE username='" + uname + "' AND password ='" + pwd + "'";
            PreparedStatement stmt;
            stmt = c.prepareStatement(s);

            ResultSet rs = stmt.executeQuery();
            System.out.println(s);

            while (rs.next()) {
                String username = rs.getString(1);
                String password = rs.getString(2);

                System.out.println("username" + ": " + username + " ,password : " + password);
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}

package JAVA_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class SQL_Injection_Prevention {

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username1 = "postgres";
            String password1 = "postgres";

            Connection c = DriverManager.getConnection(url, username1, password1);

            Scanner in = new Scanner(System.in);
            System.out.println("enter username:");
            String uname = in.nextLine();
            System.out.println("enter password:");
            String pwd = in.nextLine();

//            ' or ''='
            String s = "select * from public.login where username=? and password=?";

            PreparedStatement stmt;
            stmt = c.prepareStatement(s);

            stmt.setString(1, uname);
            stmt.setString(2, pwd);

            ResultSet set = stmt.executeQuery();

            while (set.next()) {
                System.out.println("\n username: " + set.getString(1) + " ,password: " + set.getString(2));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

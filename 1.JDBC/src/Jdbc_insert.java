// Java program to execute a query using PreparedStatement

import java.sql.*;

public class Jdbc_insert {

    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        String query = "select *from main where id=1 or '1'='1' and name='kash'  ";
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
        con.close();
    }
}

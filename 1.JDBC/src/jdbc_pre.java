// Java program to execute a query using PreparedStatement

import java.sql.*;

public class jdbc_pre {

    // Driver Code
    public static void main(String[] args) throws Exception {

//        try {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

        String q = "delete from main where id=? or '1'='1'  ";

//             Statement stmt = con.createStatement();
        PreparedStatement stmt = con.prepareStatement(q);
        PreparedStatement stmt1 = con.prepareStatement("select * from student");

        stmt.setInt(1, 4);
        //stmt.setString(2, "jeel");
        int i = stmt.executeUpdate();
//          stmt.setInt(1,5);
//          stmt.setString(2, "Rakshansh");
//          int i1 = stmt.executeUpdate();
        ResultSet rs = stmt1.executeQuery();
        System.out.println("age    Name");

        while (rs.next()) {
            String name = rs.getString("student_name");
            int id = rs.getInt("id");

            System.out.println(name + "   " + id);
        }

        con.close();

//        } catch  {
//
//        }
    }
}

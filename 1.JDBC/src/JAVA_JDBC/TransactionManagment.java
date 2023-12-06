package JAVA_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class TransactionManagment {

    public static void main(String[] args) {

        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            con.setAutoCommit(false);
//
//
//
            PreparedStatement pr = con.prepareStatement("select * from student where id=?");
            pr.setString(1, "S103");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + "        " + rs.getString(2));
            }

            con.commit();
            System.out.println("commited");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            try {
                con.rollback();
                System.out.println("transaction rollback");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }

}

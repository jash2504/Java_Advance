/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hp pavailion
 */
public class Jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.LOGGIN");

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                // System.out.print("ID: " + rs.getString("NAME"));
                System.out.print("Name: " + rs.getString("NAME"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

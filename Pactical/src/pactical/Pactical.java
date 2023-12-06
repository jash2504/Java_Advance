package pactical;

import java.sql.*;

public class Pactical {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

            String name = "jash";
            String s1 = "' or '2'='2";
            String s = "select * from login where username='" + s1 + "'";
//            String s = "select * from login where username=?";

            Statement st = connection.createStatement();
//            PreparedStatement st = connection.prepareStatement(s);
//            st.setString(1, s1);

            ResultSet rs = st.executeQuery(s);

            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
//            ps.close();
            st.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

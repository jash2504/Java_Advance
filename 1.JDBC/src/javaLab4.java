
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Database1 extends Frame implements ActionListener {

    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    Label l1 = new Label("ID");
    Label l2 = new Label("Name");
    Button b1, b2, b3, b4;
    String s1, s2;

    Database1() {
        b1 = new Button("Insert");
        b2 = new Button("View");
        b3 = new Button("Update");
        b4 = new Button("Delete");
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s1 = t1.getText();
        s2 = t2.getText();
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres ", "postgres", "postgres");
            Statement st = c.createStatement();
            if (e.getSource() == b1) {
                int i = st.executeUpdate("insert into student1 values ('" + s1 + "','" + s2 + "')");
                System.out.println("Insert successfully---------");
            }
            if (e.getSource() == b2) {
                ResultSet rs = st.executeQuery("select * from student1");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "        " + rs.getString(2));
                }
                System.out.println("displayed successfully-----------------");
            }
            if (e.getSource() == b3) {
                int i = st.executeUpdate("update student1 set name='" + s2 + "' where s_id='" + s1 + "'");
                System.out.println("Update successfully---------");
            }
            if (e.getSource() == b4) {
                int i = st.executeUpdate("delete from student1 where s_id='" + s1 + "'");
                System.out.println("Delete successfully---------");
            }
            st.close();
            c.close();
        } catch (ClassNotFoundException | SQLException h) {
            System.out.println(h);
        }
    }
}

public class javaLab4 {

    public static void main(String[] args) {
        Database1 d1 = new Database1();
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            System.out.println("Connected successfully------");
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from student1;");

            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
            st.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}

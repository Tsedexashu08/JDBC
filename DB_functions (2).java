import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import  java.util.Scanner;

public class DB_functions extends searchWindow {
    JFrame f=new JFrame("Current Employees");
        JPanel panel=new JPanel();
        JLabel ID=new JLabel("ID");
        JLabel Name=new JLabel("Name");
        JLabel Age=new JLabel("Age");
    JButton back=new JButton("back");

  JPanel p3=new JPanel();

        void ShowEmployees(){
          goBack();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "tsedex", "6390");

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery( "SELECT * FROM staff");

                // this is how to get the column count and column names from the result set apparently?!
                int columnCount = resultSet.getMetaData().getColumnCount();//this gets no. of columns.
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = resultSet.getMetaData().getColumnName(i);
                }

                //this is a DefaultTableModel with the retrieved data and column names
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (resultSet.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = resultSet.getObject(i);
                    }
                    model.addRow(rowData);
                }

                JTable table = new JTable(model);



                p3.add(back);


                JScrollPane scrollPane = new JScrollPane(table);

                JFrame frame = new JFrame("Current Employees");
                back.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent e) {new GUI();frame.dispose();}
                    public void mousePressed(MouseEvent e) {}
                    public void mouseReleased(MouseEvent e) {}
                    public void mouseEntered(MouseEvent e) {}
                    public void mouseExited(MouseEvent e) {}
                });
                frame.setSize(800,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(p3,BorderLayout.SOUTH);
                frame.add(scrollPane);
//                frame.pack();
                frame.setVisible(true);



            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        public  void Insert(String a,String b,String c,String d,String e,String f,String g,String h,String i){

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/employee","root","6390");
                Statement stmt=con.createStatement();
                String squery="insert into staff values("+a+","+"'"+b+"'"+","+"'"+c+"'"+","+"'"+d+"'"+","+"'"+e+"'"+","+"'"+f+"'"+","+"'"+g+"'"+","+"'"+h+"'"+","+"'"+i+"'"+")";
                stmt.execute(squery);
               setSize(500,500);

                con.close();
            }catch(Exception q){ System.out.println(q);}

        }
   public void SearchEmp(String attr,String n){
            JButton bck=new JButton("back");
            JPanel spanel=new JPanel();
       try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "tsedex", "6390");

           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery("select * from staff where "+ attr +" =" + "'"+n+"'");

           // this is how to get the column count and column names from the result set apparently?!
           int columnCount = resultSet.getMetaData().getColumnCount();//this gets no. of columns.
           String[] columnNames = new String[columnCount];
           for (int i = 1; i <= columnCount; i++) {
               columnNames[i - 1] = resultSet.getMetaData().getColumnName(i);
           }

           //this is a DefaultTableModel with the retrieved data and column names
           DefaultTableModel model = new DefaultTableModel(columnNames, 0);
           while (resultSet.next()) {
               Object[] rowData = new Object[columnCount];
               for (int i = 1; i <= columnCount; i++) {
                   rowData[i - 1] = resultSet.getObject(i);
               }
               model.addRow(rowData);
           }

           JTable table = new JTable(model);


           JScrollPane scrollPane = new JScrollPane(table);

           JFrame frame = new JFrame("Current Employees");
           spanel.add(bck);
           frame.add(spanel,BorderLayout.SOUTH);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(scrollPane);
           frame.setSize(800,500);
//           frame.pack();
           frame.setVisible(true);
           bck.addMouseListener(new MouseListener() {
               public void mouseClicked(MouseEvent e) {new searchWindow("search");frame.dispose();dispose();}
               public void mousePressed(MouseEvent e) {}
               public void mouseReleased(MouseEvent e) {}
               public void mouseEntered(MouseEvent e) {}
               public void mouseExited(MouseEvent e) {}
           });

       } catch (SQLException e) {
           e.printStackTrace();
       }



    }
    public void Delete(String attr,String n){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","root","6390");
            Statement stmt=con.createStatement();
            stmt.execute("delete from staff where "+ attr +" =" + "'"+n+"'");
            setSize(500,500);

            con.close();
        }catch(Exception q){ System.out.println(q);}

    }
}


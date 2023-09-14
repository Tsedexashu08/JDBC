import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

class DB_connect {

   DB_connect() { try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","root","tsedalu7");
            Statement stmt=con.createStatement();
            String squery="select * from staff ";
            ResultSet rs=stmt.executeQuery(squery);
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)
                        +" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)
                        +" "+rs.getInt(9));
            con.close();
        }catch(Exception e){ System.out.println(e);}}

    public static void main(String[] args) {
        new DB_connect();
    }

}

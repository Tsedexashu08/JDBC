import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.text.JTextComponent;



public class GUI extends DataBase{
    JFrame window=new JFrame("Employee Data Base");
    JButton insert=new JButton("Add Employee");
    JButton showEmployees=new JButton("Show Employees");
    JButton delete=new JButton("Delete Employee");
    JButton SearchEmployee=new JButton("Search Employee");

    JPanel panel = new JPanel();



  GUI(){
      window.setVisible(true);
      window.setSize(500,500);
      window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      panel.add(insert);
      panel.add(showEmployees);
      panel.add(SearchEmployee);
      panel.add(delete);
//      panel.add(Box.createVerticalGlue());
      window.add(panel, BorderLayout.CENTER);
      DB_functions x=new DB_functions();
       showEmployees.addMouseListener(new MouseListener() {
           public void mouseClicked(MouseEvent e) {x.ShowEmployees();window.dispose();}
           public void mousePressed(MouseEvent e) {}
           public void mouseReleased(MouseEvent e) {}
           public void mouseEntered(MouseEvent e) {}
           public void mouseExited(MouseEvent e) {}
       });
       insert.addMouseListener(new MouseListener() {
           public void mouseClicked(MouseEvent e) {new DataBase("insertion");window.dispose();}
           public void mousePressed(MouseEvent e) {}
           public void mouseReleased(MouseEvent e) {}
           public void mouseEntered(MouseEvent e) {}
           public void mouseExited(MouseEvent e) {}
       });
       delete.addMouseListener(new MouseListener() {
           public void mouseClicked(MouseEvent e) {new DeleteWindows("delete");window.dispose();}
           public void mousePressed(MouseEvent e) {}
           public void mouseReleased(MouseEvent e) {}
           public void mouseEntered(MouseEvent e) {}
           public void mouseExited(MouseEvent e) {}
       });
       SearchEmployee.addMouseListener(new MouseListener() {
           public void mouseClicked(MouseEvent e) {new searchWindow("search");window.dispose();}
           public void mousePressed(MouseEvent e) {}
           public void mouseReleased(MouseEvent e) {}
           public void mouseEntered(MouseEvent e) {}
           public void mouseExited(MouseEvent e) {}
       });


  }

    public static void main(String[] args) {
        new GUI();
    }
}

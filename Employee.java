import javax.swing.*;
import java.awt.*;

public class Employee extends JFrame{
    JButton Insert;
    JButton Search;
    JButton delete;
    JButton Viewtable;
    JPanel p1;
          Employee(){
              setVisible(true);
              setSize(500,500);
              p1.add(Insert);

          }

    public static void main(String[] args) {
        new Employee();
    }

}

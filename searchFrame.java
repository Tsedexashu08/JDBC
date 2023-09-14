import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class searchFrame extends JFrame {
    JLabel byFirstname = new JLabel("First name");
    JButton back=new JButton("back");

    JTextField byfn = new JTextField(30);
    JLabel byLastname = new JLabel("Last name");
    JTextField byln = new JTextField(30);
    JLabel bySkill = new JLabel("Skill");
    JTextField byskl = new JTextField(30);
    JLabel bySkilltype = new JLabel("Skill Type");
    JTextField bystyp = new JTextField(30);
    JLabel bySchool = new JLabel("School");
    JTextField byschl = new JTextField(30);
    JLabel bySchoolAdd = new JLabel("School Address");
    JTextField byschAdd = new JTextField(30);
    JLabel bySex = new JLabel("Gender");
    JTextField bysx = new JTextField(30);
    JLabel byId = new JLabel("ID");
    JTextField byid = new JTextField(30);
    JLabel bySkilllvl = new JLabel("Skill Lvl");
    JTextField byskllvl = new JTextField(30);
    JPanel p2 = new JPanel();
    JFrame swindow = new JFrame("Search Window");
    JPanel panel1 = new JPanel();
    JButton search = new JButton("search");
    void goBack(){ back.addMouseListener(new MouseListener() {
        public void mouseClicked(MouseEvent e) {new searchWindow("go back");dispose();}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    });}

    void searchFrame1() {
        setTitle("By Name");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(byFirstname);
        panel1.add(byfn);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("FirstName",byfn.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
       goBack();
    }

    void searchFrame2() {
        setTitle("By Last Name");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(byLastname);
        panel1.add(byln);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("LastName",byln.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        goBack();
    }

    void searchFrame3() {
        setTitle("By Gender");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySex);
        panel1.add(bysx);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("sex",bysx.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    goBack();
    }

    void searchFrame4() {
        setTitle("By Skill");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySkill);
        panel1.add(byskl);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("Skill",byskl.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
       goBack();
    }

    void searchFrame5() {
        setTitle("By School Address");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySchoolAdd);
        panel1.add(byschAdd);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("SchoolAdd",byschAdd.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
       goBack();
    }

    void searchFrame6() {
        setTitle("By School");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySchool);
        panel1.add(byschl);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("School",byschl.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
       goBack();
    }

    void searchFrame7() {
        setTitle("By Skill Type");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySkilltype);
        panel1.add(bystyp);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("SkillType",bystyp.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        goBack();
    }

    void searchFrame8() {
        setTitle("By ID");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(byId);
        panel1.add(byid);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("Empid",byid.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        goBack();

    }

    void searchFrame9() {
        setTitle("By Skill Level");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySkilllvl);
        panel1.add(byskllvl);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().SearchEmp("SkillLevel",byskllvl.getText());}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        goBack();
    }
}

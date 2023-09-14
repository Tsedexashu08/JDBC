import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DeleteFrames extends JFrame {
    JLabel byFirstname = new JLabel("First name");

    JTextField byfn = new JTextField(30);
    JLabel byLastname = new JLabel("Last name");
    JTextField byln = new JTextField(30);
    JLabel bySkill = new JLabel("Skill");
    JTextField byskl = new JTextField(30);
    JLabel bySkilltype = new JLabel("Skill Type");
    JTextField bystyp = new JTextField(30);
    JButton back=new JButton("Back");
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
    JButton search = new JButton("Delete");

    void deleteFrame1() {
        setTitle("By Name");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(byFirstname);
        panel1.add(byfn);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("FirstName",byfn.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame2() {
        setTitle("By Last Name");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(byLastname);
        panel1.add(byln);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("LastName",byln.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame3() {
        setTitle("By Gender");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySex);
        panel1.add(bysx);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("sex",bysx.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame4() {
        setTitle("By Skill");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySkill);
        panel1.add(byskl);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("Skill",byskl.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame5() {
        setTitle("By School Address");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySchoolAdd);
        panel1.add(byschAdd);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("SchoolAdd",byschAdd.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame6() {
        setTitle("By School");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySchool);
        panel1.add(byschl);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("School",byschl.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame7() {
        setTitle("By Skill Type");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySkilltype);
        panel1.add(bystyp);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("SkillType",bystyp.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    void deleteFrame8() {
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
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("Empid",byid.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        goBack();
    }
    void goBack(){ this.back.addMouseListener(new MouseListener() {
        public void mouseClicked(MouseEvent e) {new DeleteWindows("go back");dispose();}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    });}

    void deleteFrame9() {
        setTitle("By Skill Level");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        panel1.add(bySkilllvl);
        panel1.add(byskllvl);
        panel1.add(search);
        panel1.add(back);
        add(panel1);
        goBack();
        search.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DB_functions().Delete("SkillLevel",byskllvl.getText());search.setText("Record Deleted");}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DeleteWindows extends DeleteFrames{
    DeleteWindows(){}
    JButton back=new JButton("back");
    void goBack(){ back.addMouseListener(new MouseListener() {
        public void mouseClicked(MouseEvent e) {new GUI();dispose();}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    });}

    JButton byFirstname=new JButton("By First name");
    JPanel p3=new JPanel();

    JTextField byfn=new JTextField(25);
    JButton byLastname=new JButton("By last name");
    JTextField byln=new JTextField(25);
    JButton bySkill=new JButton("By Skill");
    JTextField byskl=new JTextField(25);
    JButton bySkilltype=new JButton("By Skill Type");
    JTextField bystyp=new JTextField(25);
    JButton bySchool=new JButton("By School");
    JTextField byschl=new JTextField(25);
    JButton bySchoolAdd=new JButton("By School Address");
    JTextField byschAdd=new JTextField(25);
    JButton  bySex=new JButton("By Gender");
    JTextField bysx=new JTextField(25);
    JButton byId=new JButton("By ID");
    JTextField byid=new JTextField(25);
    JButton bySkilllvl=new JButton("By Skill Lvl");
    JTextField byskllvl=new JTextField(25);
    JPanel p2=new JPanel();
    DeleteWindows(String choice){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        p2.add(byFirstname);
        byFirstname.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DeleteFrames().deleteFrame1();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2.add(byLastname);
        byLastname.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DeleteFrames().deleteFrame2();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2.add(byId);
        byId.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DeleteFrames().deleteFrame8();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2. add(bySchool);
        bySchool.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DeleteFrames().deleteFrame6();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2.add(bySex);
        bySex.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new DeleteFrames().deleteFrame3();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2.add(bySchoolAdd);
        bySchoolAdd.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){new DeleteFrames().deleteFrame5();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2. add(bySkill);
        bySkill.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){new DeleteFrames().deleteFrame4();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2.add(bySkilllvl);
        bySkilllvl.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){new DeleteFrames().deleteFrame9();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        p2.add(bySkilltype);
        bySkilltype.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){new DeleteFrames().deleteFrame7();dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        this.goBack();
        this.p3.add(back);
        add(p2);
        add(this.p3, BorderLayout.SOUTH);



    }
}

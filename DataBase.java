import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractButton;
public class DataBase {
    JFrame window = new JFrame("Employee Data Base");
    JPanel panel = new JPanel();
    JButton back=new JButton("back");
    JPanel p=new JPanel();
    JTextField txt = new JTextField("search or enter first name");
    JTextField txt1 = new JTextField("search or enter last name");
    JTextField sx=new JTextField("sex");
    JTextField school=new JTextField("enter school name");
    JTextField schooladd=new JTextField("enter your School Address");
    JTextField skilllvl=new JTextField("enter skill level");
    JTextField txt2 = new JTextField("search or enter employee ID");
    JTextField txt3 = new JTextField("search or enter skill");
    JTextField txt4 = new JTextField("search or enter skill type");
    JLabel name = new JLabel(" First Name");
    JLabel lname = new JLabel("Last Name");
    JLabel Id = new JLabel("EMPID       ");
    JLabel skill = new JLabel("Skill            ");
    JLabel skilltype = new JLabel("Skill type   ");
    JLabel sex = new JLabel("Sex       ");
    JLabel school___ = new JLabel("School     ");
    JLabel SchoolAdd = new JLabel("School Address");
    JLabel Slvl = new JLabel("Skill Level");
    JButton show = new JButton("Show table");
    JButton search = new JButton("Search");
    JButton Insert = new JButton("Insert");
 JPanel bpanel=new JPanel();

  DataBase(){}
    DataBase(String x) {
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(600, 500);

        txt.setBackground(Color.white);
        txt.setColumns(38);
        sx.setBackground(Color.white);
        sx.setColumns(40);
        school.setColumns(40);
        schooladd.setColumns(36);
        skilllvl.setColumns(40);
        txt1.setColumns(38);
        txt2.setColumns(40);
        txt3.setColumns(40);
        txt4.setColumns(40);
//        Insert.setLocation(400, 60);
//button event.
    /*   Insert.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(e.getSource()==Insert){
//                   txt.selectAll();
               }
           }
       });*/

        txt.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == txt) txt.selectAll();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        txt1.addMouseListener(new

                                      MouseListener() {
                                          public void mouseClicked(MouseEvent e) {
                                              if (e.getSource() == txt1) txt1.selectAll();
                                          }

                                          public void mousePressed(MouseEvent e) {
                                          }

                                          public void mouseReleased(MouseEvent e) {
                                          }

                                          public void mouseEntered(MouseEvent e) {
                                          }

                                          public void mouseExited(MouseEvent e) {
                                          }
                                      });
        txt2.addMouseListener(new

                                      MouseListener() {
                                          public void mouseClicked(MouseEvent e) {
                                              if (e.getSource() == txt2) txt2.selectAll();
                                          }

                                          public void mousePressed(MouseEvent e) {
                                          }

                                          public void mouseReleased(MouseEvent e) {
                                          }

                                          public void mouseEntered(MouseEvent e) {
                                          }

                                          public void mouseExited(MouseEvent e) {
                                          }
                                      });
        txt3.addMouseListener(new

                                      MouseListener() {
                                          public void mouseClicked(MouseEvent e) {
                                              if (e.getSource() == txt3) txt3.selectAll();
                                          }

                                          public void mousePressed(MouseEvent e) {
                                          }

                                          public void mouseReleased(MouseEvent e) {
                                          }

                                          public void mouseEntered(MouseEvent e) {
                                          }

                                          public void mouseExited(MouseEvent e) {
                                          }
                                      });
        back.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {new GUI();window.dispose();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        txt4.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == txt4) txt4.selectAll();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        sx.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {sx.selectAll();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {

            }
        });
        schooladd.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {schooladd.selectAll();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {

            }
        });
        school.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {school.selectAll();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {

            }
        });
        skilllvl.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {skilllvl.selectAll();}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {

            }
        });
        Insert.addMouseListener(new MouseListener() {


            public void mouseClicked(MouseEvent e) {
                String eid=txt2.getText();
                String fname=txt.getText();
                String lname=txt1.getText();
                String sex=sx.getText();
                String sklvl=skilllvl.getText();
                String sch=school.getText();
                String schAdd=schooladd.getText();
                String  skltyp=txt4.getText();
                String skl=txt3.getText();
                new DB_functions().Insert(eid,fname,lname,sex,skl,skltyp,sch,schAdd,sklvl);
                Insert.setText("you have successfully added an employee!");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        //button event




        panel.add(txt);
        panel.add(name);
        panel.add(txt1);
        panel.add(lname);
        panel.add(sx);
        panel.add(sex);
        panel.add(txt2);
        panel.add(Id);
        panel.add(school);
        panel.add(school___);
        panel.add(schooladd);
        panel.add(SchoolAdd);
        panel.add(skilllvl);
        panel.add(Slvl);
        panel.add(txt3);
        panel.add(skill);
        window.add(panel);
        panel.add(txt4);
        panel.add(skilltype);
       panel.add(Insert);
       panel.add(back);
//        window.add(bpanel);
        window.add(panel);


    }



    public static void main(String[] args) {
        new DataBase("start");
    }

}

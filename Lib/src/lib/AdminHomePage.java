
package lib;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class AdminHomePage extends JFrame implements ActionListener{
    JMenuBar jmb;
    JMenu jm1,jm2,jm3,jm4,jm5,m3,m4,m5,m8;
    JMenuItem m1,m2,m6,m7,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21;
    ImageIcon img,img1,img2,img3,img4,img5,img6,img7,img8;
    JLabel a,b,c,d,e,f,g,h,i,l1;
    Font o;

    AdminHomePage()
    {
        setLayout(null);
        setTitle("Admin Homepage");
        setSize(1500,800);
        setLocation(0,0);


        img=new ImageIcon("libcorridor.jpg");
        a=new JLabel("",img,JLabel.CENTER);
        a.setBounds(430,100,600,600);
        add(a);
        img1=new ImageIcon("gal1.jpg");
        b=new JLabel("",img1,JLabel.CENTER);
        b.setBounds(30,100,150,150);
        add(b);
        img2=new ImageIcon("gal2.jpg");
        c=new JLabel("",img2,JLabel.CENTER);
        c.setBounds(130,220,150,150);
        add(c);
        img3=new ImageIcon("gal3.jpg");
        d=new JLabel("",img3,JLabel.CENTER);
        d.setBounds(180,360,150,150);
        add(d);
        img4=new ImageIcon("gal4.jpg");
        e=new JLabel("",img4,JLabel.CENTER);
        e.setBounds(1200,100,150,150);
        add(e);
        img5=new ImageIcon("gal5.jpg");
        f=new JLabel("",img5,JLabel.CENTER);
        f.setBounds(1150,220,150,150);
        add(f);
        img6=new ImageIcon("gal6.jpg");
        g=new JLabel("",img6,JLabel.CENTER);
        g.setBounds(1100,360,150,150);
        add(g);
        img7=new ImageIcon("boy1.jpg");
        h=new JLabel("",img7,JLabel.CENTER);
        h.setBounds(1050,480,150,150);
        add(h);
        img8=new ImageIcon("boy2.jpg");
        i=new JLabel("",img8,JLabel.CENTER);
        i.setBounds(250,480,150,150);
        add(i);
        l1=new JLabel("Welcome To JMIT Library");
        l1.setBounds(430,5,700,150);
        add(l1);
        l1.setForeground(Color.blue);
        setBackground(Color.yellow);

        o=new Font("Monotype corosova",Font.BOLD,50);



        jmb=new JMenuBar();

        jm1=new JMenu("View");
        jm2=new JMenu("Edit");
        jm3=new JMenu("Transaction");
        jm4=new JMenu("Options");
        jm5=new JMenu("Help");



        m1=new JMenuItem("Book Details");
        m2=new JMenuItem("Member Details");
        m3=new JMenu("Book List");
        m8=new JMenu("Member List");

        f1=new JMenuItem("Add a Book");
        f2=new JMenuItem("Remove a Book");
        f3=new JMenuItem("Update Book Details");
        f4=new JMenuItem("Add a new Member");
        f5=new JMenuItem("Remove a Member");
        f6=new JMenuItem("Update Member Details");
        f7=new JMenuItem("Entire Book List");
        f8=new JMenuItem("By BookName");
        f9=new JMenuItem("By Subject");
        f10=new JMenuItem("By Author");
        f11=new JMenuItem("By Publication");
        f14=new JMenuItem("By Member Name");
        f15=new JMenuItem("By Year");
        f16=new JMenuItem("By Course");
        f17=new JMenuItem("By Branch");
        f18=new JMenuItem("By Entire Member List");
        f19=new JMenuItem("Log Out");
        f20=new JMenuItem("About Us");
        f21=new JMenuItem("Add new admin");








        
        jm1.add(m1);
        jm1.addSeparator();
        jm1.add(m2);
        jm1.addSeparator();
        jm1.add(m3);
        jm1.addSeparator();
        jm1.add(m8);

        m4=new JMenu("Book Details");
        m5=new JMenu("Member Details");

        jm2.add(m4);
        jm2.addSeparator();
        jm2.add(m5);

        m6=new JMenuItem("Issue");
        m7=new JMenuItem("Return");
        jm3.add(m6);
        jm3.addSeparator();
        jm3.add(m7);

        jm4.add(f19);
        jm4.addSeparator();
        jm4.add(f21);
        jm5.add(f20);



        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);
        m4.add(f1);
        m4.addSeparator();
        m4.add(f2);
        m4.addSeparator();
        m4.add(f3);
        m5.add(f4);
        m5.addSeparator();
        m5.add(f5);
        m5.addSeparator();
        m5.add(f6);
        m3.add(f8);
        m3.addSeparator();
        m3.add(f9);
        m3.addSeparator();
        m3.add(f10);
        m3.addSeparator();
        m3.add(f11);
        m3.addSeparator();
        m3.add(f7);
        
        m8.add(f14);
        m8.addSeparator();
        m8.add(f15);
        m8.addSeparator();
        m8.add(f16);
        m8.addSeparator();
        m8.add(f17);
        m8.addSeparator();
        m8.add(f18);


        l1.setFont(o);



        



        setJMenuBar(jmb);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        f4.addActionListener(this);
        f5.addActionListener(this);
        f6.addActionListener(this);
        f7.addActionListener(this);
        f8.addActionListener(this);
        f9.addActionListener(this);
        f10.addActionListener(this);
        f11.addActionListener(this);
        f14.addActionListener(this);
        f15.addActionListener(this);
        f16.addActionListener(this);
        f17.addActionListener(this);
        f18.addActionListener(this);
        f19.addActionListener(this);
        f20.addActionListener(this);
        f21.addActionListener(this);












       }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==m1)
        {
            new BookDetails().setVisible(true);
        }
        if(ae.getSource()==m2)
        {
            new MemberDetails().setVisible(true);
        }

        if(ae.getSource()==m6)
        {
            new MemberEnter().setVisible(true);
        }

        if(ae.getSource()==m7)
        {
            new MemberEnter().setVisible(true);
        }


        if(ae.getSource()==f1)
        {
            new BookAdd().setVisible(true);
        }
        if(ae.getSource()==f2)
        {
            new BookRemove().setVisible(true);
        }
        if(ae.getSource()==f3)
        {
            new BookUpdate().setVisible(true);
        }
        if(ae.getSource()==f4)
        {
            new MemberAdd().setVisible(true);
        }
        if(ae.getSource()==f5)
        {
            new MemberRemove().setVisible(true);
        }
        if(ae.getSource()==f6)
        {
            new MemberUpdate().setVisible(true);
        }
        if(ae.getSource()==f8)
        {
            new BookListByName().setVisible(true);
        }
        if(ae.getSource()==f9)
        {
            new BookListBySubject().setVisible(true);
        }
        if(ae.getSource()==f10)
        {
            new BookListByAuthor().setVisible(true);
        }
        if(ae.getSource()==f11)
        {
            new BookListByPublisher().setVisible(true);
        }
        if(ae.getSource()==f7)
        {
            new EntireBookList().setVisible(true);
        }
        if(ae.getSource()==f14)
        {
            new MemberListByName().setVisible(true);
        }

        if(ae.getSource()==f15)
        {
            new MemberListByYear().setVisible(true);
        }

        if(ae.getSource()==f16)
        {
            new MemberListByCourse().setVisible(true);
        }

        if(ae.getSource()==f17)
        {
            new MemberListByBranch().setVisible(true);
        }

        if(ae.getSource()==f18)
        {
            new EntireMemberList().setVisible(true);
        }

        if(ae.getSource()==f19)
        {

        setVisible(false);
        JOptionPane.showMessageDialog(this,"You have logged Out successfully");
        }


        if(ae.getSource()==f20)
        {
            new AboutUs().setVisible(true);
        }

        if(ae.getSource()==f21)
        {
            new AddAdmin().setVisible(true);
        }





    }
public static void main(String ar[])
    {
    AdminHomePage mn=new AdminHomePage();
    mn.setVisible(true);
}
}

package lib;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class MemberListByName extends JFrame implements ActionListener{

    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;


    MemberListByName()
    {
        setLayout(null);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
        }
        catch(Exception e)
        {

        }


    l1=new JLabel("Enter Member Name :");
    l1.setBounds(10,10,150,20);
    add(l1);
    t1=new JTextField();
    t1.setBounds(150,10,230,20);
    add(t1);
    b1=new JButton("View");
    b1.setBounds(390,10,100,20);
    add(b1);
    b1.addActionListener(this);
    b2=new JButton("Back");
    b2.setBounds(500,420,70,20);
    add(b2);
    b2.addActionListener(this);

    setVisible(true);
    setSize(600,500);
    setLocation(300,200);
    setTitle("Member list by Name");



    }
    public void actionPerformed(ActionEvent ae)
    {

        if(ae.getSource()==b1)
        {
            String p=t1.getText();
                           if(p.equals(""))
        {
             JOptionPane.showMessageDialog(this,"Please fill in the Member Name");
        }
 else
                           {
            String a[]={"MemberID","Member Name","Course","Branch","Year"};
    Object data[][]=new Object[150][5];
    JTable tb1 =new JTable(data,a);
    tb1.setGridColor(Color.gray);


    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp=new JScrollPane(tb1,v,h);
    jsp.setBounds(10,50,500,400);
    add(jsp);

    try
        {
        pst=c.prepareStatement("Select * from memberdatabase where Name=?");
        pst.setString(1,p);
        rs=pst.executeQuery();

        int r=0;
    while(rs.next())
    {

     data[r][0]=rs.getString(1);
     data[r][1]=rs.getString(2);
     data[r][2]=rs.getString(3);
     data[r][3]=rs.getString(4);
     data[r][4]=rs.getString(5);

     r++;
    }

    }
    catch(Exception e)
    {

    }}}
    if(ae.getSource()==b2)
        {
            setVisible(false);
        }



    
 }

    public static void main(String ar[])
    {
        MemberListByName b=new MemberListByName();
    }
}

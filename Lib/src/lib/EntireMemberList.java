
package lib;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class  EntireMemberList extends JFrame implements ActionListener {
    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    JButton b1;

    EntireMemberList()
    {
        b1=new JButton("Back");
    b1.setBounds(700,420,70,20);
    add(b1);
    b1.addActionListener(this);

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
        }
        catch(Exception e)
        {

        }

        String a[]={"Member Name","Member ID","Course","Branch","Year"};
    Object data[][]=new Object[150][5];
    JTable tb1 =new JTable(data,a);
    tb1.setGridColor(Color.gray);


        setLayout(null);
    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp=new JScrollPane(tb1,v,h);
    jsp.setBounds(10,10,700,400);
    add(jsp);


    try
        {
        pst=c.prepareStatement("Select * from memberdatabase");
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

    }


    setVisible(true);
    setSize(800,500);
    setLocation(200,200);
    setTitle("Entire Member List");
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            setVisible(false);
        }

    }


    public static void main(String ar[])
    {
        EntireMemberList b=new EntireMemberList();

    }
}

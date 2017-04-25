
package lib;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class BookTransactionHistory extends JFrame implements ActionListener{

    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    JLabel l1,l2;
    JTextField t1;
    JButton b1;


    BookTransactionHistory(String m)
    {
        setTitle("Book Transaction History");
        String m2=m;
        setLayout(null);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
        }
        catch(Exception e)
        {

        }


    /*l1=new JLabel("Enter Author Name :");
    l1.setBounds(10,10,120,20);
    add(l1);
    t1=new JTextField();
    t1.setBounds(130,10,200,20);
    add(t1);*/
    b1=new JButton("Back");
    b1.setBounds(600,420,100,20);
    add(b1);
    b1.addActionListener(this);
        String a[]={"Book Name","Date Of Issue","Date Of Return","Count"};
    Object data[][]=new Object[150][4];
    JTable tb1 =new JTable(data,a);
    tb1.setGridColor(Color.gray);


    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp=new JScrollPane(tb1,v,h);
    jsp.setBounds(5,10,700,400);
    add(jsp);

    try
        {
                pst=c.prepareStatement("Select * from booktransaction where MemberID=?");
        pst.setString(1,m2);
        rs=pst.executeQuery();

        int r=0;
    while(rs.next())
    {

     data[r][0]=rs.getString(2);
     data[r][1]=rs.getString(3);
     data[r][2]=rs.getString(4);
     data[r][3]=rs.getString(5);

     r++;
    }



    }
    catch(Exception e)
    {

    }


    setVisible(true);
    setSize(750,500);
    setLocation(200,100);



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
        BookTransactionHistory b=new BookTransactionHistory("");
    }
}

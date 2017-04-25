
package lib;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class BookListBySubject extends JFrame implements ActionListener{

    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;


    BookListBySubject()
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


    l1=new JLabel("Enter Subject Name :");
    l1.setBounds(10,10,120,20);
    add(l1);
    t1=new JTextField();
    t1.setBounds(130,10,200,20);
    add(t1);
    b1=new JButton("View");
    b1.setBounds(330,10,100,20);
    add(b1);
    b1.addActionListener(this);
    b2=new JButton("Back");
    b2.setBounds(500,420,70,20);
    add(b2);
    b2.addActionListener(this);

    setVisible(true);
    setSize(600,500);
    setLocation(200,200);
    setTitle("Book List By Subject");



    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
            setVisible(false);
        }

        if(ae.getSource()==b1)
        {
            String p=t1.getText();
              if(p.equals(""))
        {
             JOptionPane.showMessageDialog(this,"Please fill in the subject");
        }
 else
              {
            String a[]={"BookID","Book Name","Subject","Author","Publication","Price"};
    Object data[][]=new Object[150][6];
    JTable tb1 =new JTable(data,a);
    tb1.setGridColor(Color.gray);


    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp=new JScrollPane(tb1,v,h);
    jsp.setBounds(10,50,500,400);
    add(jsp);

    try
        {
        pst=c.prepareStatement("Select * from bookdatabase where Subject=?");
        pst.setString(1,p);
        rs=pst.executeQuery();
        int r=0;
    while(rs.next())
    {

     data[r][0]=rs.getString("bookID");
     data[r][1]=rs.getString("BName");
     data[r][2]=rs.getString("Subject");
     data[r][3]=rs.getString("Author");
     data[r][4]=rs.getString("Publisher");
     data[r][5]=rs.getString("Price");

     r++;
    }

    }
    catch(Exception e)
    {

    }


            }
    }
 }

    public static void main(String ar[])
    {
        BookListBySubject b=new BookListBySubject();
    }
}

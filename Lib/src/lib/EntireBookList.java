
package lib;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  EntireBookList extends JFrame implements ActionListener {
    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    JButton b1;
    
    EntireBookList()
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
        
        String a[]={"BookID","Book Name","Subject","Author","Publication","Price"};
    Object data[][]=new Object[150][6];
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
        pst=c.prepareStatement("Select * from bookdatabase");
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


    setVisible(true);
    setSize(800,500);
    setLocation(200,200);
    setTitle("Entire Book List");

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
        EntireBookList b=new EntireBookList();

    }
}

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
java.sql.Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from user1");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
		}
		catch(Exception e)
		 {
		System.out.println(e);
		 }
	}

}

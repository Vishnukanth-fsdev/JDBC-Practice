package ab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) {
		try {
	    	 
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/psaDB","root","9844540598");
	    	 
	    	 Statement stmt=con.createStatement();
	    	 ResultSet rs= stmt.executeQuery("select * from student");
	    	 
	    	 while(rs.next()) {
	    		 System.out.println(rs.getInt(1));
	    		 System.out.println(rs.getString(2));
	    	 }
	    	 
	    	 
	    	 con.close();
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }
	}

}

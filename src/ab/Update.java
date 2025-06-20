package ab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try {
	    	 
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/psaDB","root","9844540598");
	    	 
	    	 Statement stmt=con.createStatement();
	    	 stmt.executeUpdate("update student set name='vishnukanth22' where id=102");
	    	 
	    	 con.close();
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }
	}

}

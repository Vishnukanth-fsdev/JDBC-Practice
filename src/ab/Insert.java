package ab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
     try {
    	 
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/psaDB","root","9844540598");
    	 
    	 Statement stmt=con.createStatement();
    	 stmt.executeUpdate("insert into student values(103,'vishnukanth3')");
    	 
    	 con.close();
     }catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}

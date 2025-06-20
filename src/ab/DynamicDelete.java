package ab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicDelete {

	public static void main(String[] args) {
		try {
	    	 Scanner scan=new Scanner(System.in);
	    	 System.out.println("Enter your id");
	    	 int id=scan.nextInt();
	    	 scan.nextLine();
	    	 
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/psaDB","root","9844540598");
	    	 
	    	 Statement stmt=con.createStatement();
	    	 stmt.executeUpdate("delete from student where id='"+id+"'");
	    	 
	    	 con.close();
	    	 
	    	 
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }

	}

}

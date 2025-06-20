package ab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
     try {
    	 
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter your id");
    	 int id=scan.nextInt();
    	 System.out.println("Enter your name");
    	 String name=scan.next();
    	 scan.nextLine();
    	 
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/psaDB","root","9844540598");
    	 
    	 Statement stmt=con.createStatement();
    	 stmt.executeUpdate("insert into student values('"+id+"','"+name+"');");
    	 
    	 con.close();
    	 
    	 
     }catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}

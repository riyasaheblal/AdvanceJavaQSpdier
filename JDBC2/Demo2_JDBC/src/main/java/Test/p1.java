package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class p1 {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			Statement stmt = con.createStatement();
			//insert table
			//            stmt.executeUpdate("insert into dbqspider.students values(5,'Ram',24)"); 
			//            stmt.executeUpdate("insert into details.employees values(2,'Riya Gupta',2400,'mulund','sl','Developer')");
			//            stmt.executeUpdate("insert into productinfo.products values(1,'Riya',10,20)");
			//update table
			//stmt.executeUpdate("UPDATE dbqspider.students SET name='shyam' WHERE id=5");
			//delete
			stmt.executeUpdate("DELETE FROM dbqspider.students WHERE id=5");
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

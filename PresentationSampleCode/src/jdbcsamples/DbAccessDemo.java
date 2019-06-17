package jdbcsamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbAccessDemo {
	public static void main(String[] args) {
		String connUrl = "jdbc:mysql://localhost:3306/mydb";
		String sql = "SELECT id, name, age FROM employees";
		try(
			Connection connection = DriverManager.
			    getConnection(connUrl, "root", "secret");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
				) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("Id: " + id);
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

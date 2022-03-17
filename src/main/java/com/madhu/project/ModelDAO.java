package com.madhu.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Statement;


public class ModelDAO {

	public void modelList(Model user )throws Exception  {
		//Step 1 : Database Driver ( Optional)
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 2: Get the Connection
				Connection connection = DriverManager.getConnection(
						"jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				System.out.println(connection);
				
				
				String query="INSERT INTO madhu_users (NAME,Email,PASSWORD) VALUES(?,?,?)";
				
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1,user.getName());
				statement.setString(2,user.getEmail());
				statement.setString(3,user.getPassword());
				System.out.println(query);
				
				int rows=statement.executeUpdate();
				System.out.println("No of rows inserted:"+rows);
				
				statement.close();
				connection.close();
				

	}

}

package com.gestion.ustensiles.sql;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Configue {
	public Connection conn;
	public Statement stat;
	public ResultSet rs;
	public void Connect() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/ustensiles", "root" , "");
			//System.out.println("ok");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

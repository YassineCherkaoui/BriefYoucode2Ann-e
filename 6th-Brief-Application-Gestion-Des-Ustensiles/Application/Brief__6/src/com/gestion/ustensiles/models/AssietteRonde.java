package com.gestion.ustensiles.models;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.gestion.ustensiles.sql.Configue;
public class AssietteRonde extends Assiette{
	//Conection
	Configue con = new Configue();
	//Variables
	private int id;
	private double rayon;
	//Costractor
	public AssietteRonde() {}
	public AssietteRonde(int Id,double Rayon,int Anne_de_fabrication) {
		super (Anne_de_fabrication);
		this.id = Id;
		this.rayon = Rayon;
	}
	//Getters Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {
		return  "Rayon : " + this.rayon ;
	}
	
	//Create data
	public void create_data(double rayon,int anne_de_fabrication) {
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query="INSERT INTO `assietteronde`(`rayon` , `anne_de_fabrication`) VALUES (?,?)";
			ps=con.conn.prepareStatement(query);
			ps.setDouble(1, rayon);
			ps.setDouble(2, anne_de_fabrication);
			ps.executeUpdate();
			System.out.println("Round Plate Successfully Adds ");
		}catch (Exception e) {
			System.out.print(e);
		}
	}
	
	//Select Data
	public void read_data() throws SQLException {
		con.Connect();
		con.stat = con.conn.createStatement();
		con.rs = con.stat.executeQuery("SELECT * FROM `assietteronde`");
		while(con.rs.next()) {
			System.out.println("ID:  " + " " +con.rs.getInt("id") + " Rayon: " + con.rs.getDouble("rayon") + " Year of manufacture: " + con.rs.getInt("anne_de_fabrication"));
		}
	}
	

	//Update Data
	public void update_data(int id ,double rayon ,int anne_de_fabrication) {
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query = "UPDATE `assietteronde` SET `rayon`=?,`anne_de_fabrication`=? WHERE `id`=?";
			ps=con.conn.prepareStatement(query);
			ps.setDouble(1, rayon);
			ps.setInt(2, anne_de_fabrication);
			ps.setInt(3, id);
			ps.executeUpdate();
			System.out.println("modification successfully");
		}catch (Exception e){
			
		}
	}
	
	
}

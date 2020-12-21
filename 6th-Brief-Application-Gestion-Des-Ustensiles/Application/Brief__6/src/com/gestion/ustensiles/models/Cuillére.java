package com.gestion.ustensiles.models;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.gestion.ustensiles.sql.Configue;

public class Cuillére extends Ustensile {
	//Connection
	Configue con = new Configue();
	//Variables
	private int id;
	private double longueur;
	//Contrctors
	public Cuillére(){}
	public Cuillére(int Id,double Longueur,int Anne_de_fabrication){
		super (Id,Anne_de_fabrication);
		this.id = Id;
		this.longueur = Longueur;
	}
	//Getters Sitters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	//Display toString
	@Override
	public String toString() {
		return  "length: " + this.longueur ;
	}
	//Create Data
	public void create_data(double longueur,int anne_de_fabrication) {
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query="INSERT INTO `cuillere`(`longeur` , `anne_de_fabrication`) VALUES (?,?)";
			ps=con.conn.prepareStatement(query);
			ps.setDouble(1, longueur);
			ps.setDouble(2, anne_de_fabrication);
			ps.executeUpdate();
			System.out.println("spoon Added Successfully ");
		}catch (Exception e) {
			System.out.print(e);
		}
	}
	
	//Display spoon
	public void DisplayCuilleres(int i) throws SQLException {
		con.Connect();
		con.stat = con.conn.createStatement();
		con.rs = con.stat.executeQuery("SELECT COUNT(*) As total FROM cuillere ;");
		while(con.rs.next()) {
			System.out.println("Total: " +con.rs.getInt("total") );
		}
		con.rs = con.stat.executeQuery("SELECT * FROM `cuillere`");
		while(con.rs.next()) {
			System.out.println("ID: " +con.rs.getInt("id") + " length: " + con.rs.getDouble("longeur") + " year of manufacture:  " + con.rs.getInt("anne_de_fabrication"));
		}
		
	}
	
	public void tt() throws SQLException {
		con.Connect();
		con.stat = con.conn.createStatement();
		con.rs = con.stat.executeQuery("SELECT * FROM `cuillere`");
		while(con.rs.next()) {
			System.out.println("ID: " +con.rs.getInt("id") + " length: " + con.rs.getDouble("longeur") + " year of manufacture:  " + con.rs.getInt("anne_de_fabrication"));
		}
	}
	
	
	//Select Data
	public void read_data() throws SQLException {
		con.Connect();
		con.stat = con.conn.createStatement();
		con.rs = con.stat.executeQuery("SELECT * FROM `cuillere`");
		while(con.rs.next()) {
			System.out.println("ID: " +con.rs.getInt("id") + "Length: " + con.rs.getDouble("longeur") + " Year of manufacture: " + con.rs.getInt("anne_de_fabrication"));
		}
	}
	//Update DATA
	public void update_data(int id ,double longeur ,int anne_de_fabrication) {
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query = "UPDATE `cuillere` SET `longeur`=?,`anne_de_fabrication`=? WHERE `id`=?";
			ps=con.conn.prepareStatement(query);
			ps.setDouble(1, longeur);
			ps.setInt(2, anne_de_fabrication);
			ps.setInt(3, id);
			ps.executeUpdate();
			System.out.println("Successful modification");
		}catch (Exception e){
		}
	}
}

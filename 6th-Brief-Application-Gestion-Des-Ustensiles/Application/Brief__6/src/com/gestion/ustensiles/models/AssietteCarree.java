package com.gestion.ustensiles.models;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.gestion.ustensiles.sql.Configue;
public class AssietteCarree extends Assiette{
	//Conection BD
	Configue con = new Configue();
	//Variabes
	private int id;
	private double cote;
	//Controctors
	public AssietteCarree() {}
	public AssietteCarree(int Id,double Cote,int Anne_de_fabrication) {
		super (Anne_de_fabrication);
		this.id = Id;
		this.cote = Cote;
	}
	//Getters/Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCote() {
		return cote;
	}
	public void setCote(double cote) {
		this.cote = cote;
	}
	//Dispkay toString
	@Override
	public String toString() {
		return  "Side    : " + this.cote ;
	}
	
	//insert Data
	public void create_data(double cote,int anne_de_fabrication) {
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query="INSERT INTO `assiettecarree`(`cote` , `anne_de_fabrication`) VALUES (?,?)";
			ps=con.conn.prepareStatement(query);
			ps.setDouble(1, cote);
			ps.setDouble(2, anne_de_fabrication);
			ps.executeUpdate();
			System.out.println(" \n PlateCarree Added Successfully ");
		}catch (Exception e) {
			System.out.print(e);
		}
	}
	
	//select Data
	public void read_data() throws SQLException {
		//First f = new First();
		con.Connect();
		con.stat = con.conn.createStatement();
		con.rs = con.stat.executeQuery("SELECT * FROM `assiettecarree`");
		while(con.rs.next()) {
			System.out.println("ID:  " + "\t" +con.rs.getInt("id") + " Side: " + con.rs.getDouble("cote") + " Year of manufacture: " + con.rs.getInt("anne_de_fabrication"));
		}
	}
	

	//Update Data
	public void update_data(int id ,double cote ,int anne_de_fabrication) {
		//First f = new First();
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query = "UPDATE `assiettecarree` SET `cote`=?,`anne_de_fabrication`=? WHERE `id`=?";
			ps=con.conn.prepareStatement(query);
			ps.setDouble(1, cote);
			ps.setInt(2, anne_de_fabrication);
			ps.setInt(3, id);
			ps.executeUpdate();
			System.out.println("Modification successfully");

			
		}catch (Exception e){
			
		}
	}
	
}

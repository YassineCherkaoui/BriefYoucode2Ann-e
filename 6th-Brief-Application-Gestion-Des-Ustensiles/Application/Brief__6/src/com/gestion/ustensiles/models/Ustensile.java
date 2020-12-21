package com.gestion.ustensiles.models;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import com.gestion.ustensiles.sql.Configue;

public class Ustensile {
	Configue con = new Configue();
	
	//Variables
	private int id;
	private int anne_de_fabrication;
	//Constractor
	public Ustensile(){}
	public Ustensile(int Id,int Anne_de_fabrication){
		this.id = Id;
		this.anne_de_fabrication = Anne_de_fabrication;
	}
	//Getters
	public int getId() {
		return id;
	}
	public int getAnne_de_fabrication() {
		return anne_de_fabrication;
	}
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setAnne_de_fabrication(int anne_de_fabrication) {
		this.anne_de_fabrication = anne_de_fabrication;
	}
	//Display ToString
	@Override
	public String toString() {
		return  "Year of manufacture : " + this.anne_de_fabrication ;
	}
	
	//displayOtal value
	public void Display_Total_value(int choix) throws SQLException {
		int yearNow = Calendar.getInstance().get(Calendar.YEAR);
		int yearUstentile = 0;
		int Calculvaut = 0;
		int vaut = 0;
		if(choix == 1 ) {
			con.Connect();
			con.stat = con.conn.createStatement();
			con.rs = con.stat.executeQuery("SELECT anne_de_fabrication FROM cuillere");
			while(con.rs.next()) {
				yearUstentile = con.rs.getInt("anne_de_fabrication");
				Calculvaut = yearNow - yearUstentile;
				if (Calculvaut > 50) {
					vaut = vaut + (Calculvaut - 50);
				}
			}
			System.out.println("Total Spoon value: " + vaut + " DH");
		}else if(choix == 2) {
			con.Connect();
			con.stat = con.conn.createStatement();
			con.rs = con.stat.executeQuery("SELECT anne_de_fabrication FROM assietteronde");
			
			while(con.rs.next()) {
				yearUstentile = con.rs.getInt("anne_de_fabrication");
				Calculvaut = yearNow - yearUstentile;
				if (Calculvaut > 50) {
					vaut = vaut + (Calculvaut - 50);
				}
			}
			System.out.println("Total Round Plate Value: " + vaut + " DH");
		}else if(choix == 3) {
			con.Connect();
			con.stat = con.conn.createStatement();
			con.rs = con.stat.executeQuery("SELECT anne_de_fabrication FROM assiettecarree");
			
			while(con.rs.next()) {
				yearUstentile = con.rs.getInt("anne_de_fabrication");
				Calculvaut = yearNow - yearUstentile;
				if (Calculvaut > 50) {
					vaut = vaut + ((Calculvaut - 50) * 5);
				}
			}
			System.out.println("Total Value Of PlateCarree: " + vaut + " DH");
		}
	}
	//Update
		public void update_global_data(int id ,double rayonORcoteORlongeur ,int anne_de_fabrication ,int choix) {
			con.Connect();
			PreparedStatement ps = null;
			try {
				String query ="";
				String messagesucces ="";
				if (choix == 1) {
					query = "UPDATE `assietteronde` SET `rayon`=?,`anne_de_fabrication`=? WHERE `id`=?";
					messagesucces ="Plate modification successfully";
				}else if (choix == 2) {
					query = "UPDATE `assiettecarree` SET `cote`=?,`anne_de_fabrication`=? WHERE `id`=?";
					messagesucces ="successfully modified plate";
				}else if (choix == 3) {
					query = "UPDATE `cuillere` SET `longeur`=?,`anne_de_fabrication`=? WHERE `id`=?";
					messagesucces ="successful spoon modification";
				}
				ps=con.conn.prepareStatement(query);
				ps.setDouble(1, rayonORcoteORlongeur);
				ps.setInt(2, anne_de_fabrication);
				ps.setInt(3, id);
				ps.executeUpdate();
				System.out.println(messagesucces);
			}catch (Exception e){
				
			}
		}
	
	
	
}

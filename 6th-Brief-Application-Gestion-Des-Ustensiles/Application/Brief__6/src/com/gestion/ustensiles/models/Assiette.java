package com.gestion.ustensiles.models;
import java.sql.SQLException;

import com.gestion.ustensiles.sql.Configue;

public class Assiette extends Ustensile {
	
	Configue con = new Configue();
	
	private int id;
	public Assiette(){}
	public Assiette(int Id){
		this.id = Id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//show_Surface_Plates
		public void show_Surface_Plates(int choix) throws SQLException {
			double Surface = 0;
			double valeur = 0;
			if(choix == 1) {
				con.Connect();
				con.stat = con.conn.createStatement();
				con.rs = con.stat.executeQuery("SELECT SUM(rayon) As sum_rayon FROM assietteronde ;");
				
				while(con.rs.next()) {
					valeur = con.rs.getInt("sum_rayon");
				}
				Surface = 3.14 * (valeur * valeur);
				System.out.println("1. The value of the Round Plate Surface: " + Surface);
				
			}else if (choix == 2) {
				con.Connect();
				con.stat = con.conn.createStatement();
				con.rs = con.stat.executeQuery("SELECT SUM(cote) As sum_cote FROM assiettecarree ;");
				
				while(con.rs.next()) {
					valeur = con.rs.getInt("sum_cote");
				}
				Surface = (valeur * valeur);
				System.out.println("2. The value of the Surface of Plate Carree : " + Surface);
				
			}
		}
	
	
}

package com.gestion.ustensiles.App;
import java.sql.SQLException;
import java.util.Scanner;
import com.gestion.ustensiles.sql.Configue;
import com.gestion.ustensiles.models.*;
public class App {

	public static void main(String[] args) throws SQLException {
		Scanner Scanner= new Scanner(System.in);
		Configue con = new Configue();
		con.Connect();
		
		AssietteRonde assietteronde = new AssietteRonde();
		AssietteCarree assiettecarree = new AssietteCarree();
		Cuillére cuillere = new Cuillére();
		
		int anne_de_fabrication =0;
		double rayon =0;
		double cote =0;
		double longueur =0;
		int id = 0;	 
		while (true) {
			System.out.println("__________Utensil Management___________|");
			System.out.println("ADD_________________________________[1]|");
			System.out.println("Show Spoons_________________________[2]|");
			System.out.println("Display Plates Surface______________[3]|");
			System.out.println("Show Total Value____________________[4]|");
			System.out.println("Edit Utensil________________________[5]|");
			System.out.print("Choice: --> ");
			String method=Scanner.next();
			switch(method) {
			 case "1":
				 System.out.println("Year of manufacture: ");
				 anne_de_fabrication = Scanner.nextInt();
				 System.out.println("______________________________________|");
				 System.out.println("Add Round Plate____________________[1]|");
				 System.out.println("Add PlateCarree____________________[2]|");
				 System.out.println("Spoon______________________________[3]|");
				 System.out.print("Choice: --> ");
				 String method1=Scanner.next();
				 switch(method1) {
				  case "1":
					  System.out.println("Round Plate shelf:____________________|");
					  rayon = Scanner.nextDouble();
					  assietteronde.create_data(rayon,anne_de_fabrication);
					  break;
				  case "2":
					  System.out.println("Rib of Square Plate:__________________|");
					  cote = Scanner.nextDouble();
					  assiettecarree.create_data(cote,anne_de_fabrication);
					  break;
				  case "3":
					  System.out.println("Spoon Length:_________________________|");
					  longueur = Scanner.nextDouble();
					  cuillere.create_data(longueur,anne_de_fabrication);
					  break;
					  default:
				 }
				 break;
			 case "2":
				 System.out.println("Total area Round Plate_____________[1]|");
				 System.out.println("Total area Square Plate____________[2]|");
				 System.out.println("Total area Spoon___________________[3]|");
				 System.out.print("Choice: --> ");
				 String method2=Scanner.next();
				 switch(method2) {
					 case "1":
						 System.out.println("Round Plate____________________|");
						 assietteronde.read_data();
						 break;
					 case "2":
						 System.out.println("Square Plate___________________|");
						 assiettecarree.read_data();
						 break;
					 case"3":
						 System.out.println("Square Plate___________________|");
						 cuillere.DisplayCuilleres(3);
					 default:
				 }
				 break;
				 
			 case "3":
				 //select
				 System.out.println("Total area Round Plate_____________[1]|");
				 System.out.println("Total area Square Plate____________[2]|");
				 System.out.print("Choice: --> ");
				 String method3=Scanner.next();
				 switch(method3) {
					 case "1":
						 //1
						 assietteronde.show_Surface_Plates(1);
						 break;
					 case "2":
						 //2
						 assiettecarree.show_Surface_Plates(2);
						 break;
					 default:
				 }
				 //cuillere.tt();
				 break;
			 case "4":
				 System.out.println("Spoon______________________________[1]|");
				 System.out.println("Round plate________________________[2]|");
				 System.out.println("Square Plate_______________________[3]|");
				 System.out.print("Choice: --> ");
				 String method4=Scanner.next();
				 switch(method4) {
				 	case "1":
				 		cuillere.DisplayCuilleres(1);
				 		break;
				 	case "2":
				 		assietteronde.read_data();
				 		break;
				 	case "3":
				 		assiettecarree.read_data();
				 		break;
				 	default:
				 }
				 break;
				 //Update
			 case "5":;
					 System.out.println("Update Spoon_______________________[1]|");
					 System.out.println("Update Round plate_________________[2]|");
					 System.out.println("UpdateSquare Plate_________________[3]|");
					 System.out.print("Choice: --> ");
					String method5=Scanner.next();
					switch(method5) {
						case "1":
							cuillere.read_data();
							 System.out.println("Update ID :___________________________|");
							id = Scanner.nextInt();
							 System.out.println("Update Length :_______________________|");
							longueur = Scanner.nextDouble();
							 System.out.println("Update Year of manufacture :__________|");
							anne_de_fabrication = Scanner.nextInt();
							cuillere.update_data(id, longueur, anne_de_fabrication);
							System.out.println("______________________________________|");
							break;
						case "2":
							assietteronde.read_data();
							System.out.println("Update ID :___________________________|");
							id = Scanner.nextInt();
							System.out.println("Update Ray :__________________________|");
							rayon = Scanner.nextDouble();
							System.out.println("Update Year of manufacture :__________|");
							anne_de_fabrication = Scanner.nextInt();
							assietteronde.update_data(id, rayon, anne_de_fabrication);
							break;
						case "3":
							assiettecarree.read_data();
							System.out.println("______________________________________|");
							System.out.println("Update ID :___________________________|");
							id = Scanner.nextInt();
							System.out.println("Update Side :_________________________|");
							rayon = Scanner.nextDouble();
							System.out.println("Update Year of manufacture :__________|");
							anne_de_fabrication = Scanner.nextInt();
							assiettecarree.update_data(id, cote, anne_de_fabrication);
							break;
						default:
					}
				 default:	 
			}
		
		}
	}
}

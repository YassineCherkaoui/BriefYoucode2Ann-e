package tn.itgate.gestion_etudiant.application;

import java.util.Scanner;


import java.util.List;

import tn.itgate.gestion_etudiant.imp.EmployeeImp;
import tn.itgate.gestion_etudiant.imp.EtudiantImp;
import tn.itgate.gestion_etudiant.model.Etudiant;
import tn.itgate.gestion_etudiant.model.employee;

public class application {

	public static void main(String[] args) {
		
		EtudiantImp EtudiantImp = new EtudiantImp();
		
		EmployeeImp EmployeeImp = new EmployeeImp();
		
		boolean var = true;
		
		while (var) {
			
			
		
		
		System.out.println("------------Gestion Etudiant--------------");
		System.out.println("-------------Menu-------------");
		System.out.println("1-Etudiant");
		System.out.println("2-employee");
		System.out.println("3-book");
		System.out.println("4-quitter");
		
		System.out.println("Choix : ");
		
		Scanner scanner=new Scanner(System.in);
		
		int choix=scanner.nextInt();
		
		switch (choix) {
		case 1: 
			
			boolean var1 = true;
			while (var1) {

			System.out.println("------------Gestion Etudiant--------------");
			System.out.println("1-Ajouter Etudiant");
			System.out.println("2-supprimer Etudiant");
			System.out.println("3-Modifeir Etudiant");
			System.out.println("4-afficher Etudiant");
			System.out.println("5-Quitter");
			
			System.out.println("Choix : ");
			
			int choixEtudiant=scanner.nextInt();
			EtudiantImp etudiantImp = null;
			switch (choixEtudiant) {
			case 1: 
				
				
				System.out.println("Ajouter Etudiant");
				
				System.out.println(" Nom : ");
				
				String nom=scanner.next();
				
				System.out.println(" Prenom : ");
				
				String prenom=scanner.next();
				
				System.out.println(" adresse : ");
				
				String adresse=scanner.next();
				
				System.out.println(" ID : ");
				
				int id=scanner.nextInt();
				
				
				
				Etudiant etudiant = new Etudiant(id,nom, prenom, adresse);
				

				
				etudiantImp.addEtudiant(etudiant);
				break;
			case 2: 
				System.out.println("supprimer Etudiant");
				
				System.out.println("ID : ");
				int id1 = scanner.nextInt();
				Etudiant etudiant1 = etudiantImp.getEtudiantById(id1);
				
				etudiantImp.removeEtudiant(etudiant1);
				
				System.out.println("Remove");
				
				break;
			case 3: 
				System.out.println("Modifeir Etudiant");
				System.out.println("ID : ");
				int id_mod = scanner.nextInt();
				Etudiant etudiant2 = etudiantImp.getEtudiantById(id_mod);
				
				System.out.println(" Nom : ");
				
				String nomE=scanner.next();
				
				etudiant2.setNom(nomE);
				
				System.out.println(" Prenom : ");
				
				String prenomE=scanner.next();
				etudiant2.setNom(prenomE);
				
				System.out.println(" adresse : ");
				
				String adresseE=scanner.next();
				etudiant2.setNom(adresseE);
						
				
				EtudiantImp.updateEtudiant(etudiant2);
				
				System.out.println("updated"); 
				
				break;
			case 4: 
				System.out.println("afficher Etudiant");
				
				List<Etudiant> etudiants=etudiantImp.getAllEtudiant();
				
				for (Etudiant etudiant4:etudiants) {
					System.out.println(etudiant4.getNom());
					
				}
				break;
			case 5: 
				System.out.println("quitter");
				var1=false;
				var= true;
				break;
				
			default:
				System.out.println("Choix invalid");
				break;
			}}
			
			
		//----------------employee --------------------
		case 2: 
			boolean var2 = true;
			
			while (var2) {
				
			System.out.println("------------Gestion employee--------------");
			System.out.println("1-Ajouter employee");
			System.out.println("2-supprimer employee");
			System.out.println("3-Modifeir employee");
			System.out.println("4-afficher employee");
			System.out.println("5-quitter");
			
			int choixEmployee=scanner.nextInt();
			switch (choixEmployee) {
			case 1: 
				
				
				System.out.println("Ajouter Employee");
				
				System.out.println(" Nom : ");
				
				String nom=scanner.next();
				
				System.out.println(" Prenom : ");
				
				String prenom=scanner.next();
				
				System.out.println(" Adresse : ");
				
				String adresse=scanner.next();
				
				
				System.out.println(" ID : ");
				
				int id=scanner.nextInt();
				
				employee employee = new employee(id, nom, prenom, adresse);
				
				EmployeeImp.addemployee(employee);
				System.out.println("Employee ADDED");
						
				break;
			case 2: 
				System.out.println("supprimer Employee");
				System.out.println("ID : ");
				int id2 = scanner.nextInt();
				employee employee2 = EmployeeImp.getEmployeeById(id2);
				
				EmployeeImp.removeemployee(employee2);
				
				System.out.println("Removed");
				
				break;
			case 3: 
				System.out.println("Modifeir Employee");
				System.out.println("ID : ");
				int id_mod = scanner.nextInt();
				employee employee3 = EmployeeImp.getEmployeeById(id_mod);
				
				System.out.println(" Nom : ");
				
				String nomE=scanner.next();
				
				employee3.setNom(nomE);
				
				System.out.println(" Prenom : ");
				
				String prenomE=scanner.next();
				employee3.setNom(prenomE);
				
				System.out.println(" adresse : ");
				
				String adresseE=scanner.next();
				employee3.setNom(adresseE);
						
				
				EmployeeImp.updateEmployee(employee3);
				
				System.out.println("updated"); 
				break;
				
			case 4: 
				System.out.println("afficher Employee");
				for(employee employee4:EmployeeImp.getAllEmployee())
					System.out.println(employee4.getNom());
				break;
			case 5: 
				System.out.println("quitter");
				var = true;
				var2 = false;
			default:
				System.out.println("Choix invalid");
				break;
			}}
			
			break;
			
			//-------------------Employeefin--------------
		case 3: 
			System.out.println("------------Gestion book--------------");
			System.out.println("1-Ajouter book");
			System.out.println("2-supprimer book");
			System.out.println("3-Modifeir book");
			System.out.println("4-afficher book");
			System.out.println("5-quitter");
			break;
		case 4: 
			System.out.println("------------by--------------");
			break;
		

		default:
			System.out.println("Chois invalide");
			break;
		}

	}

}}

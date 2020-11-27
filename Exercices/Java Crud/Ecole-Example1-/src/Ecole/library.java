package Ecole;

import java.util.Scanner;
import java.util.ArrayList;

public class library {

	private Scanner reader;
	private ArrayList<String> students;





	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> employee = new ArrayList<String>();
		ArrayList<String> livre = new ArrayList<String>();
		while(true) {
		Scanner reader = new Scanner(System.in);
		Scanner test = new Scanner(System.in);
		
		System.out.println("*************Gestion*************");
		System.out.println("Gérer des étudiants (1)");
		System.out.println("Gérer des employés (2)");
		System.out.println("Gérer des livres (3)");
		System.out.print("Choix : ");
	    char section = reader.next().charAt(0);
	    
	    switch (section) {
	 // ----------------------------étudiant-------------------------------------	
	      case '1':
	    	  System.out.println("Ajouter un étudiant? 1/0 : ");
    		  System.out.println("1 = YES");
    		  System.out.println("0 = NON");
    		  System.out.print("CHOIX : ");
	    	  char yesno = reader.next().charAt(0);
	    	  switch(yesno) {
	    	  case '1':
	    		  System.out.print("Élève à ajouter : ");
    			  String newstudent= test.nextLine();
    			  students.add(newstudent);
    			  for(int i=0; i < students.size(); i++){
  	    		    System.out.println(students.get(i)+" added with succes");
  	    		    }
	    		  break;
	    	  case '0':
	    		  break;
	    	  }
	    	  
	    	  for(int i=0; i < students.size(); i++){
	    		    System.out.println(i+1 +"-"+ students.get(i));
	    		    }
	    	  System.out.print("Gérer le numéro d'étudiant : ");
	    	  int NbStudent = reader.nextInt();
	    		  System.out.println("Voulez-vous modifier / supprimer /? (1/0) : ");
	    		  System.out.println("1 = MODIFIER");
	    		  System.out.println("0 = SUPPRIMER");
	    		  System.out.print("CHOIX : ");
	    		  char pos = reader.next().charAt(0);
	    		  switch (pos) {
	    		  case '1':
	    			  System.out.print("Votre modification : ");
	    			  String modification = test.nextLine(); 
	    			  students.set(NbStudent-1, modification);
	    			  for(int i=0; i < students.size(); i++){
	  	    		    System.out.println(i+1 +"-"+ students.get(i));
	  	    		    }
	    			  break;
	    		  case '0':
	    			  students.remove(NbStudent-1);
	    			  for(int i=0; i < students.size(); i++){
	  	    		    System.out.println(i+1 +"-"+ students.get(i));
	  	    		    }
	    			  break;
	    		  }
	    	
	    		// ----------------------------employee-------------------------------------	   
	    	  
	        break;

	      case '2':
	    	  System.out.println("Ajouter un employee? 1/0 : ");
    		  System.out.println("1 = YES");
    		  System.out.println("0 = NON");
    		  System.out.print("CHOIX : ");
	    	  char yesno2 = reader.next().charAt(0);
	    	  switch(yesno2) {
	    	  case '1':
	    		  System.out.print("Employee à ajouter : ");
    			  String newemployee= test.nextLine();
    			  employee.add(newemployee);

	    		  break;
	    	  case '0':
	    		  break;
	    	  }
	    	  
	    	  for(int i=0; i < employee.size(); i++){
	    		    System.out.println(i+1 +"-"+ employee.get(i));
	    		    }
	    	  System.out.print("Gérer le numéro d'employee : ");
	    	  int Nbemployee = reader.nextInt();
	    		  System.out.println("Voulez-vous modifier / supprimer /? (1/0) : ");
	    		  System.out.println("1 = MODIFIER");
	    		  System.out.println("0 = SUPPRIMER");
	    		  System.out.print("CHOIX : ");
	    		  char pos2 = reader.next().charAt(0);
	    		  switch (pos2) {
	    		  case '1':
	    			  System.out.print("Votre modification : ");
	    			  String modification = test.nextLine(); 
	    			  employee.set(Nbemployee-1, modification);
	    			  for(int i=0; i < employee.size(); i++){
	  	    		    System.out.println(i+1 +"-"+ employee.get(i));
	  	    		    }
	    			  break;
	    		  case '0':
	    			  students.remove(Nbemployee-1);
	    			  for(int i=0; i < employee.size(); i++){
	  	    		    System.out.println(i+1 +"-"+ employee.get(i));
	  	    		    }
	    			  break;
	    		  }
// ----------------------------livre-------------------------------------	    	  
	        break;

	      case '3':
	    	  System.out.println("Ajouter un livre? 1/0 : ");
    		  System.out.println("1 = YES");
    		  System.out.println("0 = NON");
    		  System.out.print("CHOIX : ");
	    	  char yesno3 = reader.next().charAt(0);
	    	  switch(yesno3) {
	    	  case '1':
	    		  System.out.print("livre à ajouter : ");
    			  String newlivre= test.nextLine();
    			  livre.add(newlivre);

	    		  break;
	    	  case '0':
	    		  break;
	    	  }
	    	  
	    	  for(int i=0; i < livre.size(); i++){
	    		    System.out.println(i+1 +"-"+ livre.get(i));
	    		    }
	    	  System.out.print("Gérer le numéro d'livre : ");
	    	  int Nblivre = reader.nextInt();
	    		  System.out.println("Voulez-vous modifier / supprimer /? (1/0) : ");
	    		  System.out.println("1 = MODIFIER");
	    		  System.out.println("0 = SUPPRIMER");
	    		  System.out.print("CHOIX : ");
	    		  char pos3 = reader.next().charAt(0);
	    		  switch (pos3) {
	    		  case '1':
	    			  System.out.print("Votre modification : ");
	    			  String modification = test.nextLine(); 
	    			  livre.set(Nblivre-1, modification);
	    			  for(int i=0; i < livre.size(); i++){
	  	    		    System.out.println(i+1 +"-"+ livre.get(i));
	  	    		    }
	    			  break;
	    		  case '0':
	    			  livre.remove(Nblivre-1);
	    			  for(int i=0; i < livre.size(); i++){
	  	    		    System.out.println(i+1 +"-"+ livre.get(i));
	  	    		    }
	    			  break;
	    		  }

	        
	      default:
	        System.out.printf("Erreur! la section n'est pas correcte");
	        return;
	    }
	}}






}

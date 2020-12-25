package Com.gestion.employee.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import Com.gestion.employee.Controller.EmployeController;
import Com.gestion.employee.Models.Producteur;

	public class Application {

		public static void main(String[] args) throws SQLException {
			
			ArrayList<Producteur> listP = new ArrayList<Producteur>();
			
			
			
			
			  boolean var = true;
				while (var) {
					System.out.println("__________Gestion des Employés_______________|");
					System.out.println("_______________HOME PAGE_____________________|");
			        System.out.println("Management of Commercial Employees________[1]|");
			        System.out.println("Seller Management_________________________[2]|");
			        System.out.println("Risk Producer Management__________________[3]|");
			        System.out.println("Management Manutentionnaire_______________[4]|");
			        System.out.println("Warehouse Management Risk_________________[5]|");
			        System.out.println("Show salary_______________________________[6]|");
			        System.out.println("Exit the program__________________________[7]|");
			        System.out.print("Choice: --> ");
			        Scanner scanner = new Scanner(System.in);
			        int choix = scanner.nextInt();		        
			    	boolean var1 = true;
			        boolean var4 = true;
				    boolean var5 = true;
			        switch (choix) {
					case 1:
						while (var1) {	
					        System.out.println("Management of Commercial Employees___________|");
						    System.out.println("Do you want to manage the Sellers ?_______[1]|");
					        System.out.println("Do you want to manage the Representatives?[2]|");
					        System.out.println("Exit the Commercial Menu__________________[3]|");
					        System.out.print("Choice: --> ");
					      
					        int choixCommercial = scanner.nextInt();
					        
					        boolean var2 = true;
					        boolean var3 = true;
					     
					        switch (choixCommercial) {
							case 1:
								
								
								while (var2) {
										System.out.println("Seller Management____________________________|");
									    System.out.println("Add Seller________________________________[1]|");
								        System.out.println("Edit Seller_______________________________[2]|");
								        System.out.println("Delete Seller_____________________________[3]|");
								        System.out.println("Exit the Vendors Menu_____________________[4]|");
									
								        System.out.print("Choice: --> ");
								        
								        int choixVendeur = scanner.nextInt();
								        switch (choixVendeur) {
								        
								        case 1:
								        	System.out.println("Add Seller___________________________________|");
											 System.out.print("ID--------------------->");
											 int id = scanner.nextInt ();
											 
											 System.out.print("First Name------------->");
											 String lastName = scanner.next();
											 
											 System.out.print("Last Name-------------->");
											 String firstName = scanner.next();
											 
											 System.out.print("Age-------------------->");
											 int age = scanner.nextInt();
											 System.out.print("Date of entryservic---->");
											 String dateEntreeService = scanner.next();
											 System.out.print("Chiffre d'affaire------>");						 
											 Double chiffreAffaire = scanner.nextDouble();
				                             EmployeController addVenduer = new EmployeController();
				                             addVenduer.ajouteVendeur(id, lastName, firstName, age, dateEntreeService, chiffreAffaire);	
				                             System.out.println("Seller Added Well____________________________|");
								        	break;
								        	
								        case 2:
								        	System.out.println("Edit Seller__________________________________|");
				                            System.out.print("Enter the ID of the employee you want to Edit:->");
											int idUpdate = scanner.nextInt ();
											System.out.print("Add New First Name----->");
											 String newLastName = scanner.next();
											 
											 System.out.print("Add New Last Name----->");
											 String newFirstName = scanner.next();
											 System.out.print("Add New Age----------->");
											 int newAge = scanner.nextInt();
											 
											 System.out.print("Enter New Date of entry into service:->");
											 String newDateEntreeService = scanner.next();
											 							 
											 System.out.print("Add New Chaiffre d'affaire:->");
											 Double newChiffreAffaire = scanner.nextDouble();
											 
				                             EmployeController updateVendeur = new EmployeController();
				                             updateVendeur.updateVendeur(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newChiffreAffaire);
						
				                             System.out.println("Seller Edited well");
											 
								        	break;
								        case 3:
								        	 System.out.println("Delete Seller________________________________|");
											 System.out.print("Enter the ID of the employee you want to remove:->");
											 int idSup = scanner.nextInt ();
											  EmployeController deleteVendeur = new EmployeController();
											  deleteVendeur.deleteVendeur(idSup);	
												 
												 System.out.println("Seller Well Deleted");
								        	break;
								    
								        case 4:
								        	System.out.println("You have left the Vendor Menu________________|");
						                 	var2=false;
						                	var3=false;
						                	var4=false;
						                	var5=false;
						                    var1=true;
						                 	break;
						
											default:
												System.out.println("Invalid choice_______________________________|");
												break;

								         }
								     
								     }
							case 2:
					
								while (var3) {
									    System.out.println("Management of Representatives________________|");
									    System.out.println("ADD Representatives_______________________[1]|");
								        System.out.println("EDIT Representatives______________________[2]|");
								        System.out.println("DELETE Representatives____________________[3]|");
								        System.out.println("leave_____________________________________[4]|");
									
								        System.out.print("Choice: --> ");
								        
								        int choixRepresentant = scanner.nextInt();
								        switch (choixRepresentant) {
								        
								        case 1:
										System.out.println("ADD Representatives__________________________|");
											 
										 	 System.out.print("ID--------------------->");
											 int id = scanner.nextInt ();
											 
											 System.out.print("First Name------------->");
											 String lastName = scanner.next();
											 
											 System.out.print("Last Name-------------->");
											 String firstName = scanner.next();
											 
											 System.out.print("Age-------------------->");
											 int age = scanner.nextInt();
											 
											 System.out.print("Date of entryservic---->");
											 String dateEntreeService = scanner.next();
											 							 
											 System.out.print("Chiffre d'affaire------>");
											 Double chiffreAffaire = scanner.nextDouble();
											 
				                             EmployeController addRepresentant = new EmployeController();
				                             addRepresentant.ajouteRepresentant(id, lastName, firstName, age, dateEntreeService, chiffreAffaire);
											 
											 System.out.println("Well Added Representative");
								        	break;
								        	
								        case 2:
								        	 System.out.println("EDIT Representatives_________________________|");
											 
								        	 System.out.print("Enter the ID of the employee you want to Edit:->");
											 int idUpdate = scanner.nextInt ();
											 
											 System.out.print("Add New First Name----->");
											 String newLastName = scanner.next();
											 
											 System.out.print("Add New Last Name----->");
											 String newFirstName = scanner.next();
											 
											 System.out.print("Add New Age----------->");
											 int newAge = scanner.nextInt();
											 
											 System.out.print("Enter New Date of entry into service:->");
											 String newDateEntreeService = scanner.next();
											 							 
											 System.out.print("Add New Chaiffre d'affaire:->");
											 Double newChiffreAffaire = scanner.nextDouble();
											 
				                             EmployeController updateRepresentant = new EmployeController();
				                             
				                            
				                             
				                             updateRepresentant.updateRepresentant(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newChiffreAffaire);;
						
				                             System.out.println("Representative Edited Well");
											 
								        	break;
								        case 3:
								        	System.out.println("DELETE Representatives_______________________|");
											 
								        	 System.out.print("Enter the ID of the employee you want to remove:->");
											 int idSup = scanner.nextInt ();
											  EmployeController deleteRepresentant = new EmployeController();
											  deleteRepresentant.deleteRepresentant(idSup);
												 System.out.println("Well Deleted Representative");
								        	break;
								        case 4:
								        	System.out.println("You have left the Representative Menu X(");
						                 	var3=false;
						                	var4=false;
						                	var5=false;
						                    var1=true;
						                 
						                 	break;
						
											default:
												System.out.println("Invalid choice_______________________________|");
												break;
								        }
								      }
							case 3:
								System.out.println("You have left the Commercial Menu X'(");
								var1= false;
								var4=false;
			                	var5=false;
			                    var = true;
			                 	break;
			
								default:
									System.out.println("Invalid choice_______________________________|");
									break;
								 }
					        
					        }

					   case 2:

						   while (var4) {
							    System.out.println("Producer Management__________________________|");
							    System.out.println("ADD Producer______________________________[1]|");
						        System.out.println("EDIT Producer_____________________________[2]|");
						        System.out.println("DELETE Producer___________________________[3]|");
						        System.out.println("Quitter Producer__________________________[4]|");
							
						        System.out.print("Choice: --> ");
						        
						        int choixProducteur = scanner.nextInt();
						        switch (choixProducteur) {
						        
						        
						        case 1:
						        	if(listP.size() > 1) {
							        	 System.out.println("You cannot Add another Producer!!____________|");
							        }else {	
							         System.out.println("ADD Producer_________________________________|");								 
									 System.out.print("ID--------------------->");
									 int id = scanner.nextInt ();
									 
									 System.out.print("First Name------------->");
									 String lastName = scanner.next();
									 
									 System.out.print("First Name------------->");
									 String firstName = scanner.next();
									 
									 System.out.print("Age-------------------->");
									 int age = scanner.nextInt();
									 
									 System.out.print("Date of entryservic---->");
									 String dateEntreeService = scanner.next();
									 							 
									 System.out.print("Number of units produced:->");
									 int nbrUnites = scanner.nextInt();
									 
		                             EmployeController addProducteur = new EmployeController();

				
		                             addProducteur.ajouteProducteur(id, lastName, firstName, age, dateEntreeService, nbrUnites);	
									 
									 System.out.println("Well Added Producer");
						        	break;
							        }
						        case 2:
						        	System.out.println("EDIT Producer________________________________|");	
									 
						        	 System.out.print("Enter the ID of the employee you want to Edit:->");
									 int idUpdate = scanner.nextInt ();
									 System.out.print("Add New First Name----->");
									 String newLastName = scanner.next();
									 
									 System.out.print("Add New Last Name----->");
									 String newFirstName = scanner.next();
									 
									 System.out.print("Add New Age----------->");
									 int newAge = scanner.nextInt();
									 
									 System.out.print("Enter New Date of entry into service:->");
									 String newDateEntreeService = scanner.next();
									 System.out.print("Enter New Number of Units:->");							 
									 int newNbrUnites = scanner.nextInt();
									 
		                             EmployeController updateProducteur = new EmployeController();
		                             
		                             
		                             updateProducteur.updateProducteur(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrUnites);
				
		                             System.out.println("Well Producer Edited");
									 
						        	break;
						        case 3:
						        	 System.out.println("Delete Producer_____________________________|");
									 
						        	 System.out.print("Enter the ID of the employee you want to remove:->");
									 int idSup = scanner.nextInt ();
						
									 EmployeController deleteProducteur = new EmployeController();
									 deleteProducteur.deleteProducteur(idSup);
								     System.out.println("Well Deleted Producer");
						        	break;
						        case 4:
						        	System.out.println("You have left the Producers Menu X'(");
				                 	var4=false;	
				                	var5=false;
				                    var1=true;
				                 
				                 	break;
				
									default:
										System.out.println("Invalid choice_______________________________|");
										break;
						        }
						      }
					   case 3:

						   while (var4) {
							    System.out.println("Managing Producers Risk______________________|");
							    System.out.println("ADD Producers Risk________________________[1]|");
						        System.out.println("EDIT Producers Risk_______________________[2]|");
						        System.out.println("DELETE Producer___________________________[3]|");
						        System.out.println("LEAVE Producers Risk______________________[4]|");
							
						        System.out.print("Choice: --> ");
						        
						        int choixProducteur = scanner.nextInt();
						        switch (choixProducteur) {
						        
						        
						        case 1:
						        	if(listP.size() > 1) {
							        	 System.out.println("You cannot Add another Producer A Risk ! ____|");
							        }else {
							         System.out.println("ADD Producer A Risk__________________________|");
							         System.out.print("ID--------------------->");
									 int id = scanner.nextInt ();
									 
									 System.out.print("First Name------------->");
									 String lastName = scanner.next();
									 
									 System.out.print("First Name------------->");
									 String firstName = scanner.next();
									 
									 System.out.print("Age-------------------->");
									 int age = scanner.nextInt();
									 
									 System.out.print("Date of entryservic---->");
									 String dateEntreeService = scanner.next();
									 System.out.print("Number of units produced->"); 
									 int nbrUnites = scanner.nextInt();
									 
		                             EmployeController addProducteurARisque = new EmployeController();

				
		                             addProducteurARisque.ajouteProducteurARisque(id, lastName, firstName, age, dateEntreeService, nbrUnites);	
									 
									 System.out.println("Well Added Risk Producer !");
						        	break;
							        }
						        case 2:
						        	System.out.println("EDIT Risk Producer___________________________|");								 
						        	System.out.print("Enter the ID of the employee you want to Edit:->");
									 int idUpdate = scanner.nextInt ();
									 
									 System.out.print("Add New First Name----->");
									 String newLastName = scanner.next();
									 
									 System.out.print("Add New Last Name----->");
									 String newFirstName = scanner.next();
									 
									 System.out.print("Add New Age----------->");
									 int newAge = scanner.nextInt();
									 
									 System.out.print("Enter New Date of entry into service:->");
									 String newDateEntreeService = scanner.next();
									 							 
									 System.out.print("Enter New Number of Units:->");
									 int newNbrUnites = scanner.nextInt();
									 
		                             EmployeController updateProducteurARisque = new EmployeController();
		                             
		                             
		                             updateProducteurARisque.updateProducteurARisque(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrUnites);
				
		                             System.out.println("Risk Producer Edited");
									 
						        	break;
						        case 3:
						        	 System.out.println("Delete Risk Producer________________________|");
									 
						        	 System.out.print("Enter the ID of the employee you want to remove:->");
									 int idSup = scanner.nextInt ();
						
									 EmployeController deleteProducteurARisque = new EmployeController();
									 deleteProducteurARisque.deleteProducteurARisque(idSup);
									 System.out.println("Well Deleted Risk Producer");
						        	break;
						        case 4:
						        	System.out.println("You have left the Producers Menu X(");
				                 	var4=false;	
				                	var5=false;
				                    var1=true;
				                 
				                 	break;
				
									default:
										System.out.println("Invalid choice_______________________________|");
										break;
						        }
						      }
					   case 4:
						  
						   while (var5) {
							    System.out.println("Handlers management__________________________|");
							    System.out.println("ADD Handlers______________________________[1]|");
						        System.out.println("EDIT Handlers_____________________________[2]|");
						        System.out.println("DELETE Handlers___________________________[3]|");
						        System.out.println("LEAVE Handlers____________________________[4]|");
							
						        System.out.print("Choice: --> ");
						        
						        int choixManutentionnaire = scanner.nextInt();
						        switch (choixManutentionnaire) {
						        
						        case 1:							 
						        	System.out.println("ADD Handlers_________________________________|");
									 
						        	System.out.print("ID--------------------->");
									 int id = scanner.nextInt ();
									 
									 System.out.print("First Name------------->");
									 String lastName = scanner.next();
									 
									 System.out.print("First Name------------->");
									 String firstName = scanner.next();
									 
									 System.out.print("Age-------------------->");
									 int age = scanner.nextInt();
									 
									 System.out.print("Date of entryservic---->");
									 String dateEntreeService = scanner.next();
									 							 
									 System.out.println("Number of Hours------>");
									 int nbrHeurs = scanner.nextInt();
									 
		                             EmployeController addManutentionnaire = new EmployeController();

				
		                             addManutentionnaire.ajouteManutentionnaire(id, lastName, firstName, age, dateEntreeService, nbrHeurs);	
									 
									 System.out.println("Handler Added Well");
						        	break;
						        	
						        case 2:
						        	 System.out.println("EDIT Handler_________________________________|");
						        	 System.out.print("Enter the ID of the employee you want to Edit:->");
									 int idUpdate = scanner.nextInt ();
									 
									 System.out.print("Add New First Name----->");
									 String newLastName = scanner.next();
									 
									 System.out.print("Add New Last Name----->");
									 String newFirstName = scanner.next();
									 
									 System.out.print("Add New Age----------->");
									 int newAge = scanner.nextInt();
									 
									 System.out.print("Enter New Date of entry into service:->");
									 String newDateEntreeService = scanner.next();
									 System.out.print("Enter New Number of Hours-->");
									 int newNbrHeurs = scanner.nextInt();
									 
		                             EmployeController updateManutentionnaire = new EmployeController();
		                             
		                             
		                             updateManutentionnaire.updateManutentionnaire(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrHeurs);
				
		                             System.out.println("Well Handler Edited!");
									 
						        	break;
						        case 3:
						        	 System.out.println("Delete Handler______________________________|");
						        	 System.out.print("Enter the ID of the employee you want to remove:->");
									 int idSup = scanner.nextInt ();
						
									 EmployeController deleteManutentionnaire = new EmployeController();
									 deleteManutentionnaire.deleteManutentionnaire(idSup);
								     System.out.println("Handler Well Deleted !!");
						        	break;
						        case 4:
						        	System.out.println("You have left the Handler Menu X(");
				                 	var5=false;  
				                    var1=true;
				                 
				                 	break;
				
									default:
										System.out.println("Invalid choice_______________________________|");
										break;
						        }
						      }
						   break;
					   case 5:
						   while (var5) {
							    System.out.println("Handler Risk management______________________|");
							    System.out.println("ADD Handler Risk__________________________[1]|");
						        System.out.println("EDIT Handler Risk_________________________[2]|");
						        System.out.println("DELETE Handler Risk_______________________[3]|");
						        System.out.println("LEAVE Handler Risk________________________[4]|");
							
						        System.out.print("Choice: --> ");
						        int choixManutentionnaire = scanner.nextInt();
						        switch (choixManutentionnaire) {
						        
						        case 1:
						        	 System.out.println("ADD Handler Risk____________________________|");
						        	 System.out.print("ID--------------------->");
									 int id = scanner.nextInt ();
									 
									 System.out.print("First Name------------->");
									 String lastName = scanner.next();
									 
									 System.out.print("First Name------------->");
									 String firstName = scanner.next();
									 
									 System.out.print("Age-------------------->");
									 int age = scanner.nextInt();
									 
									 System.out.print("Date of entryservic---->");
									 String dateEntreeService = scanner.next();
									 							 
									 System.out.println("Number of Hours------>");
									 int nbrHeurs = scanner.nextInt();
									 
		                             EmployeController addManutentionnaireARisque = new EmployeController();

				
		                             addManutentionnaireARisque.ajouteManutentionnaireARisque(id, lastName, firstName, age, dateEntreeService, nbrHeurs);	
									 
									 System.out.println("Handler Risk Added!!");
						        	break;
						        	
						        case 2:
						        	System.out.println("EDIT Handler Risk_____________________________|");
									 
						        	System.out.print("Enter the ID of the employee you want to Edit:->");
									 int idUpdate = scanner.nextInt ();
									 
									 System.out.print("Add New First Name----->");
									 String newLastName = scanner.next();
									 
									 System.out.print("Add New Last Name----->");
									 String newFirstName = scanner.next();
									 
									 System.out.print("Add New Age----------->");
									 int newAge = scanner.nextInt();
									 
									 System.out.print("Enter New Date of entry into service:->");
									 String newDateEntreeService = scanner.next();
									 							 
									 System.out.print("Enter New Number of Hours-->");
									 int newNbrHeurs = scanner.nextInt();
									 
		                             EmployeController updateManutentionnaireARisque = new EmployeController();
		                             
		                             
		                             updateManutentionnaireARisque.updateManutentionnaireARisque(idUpdate, newLastName, newFirstName, newAge, newDateEntreeService, newNbrHeurs);
				
		                             System.out.println("Handler Risk Well Edited !!!!");
									 
						        	break;
						        case 3:						     
						        	System.out.println("Delete Handler Risk_________________________|");
									 
						        	System.out.print("Enter the ID of the employee you want to remove:->");
									 int idSup = scanner.nextInt ();
						
									 EmployeController deleteManutentionnaireARisque = new EmployeController();
									 deleteManutentionnaireARisque.deleteManutentionnaireARisque(idSup);
									 System.out.println("Handler Risk Well Deleted !!");
						        	break;
						        case 4:
						        	System.out.println("You have left the Risk Handler Menu");
				                 	var5=false;  
				                    var1=true;
				                 
				                 	break;
				
									default:
										System.out.println("Invalid choice_______________________________|");
										break;
						        }
						      }
						   break;
					   case 6:
						   EmployeController afficheSalaire = new EmployeController();
						   afficheSalaire.afficherSalaires();
						   break;
					   case 7:
							System.out.println("You have Exit the Main Menu ");
							var=true;
						   break;
					   default:
						   System.out.println("Invalid choice_______________________________|");
							break;
		     }     	    	 
		  }
				
	   }
	}

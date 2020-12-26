package Com.gestion.employee.Models;
import Com.gestion.employee.interfaces.*;

public class ProducteurArisque extends Producteur implements employes_a_risque{

	public ProducteurArisque(String lastName, String firstName, int age, String dateEntreeService, int nbrUnites) {
		super(lastName, firstName, age, dateEntreeService, nbrUnites);
		// TODO Auto-generated constructor stub
	}
	public ProducteurArisque() {
		
	}
	   public double calculerSalaire() 
	      {   
		      return super.calculerSalaire()+prime;	   
	      }
		 public String getTitle()
	      {
	          return "The Producer At Risk ";
	      } 
}

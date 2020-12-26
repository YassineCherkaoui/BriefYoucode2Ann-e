package Com.gestion.employee.Models;
import Com.gestion.employee.interfaces.*;

public class ManutentionnaireArisque extends Manutentionnaire implements employes_a_risque{

	public ManutentionnaireArisque(String lastName, String firstName, int age, String dateEntreeService, int nbrHeurs) {
		super(lastName, firstName, age, dateEntreeService, nbrHeurs);
		// TODO Auto-generated constructor stub
	}
	public ManutentionnaireArisque() {
		
	}
	   public double calculerSalaire() 
	      {   
		      return super.calculerSalaire()+prime;	   
	      }
	   public String getTitle()
	      {
	          return "The Handler At Risk ";
	      }
}

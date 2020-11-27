package tn.itgate.gestion_etudiant.model;

public class employee extends Personne  {

	private String employee_name;
	
	private String employee_prenom;
	

	public employee(int id, String nom, String prenom, String adresse) {
		super(id, nom, prenom, adresse);
		// TODO Auto-generated constructor stub
		
		
	}


	
	
	
	


	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_prenom() {
		return employee_prenom;
	}

	public void setEmployee_prenom(String employee_prenom) {
		this.employee_prenom = employee_prenom;
	}
}

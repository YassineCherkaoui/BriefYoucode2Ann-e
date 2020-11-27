package tn.itgate.gestion_etudiant.model;

public class Etudiant extends Personne {
	
	private String student_name;
	
	private String student_prenom;
	
	
	public Etudiant(int Id, String nom, String prenom, String adresse) {
		super(Id, nom, prenom, adresse);
		// TODO Auto-generated constructor stub
	}



	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_prenom() {
		return student_prenom;
	}

	public void setStudent_prenom(String student_prenom) {
		this.student_prenom = student_prenom;
	}

}

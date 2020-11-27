package tn.itgate.gestion_etudiant.dao;


import java.util.List;

import tn.itgate.gestion_etudiant.model.Etudiant;

public interface IEtudiant {
	
	
	public void addEtudiant(Etudiant etudiant);
	public void removeEtudiant (Etudiant etudiant);
	public void updateEtudiant (Etudiant etudiant);
	public Etudiant getEtudiantById (int i);
	public List<Etudiant> getAllEtudiant();
	
}

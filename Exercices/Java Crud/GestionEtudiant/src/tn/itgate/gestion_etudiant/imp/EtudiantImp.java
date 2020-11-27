package tn.itgate.gestion_etudiant.imp;

import java.util.ArrayList;
import java.util.List;

import tn.itgate.gestion_etudiant.dao.IEtudiant;
import tn.itgate.gestion_etudiant.model.Etudiant;


public class EtudiantImp implements IEtudiant {
	ArrayList<Etudiant> etudiants = new ArrayList<>();

	@Override
	public void addEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		etudiants.add(etudiant);
	}

	@Override
	public void removeEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		etudiants.remove(etudiant);
	}

	@Override
	public void updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Etudiant getEtudiantById(int i) {
		// TODO Auto-generated method stub
		
		for (Etudiant etudiant:etudiants) {
			if(etudiant.getId()==i){
				return etudiant;
		}
		}
		return null;
	}
	

	@Override
	public List<Etudiant> getAllEtudiant() {
		// TODO Auto-generated method stub
		return etudiants;
	}

}

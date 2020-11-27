package tn.itgate.gestion_etudiant.dao;
import tn.itgate.gestion_etudiant.model.employee;
import java.util.List;


public interface IEmployee {
	  
	public void addemployee(employee employee);
	
	public void removeemployee (employee employee);
	
	public void updateEmployee (employee employee);
	
	public employee getEmployeeById (int i);
	
	public List<employee> getAllEmployee();
}


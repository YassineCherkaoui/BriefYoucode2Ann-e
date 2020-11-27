package tn.itgate.gestion_etudiant.imp;
import java.util.ArrayList;
import java.util.List;

import tn.itgate.gestion_etudiant.dao.IEmployee;
import tn.itgate.gestion_etudiant.model.employee;

public class EmployeeImp implements IEmployee {
	ArrayList<employee> employees = new ArrayList<>();
	@Override
	public void addemployee(employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
	}

	@Override
	public void removeemployee(employee employee) {
		// TODO Auto-generated method stub
		employees.remove(employee);
	}

	@Override
	public void updateEmployee(employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public employee getEmployeeById(int i) {
		// TODO Auto-generated method stub
		for (employee e:employees) {
			if (e.getId() == i) {
				return e;
				
			}
		}
		return null;
	}

	@Override
	public List<employee> getAllEmployee() {
		// TODO Auto-generated method stub

		
		return employees;
	}

}

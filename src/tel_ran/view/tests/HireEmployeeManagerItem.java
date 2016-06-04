package tel_ran.view.tests;

import tel_ran.employees.model.dao.Employee;
import tel_ran.employees.model.dao.Manager;
import tel_ran.employees.model.interfaces.IEmployeesModel;

public class HireEmployeeManagerItem extends HireEmployeeItem {
	
	public HireEmployeeManagerItem(int probability, IEmployeesModel employees) {
		super(probability, employees);
	}

	@Override
	public String getDisplayedName() {
		return "Hire EmployeeManager";
	}

	@Override
	public void action() {
		super.action();
		
		int grade = dataProvider.getInteger("Enter grade", 1, 10);
		dataProvider.showMessage("entered grade " + grade);
		Employee empl = new Manager(id, name, position, basicSalary, grade);
		dataProvider.showMessage("result: " + employees.hireEmployee(empl) + "\n");
		
	}
	
}

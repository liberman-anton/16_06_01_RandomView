package tel_ran.view.tests;

import tel_ran.employees.model.dao.Employee;
import tel_ran.employees.model.dao.WageEmployee;
import tel_ran.employees.model.interfaces.IEmployeesModel;

public class HireEmployeeWageItem extends HireEmployeeItem {
	
	public HireEmployeeWageItem(int probability, IEmployeesModel employees) {
		super(probability, employees);
	}

	@Override
	public String getDisplayedName() {
		return "Hire EmployeeWage";
	}

	@Override
	public void action() {
		super.action();
		
		int wage = dataProvider.getInteger("Enter wage", 100, 500);
		dataProvider.showMessage("entered wage " + wage);
		int hours = dataProvider.getInteger("Enter hours", 1, 250);
		dataProvider.showMessage("entered hours " + hours);
		Employee empl = new WageEmployee(id, name, position, basicSalary, wage, hours);
		dataProvider.showMessage("result: " + employees.hireEmployee(empl) + "\n");
	}


}

package tel_ran.view.tests;

import tel_ran.employees.model.interfaces.IEmployeesModel;


public class FireEmployeeItem extends EmployeeRandomItem {

	public FireEmployeeItem(int probability, IEmployeesModel employees) {
		super(probability, employees);
	}

	@Override
	public String getDisplayedName() {
		return "Fire Employee";
	}

	@Override
	public void action() {
		int id = dataProvider.getInteger("Enter id", 0, 4);
		dataProvider.showMessage("entered id " + id);
		dataProvider.showMessage("result: " + employees.fireEmployee(id) + "\n");

	}

}

package tel_ran.view.tests;

import tel_ran.employees.model.interfaces.IEmployeesModel;

public class GetEmployeeItem extends EmployeeRandomItem {
	
	public GetEmployeeItem(int probability, IEmployeesModel employees) {
		super(probability, employees);
	}

	@Override
	public String getDisplayedName() {
		return "Get employee";
	}

	@Override
	public void action() {
		int id = dataProvider.getInteger("Enter id", 0, 4);
		dataProvider.showMessage("entered id " + id);
		dataProvider.showMessage("result: " + employees.getEmployee(id) + "\n");

	}

}

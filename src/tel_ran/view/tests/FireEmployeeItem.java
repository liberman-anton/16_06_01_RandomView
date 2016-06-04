package tel_ran.view.tests;

import tel_ran.employees.model.interfaces.IEmployeesModel;
import tel_ran.view.random.RandomItem;

public class FireEmployeeItem extends RandomItem {
	IEmployeesModel employees;

	public FireEmployeeItem(int probability, IEmployeesModel employees) {
		super(probability);
		this.employees = employees;
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

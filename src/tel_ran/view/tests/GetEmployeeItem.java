package tel_ran.view.tests;

import tel_ran.employees.model.interfaces.IEmployeesModel;
import tel_ran.view.random.RandomItem;

public class GetEmployeeItem extends RandomItem {
	IEmployeesModel employees;

	public GetEmployeeItem(int probability, IEmployeesModel employees) {
		super(probability);
		this.employees = employees;
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

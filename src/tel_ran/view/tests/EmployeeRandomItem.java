package tel_ran.view.tests;

import tel_ran.employees.model.interfaces.IEmployeesModel;
import tel_ran.view.random.RandomItem;

public abstract class EmployeeRandomItem extends RandomItem {
	protected static IEmployeesModel employees;
	
	public EmployeeRandomItem(int probability, IEmployeesModel employees) {
		super(probability);
		EmployeeRandomItem.employees = employees;
	}

	@Override
	public String getDisplayedName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub

	}

}

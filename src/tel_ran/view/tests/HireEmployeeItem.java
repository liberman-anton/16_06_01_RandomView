package tel_ran.view.tests;

import tel_ran.employees.model.interfaces.IEmployeesModel;

public abstract class HireEmployeeItem extends EmployeeRandomItem {
	protected int id;
	protected int basicSalary;
	protected String position;
	protected String name;
	

	public HireEmployeeItem(int probability, IEmployeesModel employees) {
		super(probability, employees);
	}

	@Override
	public String getDisplayedName() {
		
		return "Hire Employee";
	}

	@Override
	public void action() {
		
		id = dataProvider.getInteger("Enter id", 1, Integer.MAX_VALUE);
		dataProvider.showMessage("entered id " + id);	
		basicSalary = dataProvider.getInteger("Enter basic salary", 500, 1000);
		dataProvider.showMessage("entered basic salary " + basicSalary);
		position = "Position" + dataProvider.getInteger("Enter position", 1, 5);
		dataProvider.showMessage("entered position: " + position);
		name = "Name" + dataProvider.getInteger("Enter name", 1, 20);
		dataProvider.showMessage("entered name: " + name);

	}	

}

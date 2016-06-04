package tel_ran.view.tests;

import tel_ran.collections.Array;
import tel_ran.employees.model.interfaces.IEmployeesModel;

public class GetAllEmployeesItem extends EmployeeRandomItem {

	public GetAllEmployeesItem(int probability, IEmployeesModel employees) {
		super(probability, employees);
		
	}

	@Override
	public String getDisplayedName() {
		// TODO Auto-generated method stub
		return "Get all employees";
	}

	@Override
	public void action() {
		Array arr = employees.getAllEmployees();
		int nElements = arr.size();
		dataProvider.showMessage("result " + nElements + " elements: ");
		for(int i = 0; i < nElements ; i++){
			dataProvider.showMessage((arr.get(i)).toString());
		}
		dataProvider.showMessage("Get all employees complet!\n");
	}

}

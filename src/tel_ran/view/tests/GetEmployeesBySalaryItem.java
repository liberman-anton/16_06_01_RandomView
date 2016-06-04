package tel_ran.view.tests;

import tel_ran.collections.Array;
import tel_ran.employees.model.interfaces.IEmployeesModel;
import tel_ran.view.random.RandomItem;

public class GetEmployeesBySalaryItem extends RandomItem {
	IEmployeesModel employees;

	public GetEmployeesBySalaryItem(int probability, IEmployeesModel employees) {
		super(probability);
		this.employees = employees;
	}

	@Override
	public String getDisplayedName() {
		
		return "Get employees by salary";
	}

	@Override
	public void action() {
		int minSalary = dataProvider.getInteger("Enter minSalary", 3000, 4000);
		dataProvider.showMessage("entered minSalary " + minSalary);
		int maxSalary = dataProvider.getInteger("Enter maxSalary", 4000, 50000);
		dataProvider.showMessage("entered maxSalary " + maxSalary);
		Array arr = employees.getEmployeesBySalary(minSalary, maxSalary);
		int nElements = arr.size();
		dataProvider.showMessage("result " + nElements + " elements: ");
		for(int i = 0; i < nElements ; i++){
			dataProvider.showMessage((arr.get(i)).toString());
		}
		dataProvider.showMessage("Get employees by salary complet!\n");
	}

}

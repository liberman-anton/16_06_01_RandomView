package tel_ran.employees.controller;

import tel_ran.employees.model.dao.Employee;
import tel_ran.employees.model.dao.Manager;
import tel_ran.employees.model.implementation.EmployeesArray;
import tel_ran.employees.model.interfaces.IEmployeesModel;
import tel_ran.generation.events.Distribution;
import tel_ran.view.random.RandomMenu;
import tel_ran.view.tests.FireEmployeeItem;
import tel_ran.view.tests.GetAllEmployeesItem;
import tel_ran.view.tests.GetEmployeeItem;
import tel_ran.view.tests.GetEmployeesBySalaryItem;
import tel_ran.view.tests.HireEmployeeManagerItem;
import tel_ran.view.tests.HireEmployeeWageItem;


public class EmployeesControllerAppl {

	public static void main(String[] args) {
		IEmployeesModel employees = new EmployeesArray();
		for(int i = 0; i < 5; i++){
			Employee empl = new Manager(i, "Name" + i * 10, "position" + i * 100, 1000, 1000);
			employees.hireEmployee(empl);
		}
		Distribution items=new Distribution();
		items.addEvent(new HireEmployeeManagerItem(20, employees));
		items.addEvent(new HireEmployeeWageItem(20, employees));
		items.addEvent(new FireEmployeeItem(10, employees));
		items.addEvent(new GetAllEmployeesItem(10, employees));
		items.addEvent(new GetEmployeeItem(20, employees));
		items.addEvent(new GetEmployeesBySalaryItem(20, employees));
		int nRuns=20;
		RandomMenu menu=new RandomMenu(items, nRuns);
		menu.runMenu();

	}

}

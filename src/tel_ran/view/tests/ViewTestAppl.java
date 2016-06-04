package tel_ran.view.tests;

import tel_ran.generation.events.Distribution;
import tel_ran.view.random.RandomMenu;

public class ViewTestAppl {

	public static void main(String[] args) {
		Distribution items=new Distribution();
		items.addEvent(new AddNumbersItem(50));
		items.addEvent(new StringLengthItem(50));
		int nRuns=10;
		RandomMenu menu=new RandomMenu(items, nRuns);
		menu.runMenu();

	}

}

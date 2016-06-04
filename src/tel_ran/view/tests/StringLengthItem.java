package tel_ran.view.tests;

import tel_ran.view.random.RandomItem;

public class StringLengthItem extends RandomItem {

	public StringLengthItem(int probability) {
		super(probability);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDisplayedName() {
		// TODO Auto-generated method stub
		return "displaying string length";
	}

	@Override
	public void action() {
		String []strings={"abcd","lmn","12345667","oooooo","ddd"};
		String str=dataProvider.getString("select string", strings);
		dataProvider.showMessage("selected string is: "+str);
		dataProvider.showMessage("string length is: "+str.length());

	}

}

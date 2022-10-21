import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	String userName = null;
	public ProduceProductMenu(String userName) {
		this.userName = userName;
	}

	public void showMenu(HashMap<String, Integer> menu_data)
	{
		System.out.println("Items in Produce Menu are as follows : ");
		for(Map.Entry<String,Integer> entry : menu_data.entrySet())
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			if(value == 1)
				System.out.println(key);
		}
		showAddButton(menu_data);
	}

	public void showAddButton(HashMap<String, Integer> menu_data)
	{
		System.out.println("Please Enter Produce Menu");
		Scanner myObj = new Scanner(System.in);
		String item = myObj.nextLine();
		if(menu_data.containsKey(item)) {
			Facade facade = new Facade();
			facade.addTrading(this.userName, item);
		}
		else
		{
			System.out.println("This Item is not available");
		}
	}

	public void showViewButton() {
		System.out.println("Showing the view button in Produce Product Menu");
	}

	public void showRadioButton() {
		System.out.println("Showing the radio button in Produce Product Menu");
	}

	public void showLabels() {
		System.out.println("Showing the labels in Produce Product Menu");
	}

	public void showComboxes() {
		System.out.println("Showing the combo boxes in Produce Product Menu");
	}

}

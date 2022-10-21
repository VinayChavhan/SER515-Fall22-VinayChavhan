import java.io.File;
import java.security.spec.ECField;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	String username = null;

	public MeatProductMenu(String userName) {
		this.username = userName;
	}

	public void showMenu(HashMap<String, Integer> menu_data) {
		System.out.println("Items in Meat Menu are as follows : ");
		for(Map.Entry<String,Integer> entry : menu_data.entrySet())
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			if(value == 0)
				System.out.println(key);
		}
		this.showAddButton(menu_data);
	}

	public void showAddButton(HashMap<String, Integer> menu_data) {
		System.out.println("Please Enter Meat Menu");
		Scanner myObj = new Scanner(System.in);
		String item = myObj.nextLine();
		if(menu_data.containsKey(item)) {
			Facade facade = new Facade();
			facade.addTrading(this.username, item);
		}
		else
		{
			System.out.println("This Item is not available");
		}

	}

	public void showViewButton() {
		System.out.println("Showing the view button in Meat Product Menu");
	}

	public void showRadioButton() {
		System.out.println("Showing the radio button in Meat Product Menu");
	}

	public void showLabels() {
		System.out.println("Showing the labels in Meat Product Menu");
	}

	public void showComboxes() {
		System.out.println("Showing the combo boxes in Meat Product Menu");
	}

}

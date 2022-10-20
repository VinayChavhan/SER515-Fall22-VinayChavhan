import java.io.File;
import java.security.spec.ECField;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu(HashMap<String, Integer> menu_data) {
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
		String menu = myObj.nextLine();
		if(menu_data.containsKey(menu)) {
			Facade facade = new Facade();
			facade.addTrading(this);
		}
		else
		{
			System.out.println("This Item is not available");
		}

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}

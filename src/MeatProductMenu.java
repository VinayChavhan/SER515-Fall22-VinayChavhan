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
	}

	public void showAddButton() {

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

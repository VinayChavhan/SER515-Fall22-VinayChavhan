import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu(HashMap<String, Integer> menu_data)
	{
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

	public void showRadioButton()
	{

	}

	public void showLabels()
	{

	}

	public void showViewButton()
	{

	}

	public void showComboxes()
	{

	}

}

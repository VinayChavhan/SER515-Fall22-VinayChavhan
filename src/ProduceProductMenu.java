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
	}

	public void showAddButton()
	{

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

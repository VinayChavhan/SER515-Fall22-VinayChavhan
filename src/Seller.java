import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Seller extends Person {

	ProductMenu menu = null;
	HashMap<String, Integer> menu_data= new HashMap<>();
	public Seller(ProductMenu meatProductMenu) {
		this.menu = menu;
	}

	public void showMenu() {
		System.out.println("+++++++++++Factory Pattern+++++++++++");
		System.out.println("Deciding object and calling it runtime");
		menu.showMenu(menu_data);
	}

	public void CreateProductMenu() {
		System.out.println("+++++++++++Bridge Pattern+++++++++++");
		System.out.println("Creating Menu");
		File file = new File("ProductInfo.txt");
		try {
			String st = null;
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				st = sc.nextLine();
				String[] dict = st.split(":");
				menu_data.put(dict[1],dict[0].equals("Produce") ? 1 : 0);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

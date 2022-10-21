import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Seller extends Person {

	ProductMenu menu = null;
	HashMap<String, Integer> seller_menu_data= new HashMap<>();
	public Seller(ProductMenu meatProductMenu) {
		this.menu = meatProductMenu;
	}

	public void showMenu() {
		menu.showMenu(seller_menu_data);
	}

	public void CreateProductMenu() {
		File file = new File("ProductInfo.txt");
		try {
			String st = null;
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				st = sc.nextLine();
				String[] dict = st.split(":");
				seller_menu_data.put(dict[1],dict[0].equals("Produce") ? 1 : 0);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Buyer extends Person {

	ProductMenu menu = null;

	HashMap<String, Integer> buyer_menu_data= new HashMap<>();
	public Buyer(ProductMenu menu) {
		this.menu = menu;
	}

	public void showMenu() {
		menu.showMenu(buyer_menu_data);
	}

	public void CreateProductMenu() {
		File file = new File("ProductInfo.txt");
		try {
			String st = null;
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				st = sc.nextLine();
				String[] dict = st.split(":");
				buyer_menu_data.put(dict[1],dict[0].equals("Produce") ? 1 : 0);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}


}

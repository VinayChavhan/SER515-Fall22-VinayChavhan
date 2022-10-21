import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class Facade {

	private int UserType; //Buyer: 0, Seller 1 

	private Product theSelectedProduct;

	private int nProductCategory;//0: Meat, 1: Produce. 

	private ClassProductList theProductList;

	private Person thePerson;
	String userName = null;
	public void start_facade()
	{
		try {
			login();
			showItems();
			Person user = createUser();
			if(user != null) {
				user.CreateProductMenu();
				System.out.println();
				System.out.println("+++++++++++Bridge Pattern+++++++++++");
				user.showMenu();

				System.out.println();
				System.out.println("+++++++++++Visitor Pattern+++++++++++");
				remind();
				System.out.println("\nThe all Menu are successfully saved into a file UserProduct.txt");
			}
			else
			{
				System.out.println("User is null, please try again");
				start_facade();
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found, Please add the BuyerInfo.txt and SellerInfo.txt in code directory to proceed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			start_facade();
		}
	}
	public void login() {
			Login l = new Login();
			Scanner myObj = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter username");
			userName = myObj.nextLine();

			Scanner myObj1 = new Scanner(System.in);
			System.out.println("Enter password");
			String password = myObj1.nextLine();

			UserType = l.login(userName, password);

			if (UserType == -1) {
				System.out.print("Invalid Credentials, Please try again");
				login();
			}
			else {
				if (UserType == 0)
					System.out.println("Buyer Logged in");
				else if (UserType == 1)
					System.out.println("Seller Logged in");
			}
	}

	public void addTrading(String username, String item) {
		System.out.println(("Adding for Trade"));
		try {
			FileWriter fw=new FileWriter("UserProduct.txt",true);
			fw.write(username+":"+item+"\n");
			fw.close();
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
	}

	public void viewTrading() {
		System.out.println(("View Trading"));
	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {
		NodeVisitor reminder = new ReminderVisitor();
		ClassProductList myObj = new ClassProductList();
		myObj.accept(reminder);
	}

	public void showItems()
	{
		System.out.println();
		System.out.println("+++++++++++Iterator Pattern+++++++++++");
		System.out.println("Exsting items in list");
		HashMap<String, Integer> menu_data = new HashMap<>();
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
		ProductIterator productIterator = new ProductIterator(menu_data);
		while(productIterator.hasNext()) {
			productIterator.next().forEach((key, value) -> System.out.println(" "+key + " : " + value));
		}
	}
	public Person createUser() throws Exception {
		Person user = null;
		Scanner myObj = new Scanner(System.in);
		System.out.println();
		System.out.println("+++++++++++Factory Pattern+++++++++++");
		System.out.println("Deciding object and calling it runtime");
		System.out.println();
		System.out.println("Enter Type of Menu you want to see\n" +
				"0 for Meat\n" + "1 for Produce");
		nProductCategory = myObj.nextInt();
		if (UserType == 0) {
			if (nProductCategory == 0) {
				user = new Buyer(new MeatProductMenu(this.userName));
			} else if (nProductCategory == 1) {
				user = new Buyer(new ProduceProductMenu(this.userName));
			} else {
				throw new Exception("Invalid Entry, Please type 0 or 1 to see Menu");
			}
		}
		else
		{
			if (nProductCategory == 0) {
				user = new Seller(new MeatProductMenu(this.userName));
			} else if (nProductCategory == 1) {
				user = new Seller(new ProduceProductMenu(this.userName));
			} else {
					throw new Exception("Invalid Entry, Please type 0 or 1 to see Menu");
			}
		}
		return user;
	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}

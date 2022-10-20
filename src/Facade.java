import java.io.FileNotFoundException;
import java.util.Scanner;
public class Facade {

	private int UserType; //Buyer: 0, Seller 1 

	private Product theSelectedProduct;

	private int nProductCategory;//0: Meat, 1: Produce. 

	private ClassProductList theProductList;

	private Person thePerson;

	public void login() {
		try
		{
			Login l = new Login();
			UserType = l.login();
			if (UserType == -1) {
				System.out.print("Invalid Credentials, Please try again");
				login();
			}
			else {
				if(UserType == 0)
					System.out.println("Buyer Logged in");
				else if(UserType == 1)
					System.out.println("Seller Logged in");
				createUser();
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found, Please add the BuyerInfo.txt and SellerInfo.txt in code directory to proceed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			login();
		}
	}

	public void addTrading(ProductMenu menu) {
		System.out.println(("Adding for Trade"));
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

	}

	public void createUser() throws Exception {

		Person user = null;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Type of Menu you want to see\n" +
				"0 for Meat\n" + "1 for Produce");
		nProductCategory = myObj.nextInt();
		if (UserType == 0) {
			if (nProductCategory == 0) {
				user = new Buyer(new MeatProductMenu());
			} else if (nProductCategory == 1) {
				user = new Buyer(new ProduceProductMenu());
			} else {
				throw new Exception("Invalid Entry, Please type 0 or 1 to see Menu");
			}
		}
		else
		{
			if (nProductCategory == 0) {
				user = new Seller(new MeatProductMenu());
			} else if (nProductCategory == 1) {
				user = new Seller(new ProduceProductMenu());
			} else {
					throw new Exception("Invalid Entry, Please type 0 or 1 to see Menu");
			}
		}
		if(user != null) {
			user.CreateProductMenu();
			user.showMenu();
		}
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

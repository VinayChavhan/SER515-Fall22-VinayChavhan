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
			} else {
				Scanner myObj = new Scanner(System.in);
				System.out.println("Enter Type of Menu you want to see\n" +
						"0 for Meat\n" + "1 for Produce");
				nProductCategory = myObj.nextInt();
				if (UserType == 0) {
					Buyer buyer;
					if (nProductCategory == 0) {
						buyer = new Buyer(new MeatProductMenu());
						buyer.CreateProductMenu();
						buyer.showMenu();
					} else if (nProductCategory == 1) {
						buyer = new Buyer(new ProduceProductMenu());
						buyer.CreateProductMenu();
						buyer.showMenu();
					} else
						System.out.println("Invalid Entry, Please type 0 or 1 to see Menu");
				}
				else
				{
					Seller seller;
					if (nProductCategory == 0) {
						seller = new Seller(new MeatProductMenu());
						seller.CreateProductMenu();
						seller.showMenu();
					} else if (nProductCategory == 1) {
						seller = new Seller(new ProduceProductMenu());
						seller.CreateProductMenu();
						seller.showMenu();
					} else
						System.out.println("Invalid Entry, Please type 0 or 1 to see Menu");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser() {

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

import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws Exception
    {
        int choice = 0;
        System.out.println("Design Pattern Assignment");
        System.out.println("Please use console to access the application");
        System.out.println();
        while(choice == 0) {
            Facade facade = new Facade();
            System.out.println("+++++++++++Facade Pattern+++++++++++");
            facade.start_facade();
            Scanner myObj = new Scanner(System.in);
            System.out.println("Want to access application again? \n 0. Continue \n 1. Logout");
            choice = myObj.nextInt();
        }
        System.out.println("Bye Bye User, Have a nice day");
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter username");
//        String userName = myObj.nextLine();
//
//        Scanner myObj1 = new Scanner(System.in);
//        System.out.println("Enter password");
//        String password = myObj1.nextLine();
//
//        Scanner myObj2 = new Scanner(System.in);
//        System.out.println("Enter Type 0 for Buyer or 1 for seller");
//        String type = myObj2.nextLine();
//
//        if(type.equals("0"))
//        {
//            boolean flag = true;
//            File file = new File("BuyerInfo.txt");
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine())
//                if(sc.nextLine().equals(userName+":"+password))
//                {
//                    System.out.print("You are logged in successfuly as Buyer");
//                    flag = false;
//                    break;
//                }
//            if(flag)
//            {
//                System.out.print("Invalid Credentials for Buyer, Please try again");
//            }
//        }
//        else if(type.equals("1"))
//        {
//            boolean flag = true;
//            File file = new File("SellerInfo.txt");
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine())
//                if(sc.nextLine().equals(userName+":"+password))
//                {
//                    System.out.print("You are logged in successfuly as Seller");
//                    flag = false;
//                    break;
//                }
//            if(flag)
//            {
//                System.out.print("Invalid Credentials for Buyer, Please try again");
//            }
//        }
//        else{
//            System.out.print("Invalid Type entered, Please Type 0 or 1");
//        }
    }
}

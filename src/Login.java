import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
public class Login {
    HashMap<String, Integer> credentials= new HashMap<>();
    public Login(){
        try {
            File file = new File("BuyerInfo.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                credentials.put(sc.nextLine(), 0);
            file = new File("SellerInfo.txt");
            sc = new Scanner(file);
            while (sc.hasNextLine())
                credentials.put(sc.nextLine(), 1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public int login() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter password");
        String password = myObj1.nextLine();

        //Login Verification
        String check_credentials = userName+":"+password;
        check_credentials.toLowerCase();
        if(credentials.containsKey(check_credentials)) {
            System.out.println("Login Successful, Welcome "+userName);
            return credentials.get(check_credentials);
        }
        return -1;
    }
}

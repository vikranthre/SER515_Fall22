import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Person {

	public String uname;
	public String pwd;
	private ProductMenu theProductMenu;

	private ProductMenu productMenu;
	private Throwable e;

	public Person(String s, String s1) {

	}
	public boolean checkUser(String string) {
		Scanner sc;
		try {
			sc = new Scanner(new File(string));
			while (sc.hasNextLine()) {
				String s1[]= sc.next().split(":");

				if(s1[0].equals(this.uname)&&s1[1].equals(this.pwd)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error finding the user");
			e.printStackTrace();
		}
		return false;
	}

	public boolean userLogin(boolean True) throws FileNotFoundException {
		if(this.getClass().equals(Buyer.class)) {
			String c = "C:/Users/vtripura/Documents/SER515_Fall22/BuyerInfo.txt";
			//String c = "C:/Users/vtripura/Documents/SER515_Fall22/BuyerInfo.txt/"
			return checkUser(c);
		}

		else {
			return checkUser("/Users/vtripura/Documents/SER515_Fall22/SellerInfo.txt");
		}
	}


	public Person() {

	}

	public void showLabels() {

	}

	public Object CreateProductMenu() {
		return null;
	}

	public void showAddButton() {

	}

	public void showMenu() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}


	public void showMenu(int uservalue) {
	}
}

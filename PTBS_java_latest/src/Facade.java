import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Facade {


	public Facade() {
		System.out.println("Facade Design Pattern");
		System.out.println("Enter 0 to Login as Buyer");
		System.out.println("Enter 1 to Login as Seller");
	}


	public void createProductList() {
		try {
			path:
			{
				var s = "/Users/vtripura/Documents/SER515_Fall22/UserProduct.txt/";
			}
			Scanner sc= new Scanner(System.in);
			int j=0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				j++;
			}

			j=0;
			while (sc.hasNextLine()) {
				//	this.Product[j]=new Product(sc.nextLine().trim());
				j++;
			}

		}
		finally {
			System.out.print("File not found");
		}

	}


	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() {

		String uname;
		String pwd;



		return false;
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

	public void createUser(UserInfoItem userinfoitem) {

	}



	public void attachProductToUser() {

	}

	public Product selectProduct() {
		return null;
	}

	public void productOperation() {

	}
}



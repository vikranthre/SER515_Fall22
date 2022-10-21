import java.io.FileNotFoundException;
import java.util.Scanner;

//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Facade Design Pattern");
        System.out.println("Enter 0 to Login as Buyer");
        System.out.println("Enter 1 to Login as Seller");


        Scanner sc = new Scanner(System.in);
        int uservalue = sc.nextInt();
        Reminder r= new Reminder();
        Person per;
        boolean True = false;
        if (uservalue == 0) {
            per = new Person("", "");
            System.out.println("Please enter username");
            per.uname=sc.next();
            System.out.println("Please enter password");
            per.pwd=sc.next();

            if (per.userLogin(True)) {
                System.out.println("************Logged in as successfully *************");
                per.CreateProductMenu();

            }
            else
                System.out.println("***Invalid credentials , Please check username and password***");

            uservalue=-1;

            System.out.println("*Bridge Design Pattern is introduced*");

            while (uservalue!=1||uservalue!=2) {


                System.out.println("Please chooose from any beloww");

                System.out.println("1. Product Categories");

                System.out.println("2. Products");

                uservalue=sc.nextInt();

                if(uservalue==1||uservalue==0) {
                    if(uservalue==1) {
                        uservalue=-1;
                        System.out.println("Factory Design Patterns is introduced");

                        System.out.println("Please choose product category:");

                        System.out.println("1.Produce Product Menu");
                        System.out.println("2.Meat Product Menu");

                        uservalue=sc.nextInt();
                        if(uservalue==1)
                            per.showMenu(uservalue);
                        System.out.println("Beef is added to Products");
                        System.out.println("Pork is added to Products");
                        System.out.println("Mutton is added to Products");
                        System.out.println("Visitor Design Pattern is introduced");
                        if(uservalue==2)
                            per.showMenu(uservalue);
                        System.out.println("Beef is added to menu");
                        System.out.println("Pork is added to menu");
                        System.out.println("Mutton is added to menu");

                        System.exit(0);
                    }
                    if(uservalue==0) {
                        System.out.println("Visitor Design Pattern");
                        r.display(new ProductList());
                        System.exit(0);
                    }

                }
            }


        }
        else if (uservalue==1) {
            per = new Seller("", "");
            System.out.println("please give the  Enter uname");
            per.uname=sc.next();
            System.out.println("please Enter pwd");
            per.pwd=sc.next();
            if (per.userLogin(True)) {
                per.CreateProductMenu();
            }
            else
                System.out.println("Credentials are not valid");

            uservalue=-1;
            System.out.println("Bridge Design Pattern is introduced");
            while (uservalue!=1||uservalue!=2) {
                System.out.println("please chooose product category:");
                uservalue=sc.nextInt();
                if(uservalue==1||uservalue==2||uservalue==3) {
                    if(uservalue==1||uservalue==2) {
                        System.out.println("Factory Design Pattern");
                        per.showMenu(uservalue);
                    }
                    if(uservalue==3) {
                        System.out.println("Visitor Design Pattern is introduced");
                        r.display(new ProductList());
                    }
                    else
                        System.out.println("Not a valid uservalue");


                }
            }
        }
        else {
            System.out.println("ERROR Found // Please try again");
        }


    }

    private static class ProductList {
    }
}
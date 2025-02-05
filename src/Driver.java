import java.util.Scanner;


public class Driver{

    private Scanner input = new Scanner(System.in);
    private Product productObject;

    public static void main(String[] args) {
		Driver driver = new Driver();
		driver.addProduct();
		driver.printProduct();
	}

    //gather the product data from the user and create a new product object.
    private void addProduct(){
    	System.out.print("Enter the Product Name:  ");
        String productName = input.nextLine();
        System.out.print("Enter the Product Code:  ");
        int productCode = input.nextInt();
        System.out.print("Enter the Unit Cost:  ");
        double unitCost = input.nextDouble();

       //user input true or false on if the product is in line
    	System.out.print("Is this product in your current line (y/n): ");
    	char currentProduct = input.next().charAt(0);
    	boolean inCurrentProductLine = false;
    	if ((currentProduct == 'y') || (currentProduct == 'Y'))
    		inCurrentProductLine = true;
    	
        productObject = new Product(productName, productCode, unitCost, inCurrentProductLine);
    }
    
    //print the product calling toString method
    private void printProduct(){
    	System.out.println(productObject);
    }
	   	
}
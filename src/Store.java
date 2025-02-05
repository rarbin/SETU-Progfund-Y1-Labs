import java.util.ArrayList;

public class Store {

    private ArrayList<Product> productArray;

    public Store(){
        productArray = new ArrayList<Product>();
    }

    //add method, takes object type and returns a boolean to test if the array is full or not
    public boolean add (Product productObject){
        return productArray.add (productObject);
    }
    // lists products, test if the array is empty or not with boolean
    public String listProducts() {
        if (productArray.isEmpty()) {
            return "No products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < productArray.size(); i++) {
                listOfProducts += i + ": " + productArray.get(i) + "\n";
            }
            return listOfProducts;
        }
    }
    //list whats currently in array
    public String listProducts() {
        if (productArray.isEmpty()) {
            return "No products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < productArray.size(); i++) {
                listOfProducts += i + ": " + productArray.get(i) + "\n";
            }
            return listOfProducts;
        }
    }
    //check array against itself for cheapest unit cost
    public Product cheapestProduct() {
        if (!productArray.isEmpty()) {
            Product cheapestProduct = productArray.get(0);
            for (Product productObject : productArray) {
                if (productObject.getUnitCost() < cheapestProduct.getUnitCost())
                    cheapestProduct = productObject;
            }
            return cheapestProduct;
        } else {
            return null;
        }
    }
    //check the array against itself add collective unit cost by number of items entered
    public double averageProductPrice() {
        if (!productArray.isEmpty()) {
            double totalPrice = 0;
            for (Product product : productArray) {
                totalPrice += product.getUnitCost();
            }
            return totalPrice / productArray.size();
        } else {
            return -1;
        }
    }

    public String listProductsAboveAPrice(double price) {
        if (productArray.isEmpty()) {
            return "No Products in the store";
        } else {
            String str = "";
            for (int i = 0; i < productArray.size(); i++) {
                if (productArray.get(i).getUnitCost() > price)
                    str += i + ": " + productArray.get(i) + "\n";
            }
            if (str.equals("")) {
                return "No products are more expensive than: " + price;
            } else {
                return str;
            }
        }
    }

}
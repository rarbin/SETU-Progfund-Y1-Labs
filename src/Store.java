import java.util.ArrayList;

//save products to arraylist

public class Store {

    private ArrayList<Product> products;

    public Store(){
        products = new ArrayList<Product>();
    }

//add product to arraylist
    public boolean add (Product product){
        return products.add (product);
    }


    //lists products from the array list
    public String listProducts() {
        if (products.isEmpty()) {
            return "No products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < products.size(); i++) {
                listOfProducts += i + ": " + products.get(i) + "\n";
            }
            return listOfProducts;
        }
    }

  //finds cheapest product by comparing to previous product until whole arraylist is covered
    public Product cheapestProduct() {
        if (!products.isEmpty()) {
            Product cheapestProduct = products.get(0);
            for (Product product : products) {
                if (product.getUnitCost() < cheapestProduct.getUnitCost())
                    cheapestProduct = product;
            }
            return cheapestProduct;
        } else {
            return null;
        }
    }

    //lists out all previous products in an array
    public String listCurrentProducts() {
        if (products.isEmpty()) {
            return "No Products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).isInCurrentProductLine())
                    listOfProducts += i + ": " + products.get(i) + "\n";
            }
            if (listOfProducts.equals("")){
                return "No Products are in our current product line";
            }
            else{
                return listOfProducts;
            }
        }
    }

 //finds the average of product price
    public double averageProductPrice() {
        if (!products.isEmpty()) {
            double totalPrice = 0;
            for (Product product : products) {
                totalPrice += product.getUnitCost();
            }
            return totalPrice / products.size();
        } else {
            return -1;
        }
    }

 //lists products above specific price
    public String listProductsAboveAPrice(double price) {
        if (products.isEmpty()) {
            return "No Products in the store";
        } else {
            String str = "";
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getUnitCost() > price)
                    str += i + ": " + products.get(i) + "\n";
            }
            if (str.equals("")) {
                return "No products are more expensive than: " + price;
            } else {
                return str;
            }
        }
    }

}

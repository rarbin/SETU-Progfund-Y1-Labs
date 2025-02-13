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
//accessor method for arraylist of products
    public ArrayList<Product> getProducts(){
        return products;
    }
//method that indicates size of array list
    public int numberOfProducts() {
        return products.size();
    }
//method that checks if number is a valid index in arraylist
    public boolean isValidIndex(int index) {
        return (index >= 0) && (index < products.size());
    }
//method to delete product, using isValidIndex to ensure the product exists at that index
    public Product deleteProduct(int indexToDelete) {
        if (isValidIndex(indexToDelete)) {
            return products.remove(indexToDelete);
        }
        return null;
    }
//find product in an arraylist, first validates than an index exists to search
    public Product findProduct(int index) {
        if (isValidIndex(index)) {
            return products.get(index);
        }
        return null;
    }
//update product by using the findProduct method to locate which product to change on the index.
    public boolean updateProduct(int indexToUpdate, Product updateDetails) {
        //find the product object by the index number
        Product foundProduct = findProduct(indexToUpdate);

        //if the product exists, use the details passed in the updateDetails parameter to
        //update the found product in the ArrayList.
        if (foundProduct != null) {
            foundProduct.setProductName(updateDetails.getProductName());
            foundProduct.setProductCode(updateDetails.getProductCode());
            foundProduct.setUnitCost(updateDetails.getUnitCost());
            foundProduct.setInCurrentProductLine(updateDetails.isInCurrentProductLine());
            return true;
        }

        //if the product was not found, return false, indicating that the update was not successful
        return false;
    }



}

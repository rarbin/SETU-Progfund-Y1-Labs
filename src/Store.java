public class Store {

    private Product[] productArray;
    private int total = 0;

    //number of products in an array, next index location
    public Store(int numberItems) {
        productArray = new Product[numberItems];
    }

    private boolean isFull() {
        return total == productArray.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }
//add method, takes object type and returns a boolean to test if the array is full or not
    public boolean add(Product productObject) {
        if (isFull()) {
            return false;
        } else {
            productArray[total] = productObject;
            total++;
            return true;
        }
    }
    // lists products, test if the array is empty or not with boolean
    public String listProducts() {
        if (isEmpty()) {
            return "No products";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < total; i++) {
                listOfProducts += i + ": " + productArray[i] + "\n";

            }
            return listOfProducts;
        }
    }

    //list whats currently in array
    public String listCurrentProducts() {
        if (isEmpty()) {
            return "No Products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < total; i++) {
                if (productArray[i].isInCurrentProductLine())
                    listOfProducts += i + ": " + productArray[i] + "\n";
            }
            if (listOfProducts.equals("")){
                return "No Products are in our current product line";
            }
            else{
                return listOfProducts;
            }
        }
    }
//check array against itself for cheapest unit cost
    public Product cheapestProduct() {
        if (!isEmpty()) {
            Product cheapestProduct = productArray[0];
            for (int i = 0; i < total; i++) {
                if (productArray[i].getUnitCost() < cheapestProduct.getUnitCost())
                    cheapestProduct = productArray[i];
            }
            return cheapestProduct;
        } else {
            return null;
        }
    }
//check the array against itself add collective unit cost by number of items entered
    public double averageProductPrice() {
        if (!isEmpty()) {
            double totalPrice = 0;
            for (int i = 0; i < total; i++) {
                totalPrice += productArray[i].getUnitCost();
            }
            return totalPrice / total;
        } else {
            return -1;
        }

    }

    /*String containing the details off all entered products
    whose unit cost is above that of the price entered as a parameter, check whole array*/
    public String listProductsAboveAPrice(double price) {
        if (isEmpty()) {
            return "No Products in the store";
        } else {
            String str = "";
            for (int i = 0; i < total; i++) {
                if (productArray[i].getUnitCost() > price)
                    str += i + ": " + productArray[i] + "\n";
            }
            if (str.equals("")) {
                return "No products are more expensive than: " + price;
            } else {
                return str;
            }
        }
    }

}



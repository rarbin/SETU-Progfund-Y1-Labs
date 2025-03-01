package models;

public class Product {

    //default values
    private String productName = "";
    private int productCode = -1;
    private double unitCost = 0;
    private boolean inCurrentProductLine = false;

  //constructor class for product, name, code, cost and if its in product line or not.
    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        this.productName = productName;
        this.productCode = productCode;
        this.unitCost = unitCost;
        this.inCurrentProductLine = inCurrentProductLine;
    }

 //getters to return product name, cost, code and if its in product line or not
    public String getProductName(){
        return productName;
    }

    public double getUnitCost(){
        return unitCost;
    }

    public int getProductCode() {
		return productCode;
	}

    public boolean isInCurrentProductLine() {
		return inCurrentProductLine;
	}

//sets parameters based on user input
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public void setInCurrentProductLine(boolean inCurrentProductLine) {
		this.inCurrentProductLine = inCurrentProductLine;
	}

   //string built, displays user input data
    public String toString()
    {
        return "Product description: " + productName
             + ", product code: " + productCode
             + ", unit cost: " + unitCost
             + ", currently in product line: " + inCurrentProductLine;
    }

}

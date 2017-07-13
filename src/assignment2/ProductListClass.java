package assignment2;

import java.util.Collections;
import java.util.List;


public class ProductListClass {

	
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		Collections.sort(productList);
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ProductListClass [productList=" + productList + "]";
	}
	
	
	
}

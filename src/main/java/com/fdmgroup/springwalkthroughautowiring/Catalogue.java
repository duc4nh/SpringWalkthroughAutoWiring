package com.fdmgroup.springwalkthroughautowiring;

import java.util.List;

import javax.annotation.Resource;

public class Catalogue {
	
	@Resource(name="allProducts")
	private List<Product> allProducts;
	
	/*public Catalogue(List<Product> allProducts) {
		this.allProducts = allProducts;
		System.out.println("List injected" + allProducts);
	}*/
}

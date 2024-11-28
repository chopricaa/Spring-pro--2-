package springpro.example.proex.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springpro.example.proex.models.Product;
import springpro.example.proex.services.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductServices productServices;
//	@GetMapping("/products")
//	//@GetMapping
//	
//	public List<Map<String, Object>> getAllProducts(){
//		return Arrays.asList(
//			Map.of("name", "product 1", "price", 234),
//			Map.of("name", "product 2", "price", 134)
//			
//		);
//		
//	}
	
	
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productServices.getAllProducts();
		
	}
	//@GetMapping("/products/category")
	@GetMapping("/category")
	public List<Map<String, Object>> getcategoryProduct(){
		return Arrays.asList(
				Map.of("Swathi", "product 1"),
				Map.of("Ani", "product 2")
		);
				
				
	}
//	 public List<Map<String, Object>> getCategoryProduct() {
//	        return productServices.getSortedProducts();
//	    }
	 @GetMapping("/sortt")
	 public List<Product> getProducts(){
		 return productServices.getProducts();
	 }
}


package springpro.example.proex.services;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import springpro.example.proex.models.Product;
import springpro.example.proex.repositories.ProductRepository;



@Service
public class ProductServices {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product>getAllProducts(){
		return productRepository.findAll();
	}
	
//	public List<Map<String, Object>> getSortedProducts(){
//		List<Map<String, Object>> products1 = return Arrays.asList(
//	            Map.of("name", "product 4"),
//	            Map.of("name", "product 1"),
//	            Map.of("name", "product 3")
//	            );	
		
		
//		 return products.stream()
//	                .sorted((p1, p2) -> ((String) p1.get("name")).compareTo((String) p2.get("name")))
//	                .collect(Collectors.toList());
//	}
	public List<Product>getProducts(){
		List<Product> products = productRepository.findAll(Sort.by(Sort.Direction.ASC,"name"));
		return products;
	}
	
	
	  
	

}

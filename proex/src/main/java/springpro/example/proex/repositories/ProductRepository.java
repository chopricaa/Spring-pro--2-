package springpro.example.proex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springpro.example.proex.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}

package com.example.ecommerce.service;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
    private final ProductRepository repository;
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    public List<Product> getAll() {
        return repository.findAll();
    }
    public Product save(Product product) {
        return repository.save(product);
    }
    public Product getById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
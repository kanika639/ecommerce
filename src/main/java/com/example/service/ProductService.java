package com.example.ecommerce.service;
import com.example.ecommerce.exception.ResourceNotFoundException;
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
    return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }
    public void delete(Long id) {
    if (!repository.existsById(id)) {
        throw new ResourceNotFoundException("Product not found with id: " + id);
    }
    repository.deleteById(id);
    }
}

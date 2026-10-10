package com.example.ecommerce.controller;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service) {
        this.service = service;
    }
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Product add(@Valid @RequestBody Product product) {
        return service.save(product);
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,
                          @Valid @RequestBody Product product) {
        product.setId(id);
        return service.save(product);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
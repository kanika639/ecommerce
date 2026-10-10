package com.example.ecommerce.service;
import com.example.ecommerce.model.Order;
import com.example.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service
import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public Order createOrder(Order order) {
        return repository.save(order);
    }
    public List<Order> getAllOrders() {
        return repository.findAll();
    }
    public Optional<Order> getOrder(Long id) {
        return repository.findById(id);
    }
    public Order updateOrder(Long id, Order order) {
        Order existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        existing.setUserId(order.getUserId());
        existing.setProductId(order.getProductId());
        existing.setQuantity(order.getQuantity());
        existing.setTotalAmount(order.getTotalAmount());
        existing.setStatus(order.getStatus());
        return repository.save(existing);
    }
    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}
package com.example.ecommerce.service;
import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public User createUser(User user) {
        return repository.save(user);
    }
    public List<User> getAllUsers() {
        return repository.findAll();
    }
    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }
    public User updateUser(Long id, User user) {
        User existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"))
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        existing.setPhone(user.getPhone());
        return repository.save(existing);
    }
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
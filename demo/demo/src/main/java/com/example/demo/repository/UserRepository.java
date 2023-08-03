package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User, Long> {
// all crud database
}

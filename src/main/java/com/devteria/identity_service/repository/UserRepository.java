package com.devteria.identity_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devteria.identity_service.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByUsername(String s);

    Optional<User> findByUsername(String s);
}

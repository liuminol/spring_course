package io.github.liuminol.spring_security_suleimanov.repository;

import io.github.liuminol.spring_security_suleimanov.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

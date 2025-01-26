package com.ecommerce.sb_ecom.repositories;

import com.ecommerce.sb_ecom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);

    boolean existsByUserName(String user1);

    boolean existsByEmail(String attr0);
}

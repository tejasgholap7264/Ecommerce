package com.ecommerce.sb_ecom.repositories;

import com.ecommerce.sb_ecom.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem,Long> {
}

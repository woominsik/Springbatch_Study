package com.ll.exam.batchpractice.app.order.repository;

import com.ll.exam.batchpractice.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}

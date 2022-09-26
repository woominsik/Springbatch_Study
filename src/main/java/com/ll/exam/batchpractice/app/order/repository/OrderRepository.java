package com.ll.exam.batchpractice.app.order.repository;

import com.ll.exam.batchpractice.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

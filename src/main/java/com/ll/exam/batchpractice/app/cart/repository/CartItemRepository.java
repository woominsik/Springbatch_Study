package com.ll.exam.batchpractice.app.cart.repository;

import com.ll.exam.batchpractice.app.cart.entity.CartItem;
import com.ll.exam.batchpractice.app.member.entity.Member;
import com.ll.exam.batchpractice.app.product.entity.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByMemberAndProductOption(Member member, ProductOption productOption);

    List<CartItem> findAllByMemberId(Long id);
}

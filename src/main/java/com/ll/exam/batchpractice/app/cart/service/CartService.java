package com.ll.exam.batchpractice.app.cart.service;

import com.ll.exam.batchpractice.app.cart.entity.CartItem;
import com.ll.exam.batchpractice.app.cart.repository.CartItemRepository;
import com.ll.exam.batchpractice.app.member.entity.Member;
import com.ll.exam.batchpractice.app.product.entity.ProductOption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartItemRepository cartItemRepository;

    public void addItem(Member member, ProductOption productOption, int quantity) {
        Optional<CartItem> found = cartItemRepository.findByMemberAndProductOption(member, productOption);

        CartItem cartItem;

        if(found.isPresent()){
            cartItem = found.get();
            int num = cartItem.getQuantity() + quantity;
            found.get().setQuantity(num);
        }
        else{
            cartItem = CartItem.builder()
                    .member(member)
                    .productOption(productOption)
                    .quantity(quantity)
                    .build();
        }
        cartItemRepository.save(cartItem);
    }
}

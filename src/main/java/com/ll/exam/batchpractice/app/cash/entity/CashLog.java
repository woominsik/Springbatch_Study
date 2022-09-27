package com.ll.exam.batchpractice.app.cash.entity;

import com.ll.exam.batchpractice.app.base.BaseEntity;
import com.ll.exam.batchpractice.app.member.entity.Member;
import com.ll.exam.batchpractice.app.product.entity.ProductOption;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class CashLog extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Member member;
    private long price; // 변동
}
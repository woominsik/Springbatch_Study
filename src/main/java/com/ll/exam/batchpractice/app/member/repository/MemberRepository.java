package com.ll.exam.batchpractice.app.member.repository;

import com.ll.exam.batchpractice.app.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

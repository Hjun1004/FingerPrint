package com.ll.fingerPrint.boundedContext.Member.repository;

import com.ll.fingerPrint.boundedContext.Member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}

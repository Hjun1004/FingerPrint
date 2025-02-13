package com.ll.fingerPrint.boundedContext.attendance.repository;

import com.ll.fingerPrint.boundedContext.attendance.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, Integer> {
}

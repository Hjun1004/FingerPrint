package com.ll.fingerPrint.boundedContext.attendance.repository;

import com.ll.fingerPrint.boundedContext.attendance.entity.EventData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDataRepository extends JpaRepository<EventData, Integer> {
}

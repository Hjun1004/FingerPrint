package com.ll.fingerPrint.boundedContext.attendance.repository;


import com.ll.fingerPrint.boundedContext.attendance.entity.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLogRepository extends JpaRepository<EventLog, Integer> {

}

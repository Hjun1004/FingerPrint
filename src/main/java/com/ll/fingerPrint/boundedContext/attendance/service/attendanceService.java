package com.ll.fingerPrint.boundedContext.attendance.service;

import com.ll.fingerPrint.boundedContext.Member.entity.Member;
import com.ll.fingerPrint.boundedContext.attendance.dto.EventLogDto;
import com.ll.fingerPrint.boundedContext.attendance.entity.EventData;
import com.ll.fingerPrint.boundedContext.attendance.entity.EventLog;
import com.ll.fingerPrint.boundedContext.attendance.entity.Reader;
import com.ll.fingerPrint.boundedContext.attendance.repository.EventDataRepository;
import com.ll.fingerPrint.boundedContext.attendance.repository.EventLogRepository;
import com.ll.fingerPrint.boundedContext.Member.repository.MemberRepository;
import com.ll.fingerPrint.boundedContext.attendance.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class attendanceService {

    private final EventLogRepository eventLogRepository;
    private final ReaderRepository readerRepository;
    private final MemberRepository memberRepository;
    private final EventDataRepository eventDataRepository;

    public List<EventLog> findAllLog() {

        List<EventLog> eventLogs = eventLogRepository.findAll();

//        EventLogDto eventLogDto1 = EventLogDto.fromEntity(eventLogs.get(0));
//
//        System.out.println(eventLogDto1.getNDateTime());

        return eventLogRepository.findAll();
    }


    public EventLogDto findFirstLog() {

        List<EventLog> eventLogs = eventLogRepository.findAll();

        EventLogDto eventLogDto1 = EventLogDto.fromEntity(eventLogs.get(0));

        System.out.println(eventLogDto1.getNDateTime());

        return eventLogDto1;
    }

    public List<Reader> findAllReaders() {

        return readerRepository.findAll();
    }

    public List<Member> findAllMembers() {

        return memberRepository.findAll();
    }

    public List<EventData> findAllEventData() {

        return eventDataRepository.findAll();
    }
}

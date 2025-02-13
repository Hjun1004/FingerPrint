package com.ll.fingerPrint.boundedContext.attendance.controller;

import com.ll.fingerPrint.boundedContext.Member.dto.MemberDto;
import com.ll.fingerPrint.boundedContext.Member.entity.Member;
import com.ll.fingerPrint.boundedContext.attendance.dto.EventDataDto;
import com.ll.fingerPrint.boundedContext.attendance.dto.EventLogDto;
import com.ll.fingerPrint.boundedContext.attendance.dto.ReaderDto;
import com.ll.fingerPrint.boundedContext.attendance.entity.EventData;
import com.ll.fingerPrint.boundedContext.attendance.entity.EventLog;
import com.ll.fingerPrint.boundedContext.attendance.entity.Reader;
import com.ll.fingerPrint.boundedContext.attendance.repository.EventLogRepository;
import com.ll.fingerPrint.boundedContext.attendance.service.attendanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Console;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class attendanceController {

    private final attendanceService attendanceService;
    private final EventLogRepository repository;

    @GetMapping("/attendance")
    @ResponseBody
    public String showAttendance(){

        List<EventLog> eventLog = attendanceService.findAllLog();

//        EventLogDto eventLogDto = attendanceService.findFirstLog();

        EventLogDto eventLogDto1 = EventLogDto.fromEntity(eventLog.get(0));

//        System.out.println(eventLogDto1.getNDateTime());

        return "Hello";

    }

    @GetMapping("/readerTest")
    @ResponseBody
    public String showReader(){
        List<Reader> readers = attendanceService.findAllReaders();

        ReaderDto readerDto = ReaderDto.fromEntity(readers.get(0));

        System.out.println(readerDto.getSName());


        return "readerTest";
    }

    @GetMapping("/memberTest")
    @ResponseBody
    public String showMember(){
        List<Member> members = attendanceService.findAllMembers();

        MemberDto memberDto = MemberDto.fromEntity(members.get(0));

        System.out.println(memberDto.getSUserName());

        return memberDto.getSUserName();
    }

    @GetMapping("/eventDataTest")
    @ResponseBody
    public String showEventData(){
        List<EventData> eventData = attendanceService.findAllEventData();

        EventDataDto eventDataDto = EventDataDto.fromEntity(eventData.get(6));

        return eventDataDto.getSName();
    }
}

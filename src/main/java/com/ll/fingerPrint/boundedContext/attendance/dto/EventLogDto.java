package com.ll.fingerPrint.boundedContext.attendance.dto;


import com.ll.fingerPrint.boundedContext.attendance.entity.EventLog;

public class EventLogDto {
    private final int nEventlogIdn;
    private final int nDateTime;
    private final int nReaderIdn;
    private final int nEventIdn;
    private final int nUserID;
    private final int nIsLog;
    private final int nTNAEvent;
    private final int nIsUseTA;
    private final int nType;

    // 생성자 (모든 필드 초기화)
    public EventLogDto(int nEventlogIdn, int nDateTime, int nReaderIdn, int nEventIdn, int nUserID,
                       int nIsLog, int nTNAEvent, int nIsUseTA, int nType) {
        this.nEventlogIdn = nEventlogIdn;
        this.nDateTime = nDateTime;
        this.nReaderIdn = nReaderIdn;
        this.nEventIdn = nEventIdn;
        this.nUserID = nUserID;
        this.nIsLog = nIsLog;
        this.nTNAEvent = nTNAEvent;
        this.nIsUseTA = nIsUseTA;
        this.nType = nType;
    }

    // Getter 메서드만 제공 (불변성 유지)
    public int getNEventlogIdn() { return nEventlogIdn; }
    public int getNDateTime() { return nDateTime; }
    public int getNReaderIdn() { return nReaderIdn; }
    public int getNEventIdn() { return nEventIdn; }
    public int getNUserID() { return nUserID; }
    public int getNIsLog() { return nIsLog; }
    public int getNTNAEvent() { return nTNAEvent; }
    public int getNIsUseTA() { return nIsUseTA; }
    public int getNType() { return nType; }

    // 엔티티 → DTO 변환 메서드
    public static EventLogDto fromEntity(EventLog eventLog) {
        return new EventLogDto(
                eventLog.getNEventLogIdn(),
                eventLog.getNDateTime(),
                eventLog.getReader().getNReaderIdn(),
                eventLog.getEventData().getNEventIdn(),
                Integer.parseInt(eventLog.getMember().getSUserID()), // User 테이블에서는 UserID가 문자형 자료형 이므로 로그에서 int로 쓰기 위해 변환해줌
//                eventLog.getNReaderIdn(),
//                eventLog.getNEventIdn(),
//                eventLog.getNUserID(),
                eventLog.getNIsLog(),
                eventLog.getNTNAEvent(),
                eventLog.getNIsUseTA(),
                eventLog.getNType()
        );
    }
}

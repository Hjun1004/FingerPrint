package com.ll.fingerPrint.boundedContext.attendance.entity;

import com.ll.fingerPrint.boundedContext.Member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "TB_EVENT_LOG_BK", schema = "dbo")
@Getter
public class EventLogBk {
    @Id
    @Column(name = "nEventLogIdn")
    private int nEventLogIdn; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "nDateTime")
    private int nDateTime; // 필드명과 칼럼명을 동일하게 유지


    /*
    @Column(name = "nReaderIdn")
    private int nReaderIdn; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "nEventIdn")
    private int nEventIdn; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "nUserID")
    private int nUserID; // 필드명과 칼럼명을 동일하게 유지
    */

    @ManyToOne(fetch = FetchType.LAZY)  // Reader와 다대일 관계
    @JoinColumn(name = "nReaderIdn", referencedColumnName = "nReaderIdn", insertable = false, updatable = false)
    private Reader reader;

    @ManyToOne(fetch = FetchType.LAZY)  // Event와 다대일 관계
    @JoinColumn(name = "nEventIdn", referencedColumnName = "nEventIdn", insertable = false, updatable = false)
    private EventData eventData;

    @ManyToOne(fetch = FetchType.LAZY)  // User와 다대일 관계
    @JoinColumn(name = "nUserID", referencedColumnName = "sUserID", insertable = false, updatable = false)
    private Member member;


    @Column(name = "nIsLog")
    private int nIsLog;

    @Column(name = "nTNAEvent")
    private int nTNAEvent;

    @Column(name = "nIsUseTA")
    private int nIsUseTA;

    @Column(name = "nType")
    private int nType;

}

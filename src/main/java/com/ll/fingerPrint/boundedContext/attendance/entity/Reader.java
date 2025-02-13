package com.ll.fingerPrint.boundedContext.attendance.entity;

import groovy.lang.Lazy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_READER", schema = "dbo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reader {
    // 단말기 테이블
    // 필드(변수)명과 칼럼명을 동일하게 유지

    @Id
    @Column(name = "nReaderIdn")
    private int nReaderIdn; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "sName")
    private String sName; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "nType")
    private int nType; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "nDeptIdn")
    private int nDeptIdn; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "sIP")
    private String sIP; // 필드명과 칼럼명을 동일하게 유지

    @Column(name = "sMacAddress")
    private String sMacAddress;

    @Column(name = "nConnType")
    private int nConnType;

    @Column(name = "sDescription")
    private String sDescription;

    @Column(name = "nTimezone")
    private int nTimezone;

    @OneToMany(mappedBy = "reader")
    private List<EventLog> eventLogs = new ArrayList<>(); // eventLog용 매핑


    @OneToMany(mappedBy = "reader")
    private List<EventLogBk> eventLogBks = new ArrayList<>(); // eventLogBK용 매핑

}

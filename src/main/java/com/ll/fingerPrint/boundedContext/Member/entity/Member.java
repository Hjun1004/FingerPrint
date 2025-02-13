package com.ll.fingerPrint.boundedContext.Member.entity;

import com.ll.fingerPrint.boundedContext.attendance.entity.EventLog;
import com.ll.fingerPrint.boundedContext.attendance.entity.EventLogBk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "TB_USER", schema = "dbo")
@Getter
public class Member {

    @Id
    @Column(name = "nUserIdn")
    private int nUserIdn;

    @Column(name = "sUserName")
    private String sUserName;

    @Column(name = "nDepartmentIdn")
    private int nDepartmentIdn;

    @Column(name = "sTelNumber")
    private String sTelNumber;

    @Column(name = "sEmail")
    private String sEmail;

    @Column(name = "sUserID")
    private String sUserID;

    @Column(name = "sPassword")
    private String sPassword;

    @Column(name = "nStartDate")
    private int nStartDate;

    @Column(name = "nEndDate")
    private int nEndDate;

    @Column(name = "nAdminLevel")
    private int nAdminLevel;

    @Column(name = "nAuthMode")
    private int nAuthMode;

    @OneToMany(mappedBy = "member")
    private List<EventLog> eventLogs = new ArrayList<>(); // eventLog용 매핑


    @OneToMany(mappedBy = "member")
    private List<EventLogBk> eventLogBks = new ArrayList<>(); // eventLogBK용 매핑

}

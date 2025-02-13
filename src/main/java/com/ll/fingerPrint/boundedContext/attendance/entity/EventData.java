package com.ll.fingerPrint.boundedContext.attendance.entity;

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
@Getter
@Table(name = "TB_EVENT_DATA", schema = "dbo")
public class EventData {

    @Id
    @Column(name = "nEventIdn")
    private int nEventIdn;

    @Column(name = "sName")
    private String sName;

    @OneToMany(mappedBy = "eventData")
    private List<EventLog> eventLogs = new ArrayList<>();  // eventLog용 매핑

    @OneToMany(mappedBy = "eventData")
    private List<EventLogBk> eventLogBks = new ArrayList<>(); // eventLogBK용 매핑
}

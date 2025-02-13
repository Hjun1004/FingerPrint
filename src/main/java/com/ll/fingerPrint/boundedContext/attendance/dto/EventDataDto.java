package com.ll.fingerPrint.boundedContext.attendance.dto;

import com.ll.fingerPrint.boundedContext.attendance.entity.EventData;
import com.ll.fingerPrint.boundedContext.attendance.entity.Reader;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EventDataDto {

    private int nEventIdn;
    private String sName;

    @Builder
    public EventDataDto(int nEventIdn, String sName){
        this.nEventIdn = nEventIdn;
        this.sName = sName;
    }

    // 엔티티 -> DTO 변환
    public static EventDataDto fromEntity(EventData eventData){
        return EventDataDto.builder()
                .nEventIdn(eventData.getNEventIdn())
                .sName(eventData.getSName())
                .build();
    }

    // DTO -> 엔티티 변환
    public EventData toEntity(){
        return EventData.builder()
                .nEventIdn(nEventIdn)
                .sName(sName)
                .build();
    }


}

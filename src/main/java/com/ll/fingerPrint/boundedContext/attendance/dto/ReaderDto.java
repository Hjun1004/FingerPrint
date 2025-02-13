package com.ll.fingerPrint.boundedContext.attendance.dto;


import com.ll.fingerPrint.boundedContext.attendance.entity.Reader;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReaderDto {

    private int nReaderIdn;
    private String sName;
    private int nType;
    private int nDeptIdn;
    private String sIP;
    private String sMacAddress;
    private int nConnType;
    private String sDescription;
    private int nTimezone;

    @Builder
    public ReaderDto(int nReaderIdn, String sName, int nType, int nDeptIdn, String sIP,
                     String sMacAddress, int nConnType, String sDescription, int nTimezone) {
        this.nReaderIdn = nReaderIdn;
        this.sName = sName;
        this.nType = nType;
        this.nDeptIdn = nDeptIdn;
        this.sIP = sIP;
        this.sMacAddress = sMacAddress;
        this.nConnType = nConnType;
        this.sDescription = sDescription;
        this.nTimezone = nTimezone;
    }

    // 엔티티 -> DTO 변환
    public static ReaderDto fromEntity(Reader reader) {
        return ReaderDto.builder()
                .nReaderIdn(reader.getNReaderIdn())
                .sName(reader.getSName())
                .nType(reader.getNType())
                .nDeptIdn(reader.getNDeptIdn())
                .sIP(reader.getSIP())
                .sMacAddress(reader.getSMacAddress())
                .nConnType(reader.getNConnType())
                .sDescription(reader.getSDescription())
                .nTimezone(reader.getNTimezone())
                .build();
    }

    // DTO -> 엔티티 변환
    public Reader toEntity() {
        return Reader.builder()
                .nReaderIdn(nReaderIdn)
                .sName(sName)
                .nType(nType)
                .nDeptIdn(nDeptIdn)
                .sIP(sIP)
                .sMacAddress(sMacAddress)
                .nConnType(nConnType)
                .sDescription(sDescription)
                .nTimezone(nTimezone)
                .build();
    }
}
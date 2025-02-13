package com.ll.fingerPrint.boundedContext.Member.dto;


import com.ll.fingerPrint.boundedContext.Member.entity.Member;
import com.ll.fingerPrint.boundedContext.attendance.entity.Reader;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberDto {

    private int nUserIdn;
    private String sUserName;
    private int nDepartmentIdn;
    private String sTelNumber;
    private String sEmail;
    private String sUserID;
    private String sPassword;
    private int nStartDate;
    private int nEndDate;
    private int nAdminLevel;
    private int nAuthMode;

    @Builder
    public MemberDto(int nUserIdn, String sUserName, int nDepartmentIdn, String sTelNumber, String sEmail, String sUserID, String sPassword, int nStartDate, int nEndDate, int nAdminLevel, int nAuthMode){
        this.nUserIdn = nUserIdn;
        this.sUserName = sUserName;
        this.nDepartmentIdn = nDepartmentIdn;
        this.sTelNumber = sTelNumber;
        this.sEmail = sEmail;
        this.sUserID = sUserID;
        this.sPassword = sPassword;
        this.nStartDate = nStartDate;
        this.nEndDate = nEndDate;
        this.nAdminLevel = nAdminLevel;
        this.nAuthMode = nAuthMode;
    }

    // 엔티티 -> DTO 변환
    public static MemberDto fromEntity(Member member){
        return MemberDto.builder()
                .nUserIdn(member.getNUserIdn())
                .sUserName(member.getSUserName())
                .nDepartmentIdn(member.getNDepartmentIdn())
                .sTelNumber(member.getSTelNumber())
                .sEmail(member.getSEmail())
                .sUserID(member.getSUserID())
                .sPassword(member.getSPassword())
                .nStartDate(member.getNStartDate())
                .nEndDate(member.getNEndDate())
                .nAdminLevel(member.getNAdminLevel())
                .nAuthMode(member.getNAuthMode())
                .build();
    }

    // DTO -> 엔티티 변환
    public Member toEntity(){
        return Member.builder()
                .nUserIdn(nUserIdn)
                .sUserName(sUserName)
                .nDepartmentIdn(nDepartmentIdn)
                .sTelNumber(sTelNumber)
                .sEmail(sEmail)
                .sUserID(sUserID)
                .sPassword(sPassword)
                .nStartDate(nStartDate)
                .nEndDate(nEndDate)
                .nAdminLevel(nAdminLevel)
                .nAuthMode(nAuthMode)
                .build();
    }

}

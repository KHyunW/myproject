package com.example.myproject.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.example.myproject.common.AccountRole;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDTO {
    private Long accountId;
    private String username; // 계정 아이디
    private String password;
    private String name;
    private String email;
    private String nickname;
    private LocalDateTime regDate;
    private AccountRole role;
    

}

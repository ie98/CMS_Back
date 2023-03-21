package com.exmaple.Demo.dto;

import lombok.Data;

@Data
public class AdminLoginResult {
    private String Token;
    private Meta meta;
    private ErrorType errorType;
    private int userId;
    private int authority;
    private String username;
    private String shopename;

}

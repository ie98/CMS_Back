package com.exmaple.Demo.dto;

public class AdminLoginResult {
    private String Token;
    private Meta meta;
    private int userId;
    private int authority;
    private String username;
    private String shopename;

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShopename() {
        return shopename;
    }

    public void setShopename(String shopename) {
        this.shopename = shopename;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}

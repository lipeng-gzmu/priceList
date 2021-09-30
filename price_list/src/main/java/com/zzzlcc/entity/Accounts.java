package com.zzzlcc.entity;

public class Accounts {
    //电话
    private String phone;
    //密码
    private String password;

    public Accounts() {
    }

    public Accounts(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

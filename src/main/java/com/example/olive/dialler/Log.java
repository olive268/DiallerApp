package com.example.olive.dialler;

public class Log {
    String phone,time;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Log(String phone, String time) {

        this.phone = phone;
        this.time = time;
    }
}

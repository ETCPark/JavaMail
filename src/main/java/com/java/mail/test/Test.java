package com.java.mail.test;

import com.java.mail.util.SendMailUtils;

public class Test {
    public static void main(String[] args) {
        SendMailUtils.sendQQMail("258702177@qq.com", "authCode", "xxx@outlook.com", "testTemp", "web3j", null);
        SendMailUtils.send126Mail("xxx@126.com","xxxx","xxx@gmail.com","web3j","wexxxx",null);
    }
}

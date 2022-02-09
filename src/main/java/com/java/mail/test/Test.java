package com.java.mail.test;

import com.java.mail.util.SendMailAcceUtils;

public class Test {
    public static void main(String[] args) {
        SendMailAcceUtils.sendQQMailWithOutFile("258702177@qq.com", "authCode", "xxx@outlook.com", "testTemp", "web3j", null);
        SendMailAcceUtils.send126Mail("xxx@126.com","xxxx","xxx@gmail.com","web3j","wexxxx",null);
    }
}

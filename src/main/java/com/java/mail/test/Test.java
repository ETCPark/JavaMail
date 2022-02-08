package com.java.mail.test;

import com.java.mail.util.SendMailAcceUtils;

public class Test {
    public static void main(String[] args) {
        SendMailAcceUtils.sendQQMailWithOutFile("xxx@outlook.com","testTemp","web3j");
        SendMailAcceUtils.send126Mail("xxx@126.com","xxxx","xxx@gmail.com","web3j","wexxxx",null);
    }
}
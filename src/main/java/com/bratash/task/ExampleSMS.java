package com.bratash.task;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC02679302ae002346f9ddfd5542a405e5";
    public static final String AUTH_TOKEN = "bcdffad81039d51b2fb221911b35f3e9";

    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber("+380500743046"), /*my phone number*/
                        new PhoneNumber("+12052674929"), str) .create(); /*attached to me number*/
    }


    public static void main(String[] args) {
        ExampleSMS.send("hello");
    }
}
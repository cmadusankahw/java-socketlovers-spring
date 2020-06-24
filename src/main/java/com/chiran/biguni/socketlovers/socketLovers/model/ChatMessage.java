package com.chiran.biguni.socketlovers.socketLovers.model;


import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        CONNECT,
        QUIT
    }


    public static String decrypt(String msg){
        String key = "1234dfrghtjkGHJR";
        msg = msg.replace(key,"");
        msg = new StringBuilder(new String(msg)).reverse().toString();
        System.out.println("Decrypted :" + msg);
        return msg;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() throws Exception {
        if (this.content != null ) {
        this.content = decrypt(content); }
        return this.content;
    }

    public void setContent(String content) throws Exception {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

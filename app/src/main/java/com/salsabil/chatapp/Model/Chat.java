package com.salsabil.chatapp.Model;

public class Chat {
    private String sender;
    private String receiver;
    private String messege;
    private boolean isseen;

    public Chat(String sender, String receiver, String messege, boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.messege = messege;
        this.isseen = isseen;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}

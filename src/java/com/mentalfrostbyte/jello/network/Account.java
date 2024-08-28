package com.mentalfrostbyte.jello.network;

public class Account {
    public String username;
    public String authToken;
    public String agoraToken;

    public Account(String var1, String var2, String var3) {
        this.username = var1;
        this.authToken = var2;
        this.agoraToken = var3;
    }

    public Account(byte[] var1) {
        this.username = "SigmaUser";
        this.authToken = "1";
        this.agoraToken = "2";
    }
}

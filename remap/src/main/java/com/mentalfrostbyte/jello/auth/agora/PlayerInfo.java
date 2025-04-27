// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.agora;

public class PlayerInfo
{
    public String username;
    public String uuidString;
    public String accountId;
    public String tag;

    public PlayerInfo(final String username, final String uuidString, final String accountId) {
        this.tag = "Default.";
        this.username = username;
        this.uuidString = uuidString;
        this.accountId = accountId;
    }
}

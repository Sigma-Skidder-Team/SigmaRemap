// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.managers;

import mapped.MessageHistory;

import java.util.HashMap;

public class MessageManager {
    private final HashMap<String, MessageHistory> messageHistories = new HashMap<>();

    public void addMessage(final String senderId, final String message, final long timestamp) {
        this.messageHistories
                .computeIfAbsent(senderId, id -> new MessageHistory())
                .addMessage(timestamp, message);
        System.out.println(this.messageHistories.get(senderId).messages);
    }
}

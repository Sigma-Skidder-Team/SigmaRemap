package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SChatPacket;

public class ChatCleaner extends Module {
    public ChatCleaner() {
        super(ModuleCategory.MISC, "ChatCleaner", "Cleans chat in an attempt to avoid spam on anarchy servers");
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled() && event.getPacket() instanceof SChatPacket) {
            SChatPacket chatPacket = (SChatPacket) event.getPacket();
            String chatMessage = cleanChatMessage(chatPacket.getChatComponent().getString());
            if (shouldCancelMessage(chatMessage)) {
                event.setCancelled(true);
            }
        }
    }

    private String cleanChatMessage(String message) {
        if (!message.startsWith("<")) {
            message = message.replaceAll("^(.*?): ", "");
        } else {
            message = message.replaceAll("^(.*?)> ", "");
        }
        return message.toLowerCase();
    }

    private boolean shouldCancelMessage(String message) {
        if (message.startsWith("> ") || containsBlockedContent(message)) {
            return true;
        }

        if (message.contains(": [") || message.contains("] [") ||
                message.startsWith("!") ||
                message.startsWith("TPS: ") && message.endsWith(".") ||
                endsWithPunctuation(message)) {
            return true;
        }

        return false;
    }

    private boolean containsBlockedContent(String message) {
        String[] blockedKeywords = {
                "http://", "https://", "discord.gg", "www.",
                "ʳᵘˢʰᵉʳʰᵃᶜᵏ", "♿", "/ignore", "#TeamRusher",
                "Default Message", "wwe", "future", "iknowimez",
                "lol get gud"
        };

        for (String keyword : blockedKeywords) {
            if (message.contains(keyword)) {
                return true;
            }
        }

        return false;
    }

    private boolean endsWithPunctuation(String message) {
        String[] greetings = {
                "Hey, ", "Hello, ", "Farewell, ", "Howdy, ",
                "Good evening, ", "Good bye, ", "Bye, ",
                "Later, ", "See you next time, ",
                "See you later, ", "Welcome to 2b2t.org, ",
                "Greetings, ", "Catch ya later, ",
                "Good to see you, ", "Hope you had a good time, ",
                "Aww, it's you ", "Well, It was nice to have you here, "
        };

        for (String greeting : greetings) {
            if (message.startsWith(greeting) && message.endsWith(".")) {
                return true;
            }
        }

        return message.startsWith("Bye, Bye ") ||
                (message.startsWith("I just ") && message.endsWith("!"));
    }
}

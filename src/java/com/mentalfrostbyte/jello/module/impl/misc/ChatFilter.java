package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.client.CChatMessagePacket;

public class ChatFilter extends Module {
    public ChatFilter() {
        super(ModuleCategory.MISC, "ChatFilter", "Bypasses chat filters");
    }

    @EventTarget
    private void onSendPacket(SendPacketEvent event) {
        if (this.isEnabled() && event.getPacket() instanceof CChatMessagePacket) {
            CChatMessagePacket chatPacket = (CChatMessagePacket) event.getPacket();
            String[] words = chatPacket.message.split(" ");

            if (isMessageLengthValid(chatPacket.message, words.length)) {
                StringBuilder filteredMessage = new StringBuilder();
                boolean shouldReplaceMessage = false;

                for (String word : words) {
                    if (!word.startsWith("/")) {
                        if (filteredMessage.length() > 0) {
                            filteredMessage.append(" ");
                        }
                        filteredMessage.append(replaceFirstCharacter(word));
                    } else {
                        filteredMessage.append(word);
                        shouldReplaceMessage = !word.equals("/r") && !word.equals("/msg");
                    }
                }

                if (!shouldReplaceMessage) {
                    chatPacket.message = filteredMessage.toString();
                }
            }
        }
    }

    private boolean isMessageLengthValid(String message, int wordCount) {
        return message.length() + wordCount <= 100;
    }

    private String replaceFirstCharacter(String word) {
        String firstChar = word.substring(0, 1);
        String remainingChars = word.substring(1);
        return firstChar + "\uf8ff" + remainingChars;
    }
}

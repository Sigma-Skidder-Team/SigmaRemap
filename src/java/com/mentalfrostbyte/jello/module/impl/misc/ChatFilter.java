package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.client.CChatMessagePacket;

public class ChatFilter extends Module {
    public ChatFilter() {
        super(ModuleCategory.MISC, "ChatFilter", "Bypasse chat filters");
    }

    @EventTarget
    private void method16679(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof CChatMessagePacket) {
                CChatMessagePacket var4 = (CChatMessagePacket) var1.getPacket();
                String[] var5 = var4.message.split(" ");
                if (var4.message.length() + var5.length <= 100) {
                    StringBuilder var6 = new StringBuilder();
                    boolean var7 = false;

                    for (int var8 = 0; var8 < var5.length; var8++) {
                        if (!var5[var8].startsWith("/")) {
                            if (var5.length != 0) {
                                var6.append(" ");
                            }

                            String var9 = var5[var8].substring(0, 1);
                            String var10 = var5[var8].substring(1);
                            var6.append(var9 + "\uf8ff" + var10);
                        } else {
                            var6.append(var5[var8]);
                            var7 = !var5[var8].equals("/r") && !var5[var8].equals("/msg");
                        }
                    }

                    if (!var7) {
                        var4.message = var6.toString();
                    }
                }
            }
        }
    }
}

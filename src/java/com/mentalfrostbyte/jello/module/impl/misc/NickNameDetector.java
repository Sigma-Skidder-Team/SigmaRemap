package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.ColorUtils;
import net.minecraft.entity.Entity;

public class NickNameDetector extends Module {
    public NickNameDetector() {
        super(ModuleCategory.MISC, "NickNameDetector", "Detect if a player has a custom name");
    }

    @EventTarget
    private void method16125(TickEvent var1) {
        if (this.isEnabled()) {
            for (Entity var5 : ColorUtils.method17680()) {
                if (!Client.getInstance().getCombatManager().method29346(var5) && var5.ticksExisted > 30 && var5.method3381()) {
                    ColorUtils.addChatMessage(var5.getName().getUnformattedComponentText() + " might have a custom nametag");
                }
            }
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.combat.wtap;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.InputMappings;
import net.minecraft.client.Minecraft;

public class LegitWTap extends Module {
    public LegitWTap() {
        super(ModuleCategory.COMBAT, "Legit", "Increase the knockback you give to players");
    }

    @EventTarget
    private void method16218(TickEvent var1) {
        if (this.isEnabled()) {
            mc.gameSettings.keyBindSprint.pressed = true;
            if (mc.player.swingProgressInt != 1) {
                if (mc.player.swingProgressInt == 0) {
                    mc.gameSettings.keyBindForward.pressed = InputMappings.isKeyDown(
                            Minecraft.getInstance().mainWindow.getHandle(), mc.gameSettings.keyBindForward.keycode.keyCode
                    );
                }
            } else {
                mc.gameSettings.keyBindForward.pressed = false;
            }
        }
    }
}

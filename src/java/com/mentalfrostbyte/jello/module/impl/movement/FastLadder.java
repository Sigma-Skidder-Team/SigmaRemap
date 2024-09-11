package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import mapped.ViaVerList;
import mapped.ModeSetting;
import mapped.NumberSetting;

public class FastLadder extends Module {
    public FastLadder() {
        super(ModuleCategory.MOVEMENT, "FastLadder", "Allows you to climp ladders faster");
        this.registerSetting(new NumberSetting<Float>("Motion", "Climbing motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
        this.registerSetting(new ModeSetting("Down mode", "The way you will go down on ladders", 0, "None", "OnSneak", "Always"));
    }

    @EventTarget
    private void method16217(EventMove var1) {
        if (this.isEnabled() && mc.player.isOnLadder()) {
            boolean var4 = JelloPortal.getFakeInvStatus() >= ViaVerList._1_9.getVersionNumber() || mc.getCurrentServerData() == null;
            if (!mc.player.collidedHorizontally && (!mc.player.isJumping || !var4)) {
                if (this.getStringSettingValueByName("Down mode").equals("OnSneak") && mc.gameSettings.keyBindSneak.isKeyDown()
                        || this.getStringSettingValueByName("Down mode").equals("Always")) {
                    var1.setY(-this.getNumberValueBySettingName("Motion"));
                }
            } else {
                var1.setY(this.getNumberValueBySettingName("Motion"));
            }
        }
    }
}

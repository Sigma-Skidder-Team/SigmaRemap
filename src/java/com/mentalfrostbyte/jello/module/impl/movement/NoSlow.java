package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventSlowDown;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.item.SwordItem;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.ModeSetting;

public class NoSlow extends Module {
    private boolean field23540;

    public NoSlow() {
        super(ModuleCategory.MOVEMENT, "NoSlow", "Stops slowdown when using an item");
        this.registerSetting(new ModeSetting("Mode", "NoSlow mode", 0, "Vanilla", "NCP"));
    }

    @EventTarget
    private void method16233(EventSlowDown var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    private void method16234(EventUpdate var1) {
        if (this.isEnabled()) {
            boolean var4 = Client.getInstance().getModuleManager().getModuleByClass(KillAura.class).method15988();
            boolean var5 = mc.player.getHeldItemMainhand() != null && mc.player.getHeldItemMainhand().getItem() instanceof SwordItem;
            if (!var1.isPre()) {
                if (var5 && mc.gameSettings.keyBindUseItem.isKeyDown() && !this.field23540 && !var4 && this.getStringSettingValueByName("Mode").equals("NCP")) {
                    MultiUtilities.block();
                    this.field23540 = true;
                } else if (!var5 && this.field23540) {
                    this.field23540 = false;
                }
            } else if (!this.getStringSettingValueByName("Mode").equals("NCP")) {
                if (this.field23540 && !mc.gameSettings.keyBindUseItem.isKeyDown()) {
                    this.field23540 = false;
                }
            } else if (this.field23540 && mc.gameSettings.keyBindUseItem.isKeyDown() && !var4) {
                if (var5) {
                    MultiUtilities.unblock();
                }

                this.field23540 = false;
            }
        }
    }
}

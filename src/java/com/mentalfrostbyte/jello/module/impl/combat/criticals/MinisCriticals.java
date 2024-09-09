package com.mentalfrostbyte.jello.module.impl.combat.criticals;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventStep;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import mapped.BooleanSetting;
import mapped.ModeSetting;
import net.minecraft.network.play.client.CPlayerPacket;

public class MinisCriticals extends Module {
    public MinisCriticals() {
        super(ModuleCategory.COMBAT, "Minis", "Minis criticals");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel", "Cubecraft"));
        this.registerSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages", false));
    }

    @EventTarget
    private void method16126(JumpEvent var1) {
        if (this.isEnabled()) {
            if (KillAura.field23937) {
                mc.getConnection()
                        .sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ(), true));
            }
        }
    }

    @EventTarget
    private void method16127(EventStep var1) {
        if (this.isEnabled()) {
            if (KillAura.field23937) {
                var1.setCancelled(true);
            }
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.client.CEntityActionPacket;

public class Sneak extends Module {
    public Sneak() {
        super(ModuleCategory.PLAYER, "Sneak", "Always sneaks");
    }

    @Override
    public void onDisable() {
        mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.RELEASE_SHIFT_KEY));
    }

    @EventTarget
    public void EventUpdate(EventUpdate eventUpdate) {
        if (this.isEnabled()) {
            if (!eventUpdate.isPre()) {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.RELEASE_SHIFT_KEY));
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.PRESS_SHIFT_KEY));
            } else {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.PRESS_SHIFT_KEY));
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.RELEASE_SHIFT_KEY));
            }
        }
    }
}

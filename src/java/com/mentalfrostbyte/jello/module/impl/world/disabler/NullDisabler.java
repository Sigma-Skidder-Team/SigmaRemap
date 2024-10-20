package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import net.minecraft.network.play.server.SConfirmTransactionPacket;
import net.minecraft.network.play.server.SKeepAlivePacket;

public class NullDisabler extends Module {
    public NullDisabler() {
        super(ModuleCategory.EXPLOIT, "Null", "Makes you invisible for the anticheat.");
        this.registerSetting(new BooleanSetting("Inv Bypass", "Avoid inventory glitchs on some servers", false));
    }

    @EventTarget
    public void RecievePacketEvent(ReceivePacketEvent event) {
        if (this.isEnabled() && mc.getCurrentServerData() != null) {
            if (!(event.getPacket() instanceof SKeepAlivePacket)) {
                if (event.getPacket() instanceof SConfirmTransactionPacket) {
                    SConfirmTransactionPacket confirmTransactionPacket = (SConfirmTransactionPacket) event.getPacket();
                    if (confirmTransactionPacket.getActionNumber() < 0 || !this.getBooleanValueFromSettingName("Inv Bypass")) {
                        event.setCancelled(true);
                    }
                }
            } else {
                event.setCancelled(true);
            }
        }
    }
}

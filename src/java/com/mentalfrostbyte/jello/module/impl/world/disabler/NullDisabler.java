package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import mapped.Class5542;
import mapped.Class5554;

public class NullDisabler extends Module {
    public NullDisabler() {
        super(ModuleCategory.EXPLOIT, "Null", "Makes you invisible for the anticheat.");
        this.registerSetting(new BooleanSetting("Inv Bypass", "Avoid inventory glitchs on some servers", false));
    }

    @EventTarget
    public void method16255(RecievePacketEvent var1) {
        if (this.isEnabled() && mc.getCurrentServerData() != null) {
            if (!(var1.getPacket() instanceof Class5554)) {
                if (var1.getPacket() instanceof Class5542) {
                    Class5542 var4 = (Class5542) var1.getPacket();
                    if (var4.method17422() < 0 || !this.getBooleanValueFromSetttingName("Inv Bypass")) {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13900(true);
            }
        }
    }
}
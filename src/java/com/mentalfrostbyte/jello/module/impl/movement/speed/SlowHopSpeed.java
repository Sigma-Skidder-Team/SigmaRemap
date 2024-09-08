package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import mapped.ColorUtils;
import mapped.Class9567;

public class SlowHopSpeed extends Module {
    private int field23599;
    private double field23600;
    private boolean field23601;

    public SlowHopSpeed() {
        super(ModuleCategory.MOVEMENT, "SlowHop", "SlowHop speed");
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
    }

    @Override
    public void onEnable() {
        this.field23600 = Class9567.method37075();
        this.field23599 = 2;
    }

    @Override
    public void onDisable() {
        Class9567.method37090(Class9567.method37075());
    }

    @EventTarget
    public void method16338(Class4435 var1) {
        if (this.isEnabled()) {
            boolean var4 = this.getBooleanValueFromSetttingName("AutoJump");
            double var5 = Class9567.method37075();
            boolean var7 = ColorUtils.method17686();
            if (!mc.player.onGround) {
                this.field23599++;
                this.field23600 = 0.36 - (double) this.field23599 / 250.0;
                if (this.field23600 < var5) {
                    this.field23600 = var5;
                }

                Class9567.method37088(var1, this.field23600);
            } else {
                this.field23599 = 0;
                mc.player.method2914();
                var1.method13995(mc.player.getVec().y);
            }
        }
    }

    @EventTarget
    public void method16339(Class4436 var1) {
        if (this.isEnabled()) {
            var1.method14002(0.407 + 0.1 * (double) Class9567.method37079());
            this.field23599 = 0;
            var1.method14003(1.8);
        }
    }
}

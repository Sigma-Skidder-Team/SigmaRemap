package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;

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
        this.field23600 = MovementUtil.getSpeed();
        this.field23599 = 2;
    }

    @Override
    public void onDisable() {
        MovementUtil.strafe(MovementUtil.getSpeed());
    }

    @EventTarget
    public void method16338(EventMove var1) {
        if (this.isEnabled()) {
            boolean var4 = this.getBooleanValueFromSettingName("AutoJump");
            double var5 = MovementUtil.getSpeed();
            boolean var7 = MultiUtilities.method17686();
            if (!mc.player.onGround) {
                this.field23599++;
                this.field23600 = 0.36 - (double) this.field23599 / 250.0;
                if (this.field23600 < var5) {
                    this.field23600 = var5;
                }

                MovementUtil.setSpeed(var1, this.field23600);
            } else {
                this.field23599 = 0;
                mc.player.jump();
                var1.setY(mc.player.getMotion().y);
            }
        }
    }

    @EventTarget
    public void method16339(JumpEvent var1) {
        if (this.isEnabled()) {
            var1.method14002(0.407 + 0.1 * (double) MovementUtil.getJumpBoost());
            this.field23599 = 0;
            var1.method14003(1.8);
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4403;
import com.mentalfrostbyte.jello.event.impl.Class4423;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyAACMode;
import mapped.*;

public class AutoSprint extends Module {
    private final double[] field23605 = new double[]{0.0, 0.0};
    private boolean field23606;

    public AutoSprint() {
        super(ModuleCategory.PLAYER, "AutoSprint", "Sprints for you");
        this.registerSetting(new BooleanSetting("Keep Sprint", "Keep Sprinting after hitting a player", true));
    }

    @EventTarget
    public void method16343(TickEvent var1) {
        if (this.isEnabled()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class);
            Module var5 = var4.module;
            if (var5 == null || !var5.isEnabled() || !(var5 instanceof BlockFlyAACMode) || var5.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
                mc.player.setSprinting(mc.player.field4984 > 0.0F && !((BlockFly) Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class)).method16732());
            }
        }
    }

    @EventTarget
    public void method16344(Class4423 var1) {
        if (this.isEnabled()
                && !(mc.player.field4984 <= 0.0F)
                && (!mc.player.isHandActive() || mc.player.method3158().getItem() != Items.BOW)
                && !((BlockFly) Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class)).method16732()) {
            Class9805 var4 = mc.player.method3085(Attributes.MOVEMENT_SPEED);
            float var5 = (float) (
                    (var4.method38660() + 0.03F + (double) (0.015F * (float) Class9567.method37078())) / (double) mc.player.abilities.method20716() + 1.0
            )
                    / 2.0F;
            var1.field21557 = var5;
        }
    }

    @EventTarget
    public void method16345(Class4403 var1) {
        if (this.isEnabled() && this.getBooleanValueFromSetttingName("Keep Sprint")) {
            if (!var1.method13937()) {
                if (this.field23605.length == 2) {
                    double var4 = this.field23605[0] - mc.player.method3433().x;
                    double var6 = this.field23605[1] - mc.player.method3433().z;
                    if (var4 != 0.0 || var6 != 0.0) {
                        mc.player.method3435(this.field23605[0], mc.player.method3433().y, this.field23605[1]);
                    }

                    if (this.field23606 && !mc.player.method3337()) {
                        mc.player.setSprinting(true);
                    }
                }
            } else {
                this.field23605[0] = mc.player.method3433().x;
                this.field23605[1] = mc.player.method3433().z;
                this.field23606 = mc.player.method3337();
            }
        }
    }
}

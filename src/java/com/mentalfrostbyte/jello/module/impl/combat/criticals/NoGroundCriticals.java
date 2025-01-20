package com.mentalfrostbyte.jello.module.impl.combat.criticals;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventStep;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Jesus;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.RayTraceResult;

public class NoGroundCriticals extends Module {
    private int field23410;
    private boolean field23411;
    private boolean field23412;
    private boolean field23413;

    public NoGroundCriticals() {
        super(ModuleCategory.COMBAT, "NoGround", "NoGround criticals");
        this.registerSetting(new ModeSetting("Offset", "The way you will fake no ground", 0, "Vanilla", "OldHypixel"));
        this.registerSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages.", true));
    }

    @Override
    public void onEnable() {
        if (MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
            this.field23411 = this.getStringSettingValueByName("Offset").equals("OldHypixel");
            this.field23410 = !this.field23411 ? 1 : 2;
        }

        this.field23412 = false;
    }

    @EventTarget
    @HigherPriority
    private void method16034(EventStep var1) {
        if (this.isEnabled() && !(var1.getHeight() < 0.625)) {
            if (this.field23410 == 0 && this.field23411) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    private void method16035(JumpEvent var1) {
        if (this.isEnabled()) {
            if (this.field23410 == 1) {
                var1.setCancelled(true);
                this.field23412 = true;
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16036(EventUpdate var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround) {
                this.field23413 = false;
                if (this.field23412 && this.field23410 != 1) {
                    this.field23412 = !this.field23412;
                    mc.player.jump();
                }

                if (this.getStringSettingValueByName("Offset").equals("OldHypixel") != this.field23411) {
                    this.field23411 = this.getStringSettingValueByName("Offset").equals("OldHypixel");
                    this.field23410 = 2;
                }

                double var4 = this.field23411 ? 1.0E-14 : 0.0;
                boolean var6 = false;
                boolean var7 = mc.objectMouseOver != null && mc.objectMouseOver.getType() == RayTraceResult.Type.BLOCK;
                boolean var8 = mc.playerController.getIsHittingBlock() || mc.gameSettings.keyBindAttack.isKeyDown() && var7;
                if (!var8 && !Jesus.isWalkingOnLiquid()) {
                    switch (this.field23410) {
                        case 0:
                            var1.method13908(true);
                            this.field23410--;
                            break;
                        case 1:
                            var4 = 0.065;
                            this.field23410--;
                            break;
                        case 2:
                            var1.method13908(true);
                            var4 = 0.065;
                            this.field23410--;
                            if (!this.field23411) {
                                var4 = 1.0E-14;
                                this.field23410--;
                            }
                            break;
                        case 3:
                            var1.method13908(true);
                            var4 = 0.0;
                            var6 = true;
                            this.field23410--;
                    }
                } else {
                    this.field23410 = 2;
                    var6 = true;
                }

                var1.setY(var1.getY() + var4);
                var1.setGround(var6);
            } else {
                this.field23410 = this.getBooleanValueFromSettingName("Avoid Fall Damage") && !this.field23411 ? 3 : 0;
                if (this.getBooleanValueFromSettingName("Avoid Fall Damage") && this.field23411 && !this.field23413 && mc.player.getMotion().y < -0.1) {
                    this.field23413 = !this.field23413;
                    var1.setGround(true);
                }
            }
        }
    }
}

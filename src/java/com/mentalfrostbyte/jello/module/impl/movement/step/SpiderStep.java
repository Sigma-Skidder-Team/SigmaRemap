package com.mentalfrostbyte.jello.module.impl.movement.step;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mentalfrostbyte.jello.event.impl.EventStep;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Criticals;
import com.mentalfrostbyte.jello.module.impl.movement.Step;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.util.math.MathHelper;

public class SpiderStep extends Module {
    private int field23758;
    private double field23759;
    private double field23760;
    private float field23761;

    public SpiderStep() {
        super(ModuleCategory.MOVEMENT, "Spider", "Step for Spider");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "NCP", "AAC", "Gomme"));
    }

    @Override
    public void onEnable() {
        this.field23758 = 0;
    }

    @EventTarget
    @LowerPriority
    private void method16586(EventStep var1) {
        if (this.isEnabled() && !var1.isCancelled()) {
            double var4 = var1.getHeight();
            Class2131 var6 = ((Step) this.access()).method16748(var1);
            if (var6 == Class2131.field13904) {
                var1.setCancelled(true);
            } else if (var6 != Class2131.field13905) {
                if (!MovementUtils.isInWater() && var4 >= 0.625) {
                    this.field23760 = var4;
                    double var7 = MovementUtils.method37080();
                    if (var4 < 1.1) {
                        var7 *= var4;
                    }

                    var7 = !(var7 > 0.42) ? var7 : 0.4199998;
                    var1.setY(var7);
                    this.field23761 = MovementUtils.method37083()[0] - 90.0F;
                    this.field23758 = 1;
                    this.field23759 = mc.player.getPosY();
                    var4 = var1.getHeight();
                }
            }
        }
    }

    @EventTarget
    private void method16587(EventUpdate var1) {
        if (this.isEnabled() && mc.player != null && var1.isPre()) {
            if (this.field23758 != 1) {
                if (this.field23758 == 3) {
                    Module var4 = Client.getInstance().getModuleManager().getModuleByClass(Criticals.class);
                    if (var4.isEnabled() && var4.getStringSettingValueByName("Type").equals("NoGround")) {
                        var1.setY(var1.getY() + 1.0E-14);
                    } else {
                        var1.setGround(true);
                    }
                }
            } else {
                var1.setGround(false);
            }
        }
    }

    @EventTarget
    private void method16588(EventMove var1) {
        if (this.isEnabled() && mc.player != null) {
            if (this.field23758 == 1) {
                double var4 = MovementUtils.method37080();
                if (this.field23760 < 1.1) {
                    var4 *= this.field23760;
                }

                var4 = var4 > 0.42 ? 0.4199998 : var4;
                var1.setY(var4 * 0.797);
                MovementUtils.setSpeed(var1, 0.0);
                this.field23758++;
            } else if (this.field23758 == 2) {
                var1.setY(this.field23759 + this.field23760 - mc.player.getPosY());
                double var10 = this.getStringSettingValueByName("Mode").equals("AAC") ? 0.301 : MovementUtils.getSpeed();
                float var6 = this.field23761 * (float) (Math.PI / 180.0);
                var1.setX((double) (-MathHelper.sin(var6)) * var10);
                var1.setZ((double) MathHelper.cos(var6) * var10);
                this.field23758++;
            } else if (this.field23758 == 3) {
                if (MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                    var1.setY(-0.078);
                    String var7 = this.getStringSettingValueByName("Mode");
                    switch (var7) {
                        case "NCP":
                            MovementUtils.setSpeed(var1, MovementUtils.getSpeed());
                            break;
                        case "AAC":
                            MovementUtils.setSpeed(var1, 0.301);
                            break;
                        case "Gomme":
                            MovementUtils.setSpeed(var1, 0.175);
                    }
                } else {
                    MovementUtils.setSpeed(var1, 0.25);
                }

                if (!MultiUtilities.method17686()) {
                    MovementUtils.setSpeed(var1, 0.0);
                }

                this.field23758 = 0;
            }
        }
    }

    @EventTarget
    private void method16589(SafeWalkEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!var1.method13967()) {
                mc.player.stepHeight = 1.07F;
            } else {
                mc.player.stepHeight = 0.5F;
            }
        }
    }
}

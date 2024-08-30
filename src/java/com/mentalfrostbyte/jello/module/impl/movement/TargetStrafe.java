package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;

public class TargetStrafe extends Module {
    private int field23495 = 1;
    private boolean field23496;

    public TargetStrafe() {
        super(ModuleCategory.MOVEMENT, "TargetStrafe", "Allows you to strafe arround targets with speed");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Ninja", "Random"));
        this.registerSetting(new NumberSetting<Float>("Radius", "Radius of the circle", 2.0F, Float.class, 1.0F, 6.0F, 0.01F));
        this.registerSetting(new BooleanSetting("Only speed", "Use target strafe only when speed is enabled", true));
        this.registerSetting(
                new ModeSetting("AntiVoid", "The way you will avoid the void", 0, "Smart", "Halt", "Command", "None").method18616(var1 -> this.field23496 = false)
        );
    }

    // $VF: synthetic method
    public static Minecraft method16156() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16157() {
        return mc;
    }

    @EventTarget
    @LowerPriority
    public void method16151(Class4435 var1) {
        if (this.isEnabled()) {
            Entity var4 = null;
            if (Client.getInstance().getModuleManager().getModuleByClass(Speed.class).method15988() || !this.getBooleanValueFromSetttingName("Only speed")) {
                if (KillAura.field23949 != null) {
                    var4 = KillAura.field23949.method27397();
                } else if (KillAura.field23948 != null) {
                    var4 = KillAura.field23948;
                }
            }

            if (var4 != null) {
                double var5 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
                float var7 = this.getNumberValueBySettingName("Radius");
                String var8 = this.getStringSettingValueByName("Mode");
                switch (var8) {
                    case "Basic":
                        this.method16152(var4, var5, (double) var7, var1);
                        break;
                    case "Ninja":
                        float var15 = (float) Math.toRadians((double) (var4.method3142() - 180.0F));
                        double var16 = var4.getPositionVec().field18048 - (double) (MathHelper.sin(var15) * var7);
                        double var17 = var4.getPositionVec().field18050 + (double) (MathHelper.cos(var15) * var7);
                        var1.method13993(var16 - mc.player.getPositionVec().field18048);
                        var1.method13997(var17 - mc.player.getPositionVec().field18050);
                        break;
                    case "Random":
                        float var10 = (float) (Math.random() * 2.0 * Math.PI);
                        double var11 = var4.getPositionVec().field18048 - (double) (MathHelper.sin(var10) * var7);
                        double var13 = var4.getPositionVec().field18050 + (double) (MathHelper.cos(var10) * var7);
                        var1.method13993(var11 - mc.player.getPositionVec().field18048);
                        var1.method13997(var13 - mc.player.getPositionVec().field18050);
                }
            }
        }
    }

    public void method16152(Entity var1, double var2, double var4, Class4435 var6) {
        double var9 = var2 / (var4 * Math.PI * 2.0) * 360.0 * (double) this.field23495;
        double var11 = mc.player.getPosX() - var1.getPosX();
        double var13 = mc.player.getPosZ() - var1.getPosZ();
        double var15 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
        double var17 = (var15 + var9) * Math.PI / 180.0;
        double var19 = var1.getPositionVec().field18048 - Math.sin(var17) * var4;
        double var21 = var1.getPositionVec().field18050 + Math.cos(var17) * var4;
        var11 = var19 - mc.player.getPosX();
        var13 = var21 - mc.player.getPosZ();
        double var23 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
        var17 = var23 * Math.PI / 180.0;
        var6.method13993(-Math.sin(var17) * var2);
        var6.method13997(Math.cos(var17) * var2);
        Vector3d var25 = mc.player.method3233(var6.method13998());
        if (var25.field18048 != var6.method13992() || var25.field18050 != var6.method13996()) {
            this.field23495 *= -1;
            var9 *= -1.0;
            var17 = (var15 + var9) * Math.PI / 180.0;
            var19 = var1.getPositionVec().field18048 - Math.sin(var17) * var4;
            var21 = var1.getPositionVec().field18050 + Math.cos(var17) * var4;
            var11 = var19 - mc.player.getPosX();
            var13 = var21 - mc.player.getPosZ();
            var23 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
            var17 = var23 * Math.PI / 180.0;
            var6.method13993(-Math.sin(var17) * var2);
            var6.method13997(Math.cos(var17) * var2);
        }

        Vector3d var26 = new Vector3d(
                mc.player.getPositionVec().field18048 + var6.method13992(),
                mc.player.getPositionVec().field18049 + var6.method13994(),
                mc.player.getPositionVec().field18050 + var6.method13996()
        );
        String var27 = this.getStringSettingValueByName("AntiVoid");
        if (!var27.equals("None")) {
            if (!this.field23496 && this.method16153(var26) && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
                this.field23495 *= -1;
                this.field23496 = true;
            } else if (this.field23496 && !this.method16153(var26)) {
                this.field23496 = false;
            }
        }

        if (this.field23496 && mc.player.method3275(var1) > this.getNumberValueBySettingName("Radius")) {
            if (!var27.equals("Halt")) {
                Class9567.method37088(var6, var2);
                if (var27.equals("Smart")) {
                    var26 = new Vector3d(
                            mc.player.getPositionVec().field18048 + var6.method13992(),
                            mc.player.getPositionVec().field18049 + var6.method13994(),
                            mc.player.getPositionVec().field18050 + var6.method13996()
                    );
                    if (this.method16153(var26) && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
                        Class9567.method37088(var6, 0.0);
                    }
                }
            } else {
                Class9567.method37088(var6, 0.0);
            }
        }
    }

    private boolean method16153(Vector3d var1) {
        if (!(mc.player.getPositionVec().field18049 < 1.0)) {
            AxisAlignedBB var4 = new AxisAlignedBB(var1.method11339(-0.15, 0.0, -0.15), var1.method11339(0.15, (double) mc.player.method3430(), 0.15));
            var4 = var4.method19662(0.0, -mc.player.getPositionVec().field18049, 0.0);
            return mc.world.method7055(mc.player, var4).count() == 0L;
        } else {
            return true;
        }
    }

    private boolean method16154(double var1, double var3, double var5) {
        return mc.world.method7055(mc.player, mc.player.boundingBox.method19667(var1, var3, var5)).count() == 0L;
    }
}

package com.mentalfrostbyte.jello.module.impl.combat.aimbot;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender3D;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Aimbot;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class SmoothAimbot extends Module {
    private Entity field23894;
    private double field23895;

    public SmoothAimbot() {
        super(ModuleCategory.COMBAT, "Smooth", "Automatically aims at players");
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
    }

    @EventTarget
    private void method16765(EventRender3D var1) {
        if (this.isEnabled()) {
            if (!(mc.player.rotationPitch > 45.0F)) {
                Entity var4 = ((Aimbot) this.access()).getTarget(this.getNumberValueBySettingName("Range"));
                if (var4 != null) {
                    double var5 = mc.player.rotationPitch - this.toEntity(var4)[1];
                    double var7 = mc.player.rotationYaw - this.toEntity(var4)[0];
                    if (var7 < 0.0) {
                        var7 *= -1.0;
                    }

                    if (var5 < 0.0) {
                        var5 *= -1.0;
                    }

                    double var9 = var4.getPosX() - var4.lastTickPosX;
                    double var11 = var4.getPosZ() - var4.lastTickPosZ;
                    double var13 = var9 * 2.14 + var11 * 2.14;
                    if (var13 < 0.0) {
                        var13 *= -1.0;
                    }

                    double var15 = 0.05 * (double) Minecraft.getFps() * (var13 + 1.0);
                    if (mc.player.rotationPitch > this.toEntity(var4)[1]) {
                        mc.player.rotationPitch = (float) ((double) mc.player.rotationPitch - (var15 * var5 / 90.0 + Math.min(0.5, var7)));
                    }

                    if (mc.player.rotationPitch < this.toEntity(var4)[1]) {
                        mc.player.rotationPitch = (float) ((double) mc.player.rotationPitch + var15 * var5 / 90.0 + Math.min(0.5, var7));
                    }

                    if (mc.player.rotationYaw > this.toEntity(var4)[0]) {
                        mc.player.rotationYaw = (float) ((double) mc.player.rotationYaw - (var15 * var7 / 90.0 + Math.min(0.5, var5)));
                    }

                    if (mc.player.rotationYaw < this.toEntity(var4)[0]) {
                        mc.player.rotationYaw = (float) ((double) mc.player.rotationYaw + var15 * var7 / 90.0 + Math.min(0.5, var5));
                    }

                    mc.player.rotationYawHead = mc.player.rotationYaw;
                }
            }
        }
    }

    public float[] toEntity(Entity var1) {
        if (mc.pointedEntity == null && this.field23894 != null) {
            this.field23895 = Math.random();
        }

        this.field23894 = mc.pointedEntity;
        double var4 = var1.getPosX() - mc.player.getPosX() + Math.cos((double) (var1.getRotationYawHead() + 90.0F) * Math.PI / 180.0) * 0.14;
        double var6 = var1.getPosY() - 1.6 - this.field23895 + (double) var1.getEyeHeight() - mc.player.getPosY();
        double var8 = var1.getPosZ() - mc.player.getPosZ() + Math.sin((double) (var1.getRotationYawHead() + 90.0F) * Math.PI / 180.0) * 0.14;
        double var10 = MathHelper.sqrt(var4 * var4 + var8 * var8);
        float var12 = this.method16767(mc.player.rotationYaw, (float) (Math.atan2(var8, var4) * 180.0 / Math.PI) - 90.0F, 360.0F);
        float var13 = this.method16767(mc.player.rotationPitch, (float) (-(Math.atan2(var6, var10) * 180.0 / Math.PI)), 360.0F);
        return new float[]{var12, var13};
    }

    private float method16767(float var1, float var2, float var3) {
        float var6 = MathHelper.wrapDegrees(var2 - var1);
        if (var6 > var3) {
            var6 = var3;
        }

        if (var6 < -var3) {
            var6 = -var3;
        }

        return var1 + var6;
    }
}

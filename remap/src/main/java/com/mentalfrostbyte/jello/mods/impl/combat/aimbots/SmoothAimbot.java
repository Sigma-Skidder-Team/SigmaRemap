// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.aimbots;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.Aimbot;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Custom3DRenderEvent;
import mapped.ClientPlayerEntity;
import mapped.EventListener;
import mapped.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class SmoothAimbot extends Module
{
    private Entity field16115;
    private double field16116;
    
    public SmoothAimbot() {
        super(Category.COMBAT, "Smooth", "Automatically aims at players");
        this.addSetting(new NumberSetting("Range", "Range value", 4.0f, Float.class, 2.8f, 8.0f, 0.01f));
    }
    
    @EventListener
    private void method10835(final Custom3DRenderEvent custom3DRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (SmoothAimbot.mc.player.rotationPitch <= 45.0f) {
            final Entity method10266 = ((Aimbot)this.method9914()).method10266(this.getNumberSettingValueByName("Range"));
            if (method10266 != null) {
                double n = SmoothAimbot.mc.player.rotationPitch - this.method10836(method10266)[1];
                double n2 = SmoothAimbot.mc.player.rotationYaw - this.method10836(method10266)[0];
                if (n2 < 0.0) {
                    n2 *= -1.0;
                }
                if (n < 0.0) {
                    n *= -1.0;
                }
                double n3 = (method10266.posX - method10266.lastTickPosX) * 2.14 + (method10266.posZ - method10266.lastTickPosZ) * 2.14;
                if (n3 < 0.0) {
                    n3 *= -1.0;
                }
                final double n4 = 0.05 * Minecraft.method5338() * (n3 + 1.0);
                if (SmoothAimbot.mc.player.rotationPitch > this.method10836(method10266)[1]) {
                    final ClientPlayerEntity field4684 = SmoothAimbot.mc.player;
                    field4684.rotationPitch -= (float)(n4 * n / 90.0 + Math.min(0.5, n2));
                }
                if (SmoothAimbot.mc.player.rotationPitch < this.method10836(method10266)[1]) {
                    final ClientPlayerEntity field4685 = SmoothAimbot.mc.player;
                    field4685.rotationPitch += (float)(n4 * n / 90.0 + Math.min(0.5, n2));
                }
                if (SmoothAimbot.mc.player.rotationYaw > this.method10836(method10266)[0]) {
                    final ClientPlayerEntity field4686 = SmoothAimbot.mc.player;
                    field4686.rotationYaw -= (float)(n4 * n2 / 90.0 + Math.min(0.5, n));
                }
                if (SmoothAimbot.mc.player.rotationYaw < this.method10836(method10266)[0]) {
                    final ClientPlayerEntity field4687 = SmoothAimbot.mc.player;
                    field4687.rotationYaw += (float)(n4 * n2 / 90.0 + Math.min(0.5, n));
                }
                SmoothAimbot.mc.player.field2953 = SmoothAimbot.mc.player.rotationYaw;
            }
        }
    }
    
    public float[] method10836(final Entity class399) {
        if (SmoothAimbot.mc.field4690 == null) {
            if (this.field16115 != null) {
                this.field16116 = Math.random();
            }
        }
        this.field16115 = SmoothAimbot.mc.field4690;
        final double x = class399.posX - SmoothAimbot.mc.player.posX + Math.cos((class399.method1844() + 90.0f) * 3.141592653589793 / 180.0) * 0.14;
        final double y = class399.posY - 1.6 - this.field16116 + class399.method1892() - SmoothAimbot.mc.player.posY;
        final double y2 = class399.posZ - SmoothAimbot.mc.player.posZ + Math.sin((class399.method1844() + 90.0f) * 3.141592653589793 / 180.0) * 0.14;
        return new float[] { this.method10837(SmoothAimbot.mc.player.rotationYaw, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), this.method10837(SmoothAimbot.mc.player.rotationPitch, (float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    private float method10837(final float n, final float n2, final float n3) {
        float method35668 = MathHelper.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        return n + method35668;
    }
}

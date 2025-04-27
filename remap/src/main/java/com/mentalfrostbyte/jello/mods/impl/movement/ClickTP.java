// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.clicktps.SpartanClickTP;
import com.mentalfrostbyte.jello.mods.impl.movement.clicktps.BasicClickTP;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;

public class ClickTP extends ModuleWithSettings
{
    public ClickTP() {
        super(Category.MOVEMENT, "ClickTP", "TP's you when you click", new BasicClickTP(), new SpartanClickTP());
        this.addSetting(new BooleanSetting("Sneak", "Allows teleport only when sneaking", true));
        this.addSetting(new NumberSetting("Maximum range", "Maximum range of the teleport", 100.0f, Float.class, 10.0f, 300.0f, 1.0f));
    }
    
    @EventListener
    public void method10272(final Custom3DRenderEvent custom3DRenderEvent) {
        if (this.isEnabled() && (ClickTP.mc.player.method1809() || !this.getBooleanValueFromSettingName("Sneak"))) {
            final BlockRayTraceResult method13697 = Class4609.method13697(ClickTP.mc.player.rotationYaw, ClickTP.mc.player.rotationPitch, this.getNumberSettingValueByName("Maximum range"));
            Vec3i method13698 = null;
            if (method13697 != null) {
                method13698 = method13697.getPos();
            }
            this.method10274(this.method10273(), method13698.getX() + 0.5 - Minecraft.getInstance().field4644.method5833().method18161().getX(), method13698.getY() + 1 - Minecraft.getInstance().field4644.method5833().method18161().getY(), method13698.getZ() + 0.5 - Minecraft.getInstance().field4644.method5833().method18161().getZ());
        }
    }
    
    private double method10273() {
        return MathHelper.sin((float)Math.toRadians(90.0f - ClickTP.mc.player.rotationPitch)) * 10.0f;
    }
    
    private void method10274(final double n, final double n2, final double n3, final double n4) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(n2, n3, n4);
        GL11.glRotatef((float)(ClickTP.mc.player.ticksExisted % 90 * 4), 0.0f, 1.0f, 0.0f);
        this.method10276();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    private void method10275(final float n) {
        GL11.glBegin(6);
        for (int i = 0; i < 360; ++i) {
            final double n2 = i * 3.141592653589793 / 180.0;
            GL11.glVertex2d(Math.cos(n2) * n, Math.sin(n2) * n);
        }
        GL11.glEnd();
    }
    
    private void method10276() {
        for (int i = 0; i <= 270; i += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)i, 0.0f, 1.0f, 0.0f);
            this.method10277(77.0f, (float)(177 + i / 10), (float)(206 + i / 10));
            GL11.glPopMatrix();
        }
        for (int j = 0; j <= 270; j += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)j, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            this.method10277(77.0f, (float)(177 + j / 10), (float)(206 + j / 10));
            GL11.glPopMatrix();
        }
    }
    
    private void method10277(final float n, final float n2, final float n3) {
        GL11.glColor3f(n / 255.0f, n2 / 255.0f, n3 / 255.0f);
        GL11.glTranslatef(0.0f, 0.0f, 0.3f);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0f, 0.4985f);
        GL11.glVertex2f(-0.3f, 0.0f);
        GL11.glVertex2f(0.3f, 0.0f);
        GL11.glEnd();
    }
}

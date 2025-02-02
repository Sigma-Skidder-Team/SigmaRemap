// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.ColorSetting;
import mapped.*;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.List;

public class Breadcrumbs extends Module
{
    private List<Vec3d> field15850;
    
    public Breadcrumbs() {
        super(Category.RENDER, "Breadcrumbs", "Shows your taken path");
        this.field15850 = new ArrayList<Vec3d>();
        this.addSetting(new BooleanSetting("Fade Out", "Makes distant breadcrumbs fade out", true));
        this.addSetting(new ColorSetting("Color", "The crumbs color", ClientColors.LIGHT_GREYISH_BLUE.color));
    }
    
    @EventListener
    public void method10416(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (class5717.method16972() == 0.0) {
                if (class5717.method16974() == 0.0) {
                    if (class5717.method16976() == 0.0) {
                        return;
                    }
                }
            }
            this.field15850.add(new Vec3d(Breadcrumbs.mc.player.posX, Breadcrumbs.mc.player.posY, Breadcrumbs.mc.player.posZ));
        }
    }
    
    @EventListener
    public void method10417(final Class5732 class5732) {
        if (this.isEnabled()) {
            this.field15850.clear();
        }
    }
    
    @Override
    public void onDisable() {
        this.field15850.clear();
    }
    
    public Vec3d method10418(final Vec3d class5487) {
        return class5487.add(new Vec3d(-Minecraft.method5277().field4644.method5833().method18161().getX(), -Minecraft.method5277().field4644.method5833().method18161().getY(), -Minecraft.method5277().field4644.method5833().method18161().getZ()));
    }
    
    @EventListener
    public void method10419(final Class5739 class5739) {
        if (this.isEnabled()) {
            final Vec3d class5740 = new Vec3d(Breadcrumbs.mc.player.lastTickPosX - (Breadcrumbs.mc.player.lastTickPosX - Breadcrumbs.mc.player.posX) * Breadcrumbs.mc.method5314(), Breadcrumbs.mc.player.lastTickPosY - (Breadcrumbs.mc.player.lastTickPosY - Breadcrumbs.mc.player.posY) * Breadcrumbs.mc.method5314(), Breadcrumbs.mc.player.lastTickPosZ - (Breadcrumbs.mc.player.lastTickPosZ - Breadcrumbs.mc.player.posZ) * Breadcrumbs.mc.method5314());
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glLineWidth(2.0f);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glColor4fv(ColorUtils.method19139(ColorUtils.applyAlpha(this.method9885("Color"), 0.5f)));
            GL11.glBegin(3);
            for (final Vec3d class5741 : this.field15850) {
                final Vec3d method10418 = this.method10418(class5741);
                final double method10419 = class5741.distanceTo(class5740);
                final double n = this.method9883("Fade Out") ? (1.0 - Math.min(1.0, method10419 / 14.0)) : 0.6000000238418579;
                if (method10419 <= 24.0) {
                    GL11.glColor4fv(ColorUtils.method19139(ColorUtils.applyAlpha(this.method9885("Color"), (float)n)));
                    GL11.glVertex3d(method10418.x, method10418.y, method10418.z);
                }
            }
            final Vec3d method10420 = this.method10418(class5740);
            GL11.glVertex3d(method10420.x, method10420.y, method10420.z);
            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
            GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
        }
    }
}

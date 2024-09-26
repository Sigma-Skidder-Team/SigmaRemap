package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ColorSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Breadcrumbs extends Module {
    private final List<Vector3d> field23896 = new ArrayList<Vector3d>();

    public Breadcrumbs() {
        super(ModuleCategory.RENDER, "Breadcrumbs", "Shows your taken path");
        this.registerSetting(new BooleanSetting("Fade Out", "Makes distant breadcrumbs fade out", true));
        this.registerSetting(new ColorSetting("Color", "The crumbs color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    @EventTarget
    public void method16768(EventMove var1) {
        if (this.isEnabled()) {
            if (var1.getX() != 0.0 || var1.getY() != 0.0 || var1.getZ() != 0.0) {
                this.field23896.add(new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ()));
            }
        }
    }

    @EventTarget
    public void method16769(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23896.clear();
        }
    }

    @Override
    public void onDisable() {
        this.field23896.clear();
    }

    public Vector3d method16770(Vector3d var1) {
        return var1.add(
                new Vector3d(
                        - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getX(),
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getY(),
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getZ()
                )
        );
    }

    @EventTarget
    public void method16771(Render3DEvent var1) {
        if (this.isEnabled()) {
            Vector3d var4 = new Vector3d(
                    mc.player.lastTickPosX - (mc.player.lastTickPosX - mc.player.getPosX()) * (double) mc.getRenderPartialTicks(),
                    mc.player.lastTickPosY - (mc.player.lastTickPosY - mc.player.getPosY()) * (double) mc.getRenderPartialTicks(),
                    mc.player.lastTickPosZ - (mc.player.lastTickPosZ - mc.player.getPosZ()) * (double) mc.getRenderPartialTicks()
            );
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glLineWidth(2.0F);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glColor4fv(MultiUtilities.method17709(MultiUtilities.applyAlpha(this.parseSettingValueToIntBySettingName("Color"), 0.5F)));
            GL11.glBegin(3);

            for (Vector3d var6 : this.field23896) {
                Vector3d var7 = this.method16770(var6);
                double var8 = var6.method11341(var4);
                double var10 = !this.getBooleanValueFromSetttingName("Fade Out") ? 0.6F : 1.0 - Math.min(1.0, var8 / 14.0);
                if (!(var8 > 24.0)) {
                    GL11.glColor4fv(MultiUtilities.method17709(MultiUtilities.applyAlpha(this.parseSettingValueToIntBySettingName("Color"), (float) var10)));
                    GL11.glVertex3d(var7.x, var7.y, var7.z);
                }
            }

            Vector3d var12 = this.method16770(var4);
            GL11.glVertex3d(var12.x, var12.y, var12.z);
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

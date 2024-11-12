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
import lol.ClientColors;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Breadcrumbs extends Module {
    private final List<Vector3d> breadcrumbsPath = new ArrayList<>();

    public Breadcrumbs() {
        super(ModuleCategory.RENDER, "Breadcrumbs", "Shows your taken path");
        this.registerSetting(new BooleanSetting("Fade Out", "Makes distant breadcrumbs fade out", true));
        this.registerSetting(new ColorSetting("Color", "The crumbs color", ClientColors.LIGHT_GREYISH_BLUE.color));
    }

    @EventTarget
    public void onMove(EventMove event) {
        if (this.isEnabled()) {
            if (event.getX() != 0.0 || event.getY() != 0.0 || event.getZ() != 0.0) {
                this.breadcrumbsPath.add(new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ()));
            }
        }
    }

    @EventTarget
    public void onWorldLoad(WorldLoadEvent event) {
        if (this.isEnabled()) {
            this.breadcrumbsPath.clear();
        }
    }

    @Override
    public void onDisable() {
        this.breadcrumbsPath.clear();
    }

    public Vector3d adjustForRendering(Vector3d position) {
        return position.add(
                new Vector3d(
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getX(),
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getY(),
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getZ()
                )
        );
    }

    @EventTarget
    public void onRender3D(Render3DEvent event) {
        if (this.isEnabled()) {
            Vector3d interpolatedPlayerPosition = new Vector3d(
                    mc.player.lastTickPosX - (mc.player.lastTickPosX - mc.player.getPosX()) * mc.getRenderPartialTicks(),
                    mc.player.lastTickPosY - (mc.player.lastTickPosY - mc.player.getPosY()) * mc.getRenderPartialTicks(),
                    mc.player.lastTickPosZ - (mc.player.lastTickPosZ - mc.player.getPosZ()) * mc.getRenderPartialTicks()
            );

            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_LINE_SMOOTH);
            GL11.glLineWidth(2.0F);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glColor4fv(MultiUtilities.method17709(MultiUtilities.applyAlpha(this.parseSettingValueToIntBySettingName("Color"), 0.5F)));
            GL11.glBegin(GL11.GL_LINE_STRIP);

            for (Vector3d breadcrumb : this.breadcrumbsPath) {
                Vector3d adjustedBreadcrumb = this.adjustForRendering(breadcrumb);
                double distance = breadcrumb.method11341(interpolatedPlayerPosition);
                double fadeFactor = !this.getBooleanValueFromSettingName("Fade Out") ? 0.6F : 1.0 - Math.min(1.0, distance / 14.0);
                if (!(distance > 24.0)) {
                    GL11.glColor4fv(MultiUtilities.method17709(MultiUtilities.applyAlpha(this.parseSettingValueToIntBySettingName("Color"), (float) fadeFactor)));
                    GL11.glVertex3d(adjustedBreadcrumb.x, adjustedBreadcrumb.y, adjustedBreadcrumb.z);
                }
            }

            Vector3d adjustedPlayerPosition = this.adjustForRendering(interpolatedPlayerPosition);
            GL11.glVertex3d(adjustedPlayerPosition.x, adjustedPlayerPosition.y, adjustedPlayerPosition.z);
            GL11.glEnd();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL11.GL_LINE_SMOOTH);
            GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
        }
    }
}

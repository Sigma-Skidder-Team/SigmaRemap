package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ColorSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.PositionUtils;
import lol.ClientColors;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

public class Tracers extends Module {
    public Tracers() {
        super(ModuleCategory.RENDER, "Tracers", "Shows players");
        this.registerSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    @EventTarget
    public void method16521(Render3DEvent var1) {
        if (this.isEnabled()) {
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(519, 0.0F);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glLineWidth(2.0F * GuiManager.portalScaleFactor);
            GL11.glDepthMask(false);
            GL11.glShadeModel(7425);

            for (Entity var5 : MultiUtilities.method17680()) {
                if (var5 != mc.player
                        && var5.isAlive()
                        && var5.boundingBox.getAverageEdgeLength() > 0.8
                        && var5.ticksExisted > 30
                        && !Client.getInstance().getCombatManager().isTargetABot(var5)) {
                    this.method16522(var5);
                }
            }

            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
        }
    }

    public void method16522(Entity var1) {
        double var4 = PositionUtils.getRelativePosition(var1).x;
        double var6 = PositionUtils.getRelativePosition(var1).y + (double) (var1.getHeight() / 2.0F);
        double var8 = PositionUtils.getRelativePosition(var1).z;
        Vector3d var10 = new Vector3d(0.0, 0.0, 10.0)
                .method11350(-((float) Math.toRadians(Minecraft.getInstance().player.rotationPitch)))
                .method11351(-((float) Math.toRadians(Minecraft.getInstance().player.rotationYaw)));
        int var11 = this.parseSettingValueToIntBySettingName("Color");
        GL11.glBegin(1);
        GL11.glColor4fv(MultiUtilities.method17709(MultiUtilities.applyAlpha(var11, 0.45F)));
        GL11.glVertex3d(var10.x, var10.y, var10.z);
        GL11.glColor4fv(MultiUtilities.method17709(MultiUtilities.applyAlpha(var11, 0.0F)));
        GL11.glVertex3d(var4, var6, var8);
        GL11.glEnd();
    }
}

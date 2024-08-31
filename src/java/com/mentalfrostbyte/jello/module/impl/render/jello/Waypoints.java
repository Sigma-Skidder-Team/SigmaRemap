package com.mentalfrostbyte.jello.module.impl.render.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Waypoints extends Module {
    public HashMap<UUID, Class8351> field23572 = new HashMap<UUID, Class8351>();
    private final ModuleCategory field23573 = ModuleCategory.PLAYER;

    public Waypoints() {
        super(ModuleCategory.RENDER, "Waypoints", "Renders waypoints you added in Jello maps");
        this.registerSetting(new BooleanSetting("Unspawn Positions", "Adds a waypoint when a player unspawns", false));
        this.method16005(false);
    }

    @EventTarget
    public void method16274(WorldLoadEvent var1) {
        this.field23572.clear();
    }

    @EventTarget
    public void method16275(RecievePacketEvent var1) {
        if (mc.world != null) {
            if (!(var1.getPacket() instanceof Class5484)) {
                if (!(var1.getPacket() instanceof Class5487)) {
                    if (!(var1.getPacket() instanceof Class5582)) {
                        if (var1.getPacket() instanceof Class5596) {
                            Class5596 var4 = (Class5596) var1.getPacket();
                            this.field23572.remove(var4.method17593());
                        }
                    } else {
                        Class5582 var10 = (Class5582) var1.getPacket();
                        this.field23572.remove(var10.method17536());
                    }
                } else {
                    Class5487 var11 = (Class5487) var1.getPacket();
                    this.field23572.remove(var11.method17257());
                }
            } else {
                Class5484 var12 = (Class5484) var1.getPacket();

                for (int var8 : var12.method17251()) {
                    Entity var9 = mc.world.method6774(var8);
                    if (var9 != null && var9 instanceof PlayerEntity) {
                        this.field23572.remove(var9.getUniqueID());

                        this.field23572
                                .put(
                                        var9.getUniqueID(),
                                        new Class8351(
                                                var9.getName().getUnformattedComponentText() + " Unspawn",
                                                (int) var9.getPosX(),
                                                (int) var9.getPosY(),
                                                (int) var9.getPosZ(),
                                                ClientColors.DARK_OLIVE.getColor
                                        )
                                );
                    }
                }
            }
        }
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
        this.field23572.clear();
    }

    public List<Class8351> method16276(List<Class8351> var1) {
        List<Class8351> var4 = new ArrayList<>(var1);
        if (this.getBooleanValueFromSetttingName("Unspawn Positions")) {
            var4.addAll(this.field23572.values());
        }

        var4.sort(
                (var0, var1x) -> !(
                        mc.player.method3276((double) var0.field35890, (double) var0.field35893, (double) var0.field35891)
                                < mc.player.method3276((double) var1x.field35890, (double) var1x.field35893, (double) var1x.field35891)
                )
                        ? -1
                        : 1
        );
        return var4;
    }

    @EventTarget
    public void method16277(Render3DEvent var1) {
        if (this.isEnabled()) {
            for (Class8351 var5 : this.method16276(Client.getInstance().getWaypointsManager().method29989())) {
                BlockPos var6 = new BlockPos(
                        var5.field35890 - (var5.field35890 <= 0 ? 1 : 0), var5.field35893, var5.field35891 - (var5.field35891 <= 0 ? 1 : 0)
                );
                double var7 = Math.sqrt(Class9647.method37621(var6));
                if (!(var7 > 300.0)) {
                    if (mc.world.method7011(var6) != null && var5.field35894) {
                        int var9 = var6.getX() % 16;
                        int var10 = var6.getZ() % 16;
                        if (var10 < 0) {
                            var10 += 16;
                        }

                        if (var9 < 0) {
                            var9 += 16;
                        }

                        int var11 = mc.world.method7011(var6).method7070(Class101.field296).method24579(var9, var10);
                        if (var11 == 0) {
                            var11 = 64;
                        }

                        if ((float) var11 != var5.field35893) {
                            var5.field35893 = var5.field35893 + ((float) var11 - var5.field35893) * 0.1F;
                        }
                    }

                    float var13 = (float) ((double) var5.field35893 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11321());
                    float var14 = (float) ((double) var5.field35890 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11320());
                    float var15 = (float) ((double) var5.field35891 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11322());
                    if (var5.field35890 < 0) {
                        var14--;
                    }

                    if (var5.field35891 < 0) {
                        var15--;
                    }

                    float var12 = 1.0F;
                    var12 = (float) Math.max(1.0, Math.sqrt(Class9647.method37621(var6) / 30.0));
                    this.method16283(var14, var13, var15, var5.field35889, var5.field35892, var12);
                }
            }

            RenderSystem.method27905(33986, 240.0F, 240.0F);
            TextureImpl.method36180();
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    private void method16278(int var1) {
        for (int var4 = 0; var4 <= 270; var4 += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            this.method16279(ColorUtils.method17690(ClientColors.DEEP_TEAL.getColor, var1, 0.04F * (float) var4 / 90.0F));
            GL11.glPopMatrix();
        }

        for (int var5 = 0; var5 <= 270; var5 += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef(var5, 0.0F, 1.0F, 0.0F);
            this.method16279(ColorUtils.method17690(ClientColors.DEEP_TEAL.getColor, var1, 0.04F * (float) var5 / 90.0F));
            GL11.glPopMatrix();
        }
    }

    private void method16279(int var1) {
        GL11.glColor4fv(ColorUtils.method17709(var1));
        GL11.glTranslatef(0.0F, 0.0F, 0.3F);
        GL11.glNormal3f(0.0F, 0.0F, 1.0F);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0F, 0.4985F);
        GL11.glVertex2f(-0.3F, 0.0F);
        GL11.glVertex2f(0.3F, 0.0F);
        GL11.glEnd();
    }

    private void method16280(float var1, float var2, float var3, float var4) {
        GL11.glColor4f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F, var4);
        GL11.glTranslatef(0.0F, 0.0F, 0.3F);
        GL11.glNormal3f(0.0F, 0.0F, 1.0F);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0F, 0.0F);
        GL11.glVertex2f(0.0F, 0.5F);
        GL11.glVertex2f(0.5F, 0.5F);
        GL11.glVertex2f(0.5F, 0.0F);
        GL11.glEnd();
    }

    private void method16281(float var1) {
        GL11.glBegin(2);

        for (int var4 = 0; var4 < 360; var4++) {
            double var5 = (double) var4 * Math.PI / 180.0;
            GL11.glVertex2d(Math.cos(var5) * (double) var1, Math.sin(var5) * (double) var1);
        }

        GL11.glEnd();
    }

    private void method16282(float var1) {
        GL11.glBegin(6);

        for (int var4 = 0; var4 < 360; var4++) {
            double var5 = (double) var4 * Math.PI / 180.0;
            GL11.glVertex2d(Math.cos(var5) * (double) var1, Math.sin(var5) * (double) var1);
        }

        GL11.glEnd();
    }

    public void method16283(float var1, float var2, float var3, String var4, int var5, float var6) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.114F);
        GL11.glTranslated((double) var1 + 0.5, var2, (double) var3 + 0.5);
        GL11.glRotatef(90.0F, -1.0F, 0.0F, 0.0F);
        this.method16282(0.5F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glColor4fv(ColorUtils.method17709(var5));
        GL11.glTranslated((double) var1 + 0.5, var2 + 0.7F, (double) var3 + 0.5);
        GL11.glRotatef((float) (mc.player.ticksExisted % 90 * 4), 0.0F, -1.0F, 0.0F);
        GL11.glLineWidth(1.4F + 1.0F / var6 * 1.4F);
        this.method16281(0.6F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslated((double) var1 + 0.5, var2 + 0.7F, (double) var3 + 0.5);
        GL11.glRotatef((float) (mc.player.ticksExisted % 90 * 4), 0.0F, 1.0F, 0.0F);
        this.method16278(var5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glTranslated((double) var1 + 0.5, (double) var2 + 1.9, (double) var3 + 0.5);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().method37507(), 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().method37506(), 1.0F, 0.0F, 0.0F);
        ClientResource var9 = ResourceRegistry.JelloLightFont25;
        GL11.glPushMatrix();
        GL11.glScalef(-0.009F * var6, -0.009F * var6, -0.009F * var6);
        GL11.glTranslated(0.0, -20.0 * Math.sqrt(Math.sqrt(var6)), 0.0);
        int var11 = ColorUtils.applyAlpha(ColorUtils.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 75.0F), 0.5F);
        RenderUtil.method11426(
                (float) (-var9.method23942(var4) / 2 - 14), -5.0F, (float) var9.method23942(var4) / 2.0F + 14.0F, (float) (var9.method23952() + 7), var11
        );
        RenderUtil.method11463(
                (float) (-var9.method23942(var4) / 2 - 14), -5.0F, (float) (var9.method23942(var4) + 28), (float) (var9.method23952() + 12), 20.0F, 0.5F
        );
        GL11.glTranslated(-var9.method23942(var4) / 2, 0.0, 0.0);
        RenderUtil.drawString(var9, 0.0F, 0.0F, var4, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
}

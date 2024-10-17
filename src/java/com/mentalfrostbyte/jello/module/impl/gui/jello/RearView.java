package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class RearView extends Module {
    public static Framebuffer framebuffer;
    public Animation animation;
    public int visibilityTimer = 0;

    public RearView() {
        super(ModuleCategory.GUI, "RearView", "See behind you");
        this.animation = new Animation(230, 200, Direction.BACKWARDS);
        this.registerSetting(new BooleanSetting("Show in GUI", "Makes the Rear View visible in guis", false));
        this.registerSetting(new BooleanSetting("Smart Visibility", "Only pops up when a player is behind you", false));
        this.registerSetting(new NumberSetting<Integer>("Size", "The rear view width", 400.0F, Integer.class, 120.0F, 1000.0F, 1.0F));
        this.method16005(false);
    }

    @EventTarget
    public void onTick(TickEvent event) {
        if (this.isEnabled()) {
            if (framebuffer != null && (framebuffer.framebufferWidth != mc.mainWindow.getFramebufferWidth() || framebuffer.framebufferHeight != mc.mainWindow.getFramebufferHeight())) {
                this.onEnable();
            }

            if (this.getBooleanValueFromSettingName("Smart Visibility")) {
                List<PlayerEntity> entities = mc.world
                        .getEntitiesInAABBexcluding(
                                PlayerEntity.class,
                                mc.player.getBoundingBox().grow(14.0),
                                var1x -> var1x.getDistance(mc.player) < 12.0F
                                        && !this.isEntityWithinViewAngle(var1x)
                                        && mc.player != var1x
                                        && !Client.getInstance().getCombatManager().isTargetABot(var1x)
                        );
                if (entities.isEmpty()) {
                    if (this.visibilityTimer > 0) {
                        this.visibilityTimer--;
                    }
                } else {
                    this.visibilityTimer = 5;
                }
            }
        }
    }

    public boolean isEntityWithinViewAngle(LivingEntity targetEntity) {
        float rotations = RotationHelper.calculateEntityRotations(targetEntity, mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ())[0];
        return this.calculateAngleDifference(mc.player.rotationYaw, rotations) <= 90.0F;
    }

    public float calculateAngleDifference(float angle1, float angle2) {
        float angleDifference = Math.abs(angle2 - angle1) % 360.0F;
        return angleDifference <= 180.0F ? angleDifference : 360.0F - angleDifference;
    }

    @EventTarget
    public void onRender(EventRender onRender) {
        if (framebuffer != null) {
            if (this.isEnabled()) {
                if (! Minecraft.getInstance().gameSettings.hideGUI) {
                    if (!this.getBooleanValueFromSettingName("Smart Visibility")) {
                        this.animation.changeDirection(mc.currentScreen != null && !this.getBooleanValueFromSettingName("Show in GUI") ? Direction.BACKWARDS : Direction.FORWARDS);
                    } else {
                        this.animation.changeDirection(this.visibilityTimer <= 0 ? Direction.BACKWARDS : Direction.FORWARDS);
                    }

                    float aspectRatio = (float) mc.mainWindow.getWidth() / (float) mc.mainWindow.getHeight();
                    int rearViewWidth    = (int) this.getNumberValueBySettingName("Size");
                    int rearViewHeight = (int) ((float) rearViewWidth / aspectRatio);
                    int offset = 10;
                    int positionY = -offset - rearViewHeight;
                    if (this.animation.calcPercent() == 0.0F && this.animation.calcPercent() == 1.0F) {
                        if (this.animation.calcPercent() == 0.0F) {
                            return;
                        }
                    } else if (this.animation.getDirection() != Direction.FORWARDS) {
                        positionY = (int) ((float) positionY * MathUtils.lerp(this.animation.calcPercent(), 0.49, 0.59, 0.16, 1.04));
                    } else {
                        positionY = (int) ((float) positionY * MathUtils.lerp(this.animation.calcPercent(), 0.3, 0.88, 0.47, 1.0));
                    }

                    RenderUtil.drawRoundedRect((float) (mc.mainWindow.getWidth() - offset - rearViewWidth), (float) (mc.mainWindow.getHeight() + positionY), (float) rearViewWidth, (float) (rearViewHeight - 1), 14.0F, this.animation.calcPercent());
                    rearViewWidth = (int) ((float) rearViewWidth * GuiManager.portalScaleFactor);
                    rearViewHeight = (int) ((float) rearViewHeight * GuiManager.portalScaleFactor);
                    offset = (int) ((float) offset * GuiManager.portalScaleFactor);
                    positionY = (int) ((float) positionY * GuiManager.portalScaleFactor);
                    RenderSystem.pushMatrix();
                    this.renderFramebuffer(framebuffer, rearViewWidth, rearViewHeight, mc.mainWindow.getFramebufferWidth() - offset - rearViewWidth, mc.mainWindow.getFramebufferHeight() + positionY);
                    RenderSystem.popMatrix();
                    RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
                    RenderSystem.matrixMode(5889);
                    RenderSystem.loadIdentity();
                    RenderSystem.ortho(0.0, (double) mc.mainWindow.getFramebufferWidth() / mc.mainWindow.getGuiScaleFactor(), (double) mc.mainWindow.getFramebufferHeight() / mc.mainWindow.getGuiScaleFactor(), 0.0, 1000.0, 3000.0);
                    RenderSystem.matrixMode(5888);
                    RenderSystem.loadIdentity();
                    RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
                    GL11.glScaled(1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.portalScaleFactor, 1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.portalScaleFactor, 1.0);
                    framebuffer.unbindFramebuffer();
                    mc.getFramebuffer().bindFramebuffer(true);
                }
            }
        }
    }

    public void renderFramebuffer(Framebuffer var1, int width, int height, double posX, double posY) {
        posY = posY - (double) mc.mainWindow.getFramebufferHeight() + (double) height;
        RenderSystem.colorMask(true, true, true, false);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.matrixMode(5889);
        RenderSystem.loadIdentity();
        RenderSystem.ortho(0.0, (double) width + posX, height, 0.0, 1000.0, 3000.0);
        RenderSystem.matrixMode(5888);
        RenderSystem.loadIdentity();
        RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
        RenderSystem.viewport(0, 0, width + (int) posX, height - (int) posY);
        RenderSystem.enableTexture();
        RenderSystem.disableLighting();
        RenderSystem.disableAlphaTest();
        RenderSystem.disableBlend();
        RenderSystem.enableColorMaterial();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        var1.bindFramebufferTexture();
        float var10 = (float) width;
        float var11 = (float) height;
        float var12 = (float) var1.framebufferWidth / (float) var1.framebufferTextureWidth;
        float var13 = (float) var1.framebufferHeight / (float) var1.framebufferTextureHeight;
        Tessellator tezz = RenderSystem.renderThreadTesselator();
        BufferBuilder buffer = tezz.getBuffer();
        buffer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        buffer.pos(posX, (double) var11 + posY, 0.0).tex(0.0F, 0.0F).color(255, 255, 255, 255).endVertex();
        buffer.pos((double) var10 + posX, (double) var11 + posY, 0.0).tex(var12, 0.0F).color(255, 255, 255, 255).endVertex();
        buffer.pos((double) var10 + posX, posY, 0.0).tex(var12, var13).color(255, 255, 255, 255).endVertex();
        buffer.pos(posX, posY, 0.0).tex(0.0F, var13).color(255, 255, 255, 255).endVertex();
        tezz.draw();
        var1.unbindFramebufferTexture();
        RenderSystem.depthMask(true);
        RenderSystem.colorMask(true, true, true, true);
    }

    @EventTarget
    public void on2D(Render2DEvent event) {
        if (this.isEnabled()) {
            if (framebuffer != null) {
                if (mc.currentScreen == null || this.getBooleanValueFromSettingName("Show in GUI") || this.visibilityTimer != 0) {
                    RenderSystem.pushMatrix();
                    RenderSystem.clear(16640, false);
                    framebuffer.bindFramebuffer(true);
                    RenderSystem.enableTexture();
                    RenderSystem.enableColorMaterial();
                    float newYaw = mc.player.rotationYaw;
                    mc.player.rotationYaw += 180.0F;
                    RenderSystem.enableDepthTest();
                    GL11.glAlphaFunc(519, 0.0F);
                    double newFov = mc.gameSettings.fov;
                    mc.gameSettings.fov = 114.0;
                    mc.gameRenderer.renderHand = false;
                    Client.dontRenderHand = true;
                    Framebuffer var11 = mc.worldRenderer.entityOutlineFramebuffer;
                    mc.worldRenderer.entityOutlineFramebuffer = null;
                    mc.gameRenderer.renderWorld(event.partialTicks, Util.nanoTime(), new MatrixStack());
                    mc.worldRenderer.entityOutlineFramebuffer = var11;
                    Client.dontRenderHand = false;
                    mc.gameRenderer.renderHand = true;
                    mc.gameSettings.fov = newFov;
                    mc.player.rotationYaw = newYaw;
                    RenderSystem.popMatrix();
                    mc.getFramebuffer().bindFramebuffer(true);
                }
            } else {
                this.onEnable();
            }
        }
    }

    @Override
    public void onEnable() {
        framebuffer = new Framebuffer(mc.mainWindow.getFramebufferWidth(), mc.mainWindow.getFramebufferHeight(), true, Minecraft.IS_RUNNING_ON_MAC);
        framebuffer.setFramebufferColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onDisable() {
        this.animation.changeDirection(Direction.BACKWARDS);
    }
}

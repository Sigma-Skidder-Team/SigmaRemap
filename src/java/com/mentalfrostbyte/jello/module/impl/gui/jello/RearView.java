package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class RearView extends PremiumModule {
    private static final String field23664 = "Show in GUI";
    private static final String field23665 = "Smart Visibility";
    private static final String field23666 = "Size";
    public static Framebuffer field23663;
    public Animation field23662;
    public int field23667 = 0;

    public RearView() {
        super("RearView", "See behind you", ModuleCategory.GUI);
        this.field23662 = new Animation(230, 200, Direction.BACKWARDS);
        this.registerSetting(new BooleanSetting("Show in GUI", "Makes the Rear View visible in guis", false));
        this.registerSetting(new BooleanSetting("Smart Visibility", "Only pops up when a player is behind you", false));
        this.registerSetting(new NumberSetting<Integer>("Size", "The rear view width", 400.0F, Integer.class, 120.0F, 1000.0F, 1.0F));
        this.method16005(false);
    }

    @EventTarget
    public void method16447(TickEvent var1) {
        if (this.isEnabled()) {
            if (field23663 != null && (field23663.field35732 != mc.mainWindow.getFramebufferWidth() || field23663.field35733 != mc.mainWindow.getFramebufferHeight())) {
                this.onEnable();
            }

            if (this.getBooleanValueFromSetttingName("Smart Visibility")) {
                List var4 = mc.world
                        .method6772(
                                PlayerEntity.class,
                                mc.player.getBoundingBox().method19664(14.0),
                                var1x -> var1x.getDistance(mc.player) < 12.0F
                                        && !this.method16448(var1x)
                                        && mc.player != var1x
                                        && !Client.getInstance().getCombatManager().method29346(var1x)
                        );
                if (var4.isEmpty()) {
                    if (this.field23667 > 0) {
                        this.field23667--;
                    }
                } else {
                    this.field23667 = 5;
                }
            }
        }
    }

    public boolean method16448(LivingEntity var1) {
        float var4 = RotationHelper.method34138(var1, mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ())[0];
        return this.method16449(mc.player.rotationYaw, var4) <= 90.0F;
    }

    public float method16449(float var1, float var2) {
        float var5 = Math.abs(var2 - var1) % 360.0F;
        return !(var5 > 180.0F) ? var5 : 360.0F - var5;
    }

    @EventTarget
    public void method16450(EventRender var1) {
        if (field23663 != null) {
            if (this.isEnabled()) {
                if (! Minecraft.getInstance().gameSettings.hideGUI) {
                    if (!this.getBooleanValueFromSetttingName("Smart Visibility")) {
                        this.field23662.changeDirection(mc.currentScreen != null && !this.getBooleanValueFromSetttingName("Show in GUI") ? Direction.BACKWARDS : Direction.FORWARDS);
                    } else {
                        this.field23662.changeDirection(this.field23667 <= 0 ? Direction.BACKWARDS : Direction.FORWARDS);
                    }

                    float var4 = (float) mc.mainWindow.getWidth() / (float) mc.mainWindow.getHeight();
                    int var5 = (int) this.getNumberValueBySettingName("Size");
                    int var6 = (int) ((float) var5 / var4);
                    int var7 = 10;
                    int var8 = -var7 - var6;
                    if (this.field23662.calcPercent() == 0.0F && this.field23662.calcPercent() == 1.0F) {
                        if (this.field23662.calcPercent() == 0.0F) {
                            return;
                        }
                    } else if (this.field23662.getDirection() != Direction.FORWARDS) {
                        var8 = (int) ((float) var8 * MathUtils.lerp(this.field23662.calcPercent(), 0.49, 0.59, 0.16, 1.04));
                    } else {
                        var8 = (int) ((float) var8 * MathUtils.lerp(this.field23662.calcPercent(), 0.3, 0.88, 0.47, 1.0));
                    }

                    RenderUtil.method11463(
                            (float) (mc.mainWindow.getWidth() - var7 - var5),
                            (float) (mc.mainWindow.getHeight() + var8),
                            (float) var5,
                            (float) (var6 - 1),
                            14.0F,
                            this.field23662.calcPercent()
                    );
                    var5 = (int) ((float) var5 * GuiManager.field41348);
                    var6 = (int) ((float) var6 * GuiManager.field41348);
                    var7 = (int) ((float) var7 * GuiManager.field41348);
                    var8 = (int) ((float) var8 * GuiManager.field41348);
                    RenderSystem.pushMatrix();
                    this.method16451(
                            field23663, var5, var6, mc.mainWindow.getFramebufferWidth() - var7 - var5, mc.mainWindow.getFramebufferHeight() + var8
                    );
                    RenderSystem.popMatrix();
                    RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
                    RenderSystem.matrixMode(5889);
                    RenderSystem.loadIdentity();
                    RenderSystem.ortho(
                            0.0,
                            (double) mc.mainWindow.getFramebufferWidth() / mc.mainWindow.getGuiScaleFactor(),
                            (double) mc.mainWindow.getFramebufferHeight() / mc.mainWindow.getGuiScaleFactor(),
                            0.0,
                            1000.0,
                            3000.0
                    );
                    RenderSystem.matrixMode(5888);
                    RenderSystem.loadIdentity();
                    RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
                    GL11.glScaled(
                            1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.field41348,
                            1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.field41348,
                            1.0
                    );
                    field23663.unbindFramebuffer();
                    mc.getFramebuffer().bindFramebuffer(true);
                }
            }
        }
    }

    public void method16451(Framebuffer var1, int var2, int var3, double var4, double var6) {
        var6 = var6 - (double) mc.mainWindow.getFramebufferHeight() + (double) var3;
        RenderSystem.method27870(true, true, true, false);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.matrixMode(5889);
        RenderSystem.loadIdentity();
        RenderSystem.ortho(0.0, (double) var2 + var4, var3, 0.0, 1000.0, 3000.0);
        RenderSystem.matrixMode(5888);
        RenderSystem.loadIdentity();
        RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
        RenderSystem.method27869(0, 0, var2 + (int) var4, var3 - (int) var6);
        RenderSystem.enableTexture();
        RenderSystem.method27821();
        RenderSystem.method27817();
        RenderSystem.disableBlend();
        RenderSystem.method27822();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        var1.method29110();
        float var10 = (float) var2;
        float var11 = (float) var3;
        float var12 = (float) var1.field35732 / (float) var1.field35730;
        float var13 = (float) var1.field35733 / (float) var1.field35731;
        Tessellator var14 = RenderSystem.method27937();
        BufferBuilder var15 = var14.getBuffer();
        var15.begin(7, DefaultVertexFormats.field43346);
        var15.pos(var4, (double) var11 + var6, 0.0).tex(0.0F, 0.0F).color(255, 255, 255, 255).endVertex();
        var15.pos((double) var10 + var4, (double) var11 + var6, 0.0).tex(var12, 0.0F).color(255, 255, 255, 255).endVertex();
        var15.pos((double) var10 + var4, var6, 0.0).tex(var12, var13).color(255, 255, 255, 255).endVertex();
        var15.pos(var4, var6, 0.0).tex(0.0F, var13).color(255, 255, 255, 255).endVertex();
        var14.draw();
        var1.method29111();
        RenderSystem.depthMask(true);
        RenderSystem.method27870(true, true, true, true);
    }

    @EventTarget
    public void method16452(Render2DEvent var1) {
        if (this.isEnabled()) {
            if (field23663 != null) {
                if (mc.currentScreen == null || this.getBooleanValueFromSetttingName("Show in GUI") || this.field23667 != 0) {
                    RenderUtil.method11468();
                    RenderSystem.pushMatrix();
                    RenderSystem.clear(16640, false);
                    field23663.bindFramebuffer(true);
                    RenderSystem.enableTexture();
                    RenderSystem.method27822();
                    int var4 = mc.gameSettings.framerateLimit;
                    int var5 = Math.min(Minecraft.getFps(), var4);
                    var5 = Math.max(var5, 60);
                    long var6 = Util.nanoTime() - var1.field21555;
                    float var8 = mc.player.rotationYaw;
                    mc.player.rotationYaw += 180.0F;
                    RenderSystem.enableDepthTest();
                    GL11.glAlphaFunc(519, 0.0F);
                    double var9 = mc.gameSettings.field44669;
                    mc.gameSettings.field44669 = 114.0;
                    mc.gameRenderer.field814 = false;
                    Client.field28993 = true;
                    Framebuffer var11 = mc.worldRenderer.field959;
                    mc.worldRenderer.field959 = null;
                    mc.gameRenderer.method754(var1.field21554, Util.nanoTime(), new MatrixStack());
                    mc.worldRenderer.field959 = var11;
                    Client.field28993 = false;
                    mc.gameRenderer.field814 = true;
                    mc.gameSettings.field44669 = var9;
                    mc.player.rotationYaw = var8;
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
        RenderUtil.method11469(mc.getFramebuffer());
        field23663 = new Framebuffer(mc.mainWindow.getFramebufferWidth(), mc.mainWindow.getFramebufferHeight(), true, Minecraft.IS_RUNNING_ON_MAC);
        field23663.setFramebufferColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onDisable() {
        this.field23662.changeDirection(Direction.BACKWARDS);
    }
}

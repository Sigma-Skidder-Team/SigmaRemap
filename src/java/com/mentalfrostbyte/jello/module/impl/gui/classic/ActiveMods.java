package com.mentalfrostbyte.jello.module.impl.gui.classic;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ActiveMods extends Module {
    private TreeMap<Module, Animation> field23962 = new TreeMap<Module, Animation>();
    private TrueTypeFont field23963;
    private TrueTypeFont field23964;
    private Animation field23965;

    public ActiveMods() {
        super(ModuleCategory.RENDER, "ActiveMods", "Shows active mods");
        this.registerSetting(new ModeSetting("Outline", "Outline", 0, "All", "Left", "Right", "None"));
        this.registerSetting(new ModeSetting("Animation", "Animation", 0, "Smooth", "Slide", "Both", "None"));
        this.registerSetting(new BooleanSetting("Sound", "Toggle sound", true));
    }

    public static int method16860(ActiveMods var0, Module var1) {
        return var0.method16857(var1);
    }

    @Override
    public void initialize() {
        this.method16853();
        this.method16852();
    }

    private void method16852() {
        this.field23965 = new Animation(2000, 2000, Direction.FORWARDS);
    }

    private void method16853() {
        this.field23962.clear();
        this.field23963 = ResourceList.bold18;
        this.field23964 = ResourceList.bold16;
        this.field23962 = new TreeMap<Module, Animation>(new Class3598(this));
    }

    @EventTarget
    private void method16854(EventRender var1) {
        if (this.isEnabled() && mc.player != null) {
            String var4 = this.getStringSettingValueByName("Animation");
            String var5 = this.getStringSettingValueByName("Outline");
            this.method16855();
            if (this.field23965.calcPercent() == 1.0F) {
                this.field23965.method25318(0.0F);
            }

            int var6 = -2;
            int var7 = Minecraft.getInstance().mainWindow.getWidth() - 2;
            int var8 = -2;
            int var9 = new java.awt.Color(0, 192, 255, 255).getRGB();
            int var10 = new java.awt.Color(0, 192, 255, 255).getRGB();
            int var11 = -7;
            float var12 = this.field23965.calcPercent();

            for (Entry var14 : this.field23962.entrySet()) {
                Animation var15 = (Animation) var14.getValue();
                Module var16 = (Module) var14.getKey();
                if (var16.isEnabled() || var15.calcPercent() != 1.0F && !var4.equalsIgnoreCase("None")) {
                    var9 = java.awt.Color.HSBtoRGB(var12, 1.0F, 1.0F);
                    var10 = java.awt.Color.HSBtoRGB(var12, 1.0F, 1.0F);
                    int var19 = this.method16857(var16);
                    int var20 = this.field23963.method23941(var16.getSuffix()) + var8;
                    float var21 = 1.0F - QuadraticEasing.easeOutQuad(var15.calcPercent(), 0.0F, 1.0F, 1.0F);
                    if (var4.equalsIgnoreCase("Smooth") || var4.equalsIgnoreCase("Both")) {
                        var20 = (int) ((float) var20 * var21);
                    }

                    RenderSystem.pushMatrix();
                    if (var5.equalsIgnoreCase("Right")) {
                        GL11.glTranslated(-3.0, 0.0, 0.0);
                    }

                    RenderUtil.drawRect(
                            (float) (var7 - var19 - 3), (float) (var6 + 1), (float) (var7 + 2), (float) (var6 + var20 + 1), new java.awt.Color(0, 0, 0, 150).getRGB()
                    );
                    if (!var5.equalsIgnoreCase("None")) {
                        if (!var5.equalsIgnoreCase("All")) {
                            if (!var5.equalsIgnoreCase("Left")) {
                                if (var5.equalsIgnoreCase("Right")) {
                                    RenderUtil.drawRect((float) (var7 + 2), (float) (var6 + 1), (float) (var7 + 7), (float) (var6 + 1 + var20), var10);
                                }
                            } else {
                                RenderUtil.drawRect((float) (var7 - var19 - 6), (float) (var6 + 1), (float) (var7 - var19 - 3), (float) (var6 + 1 + var20), var10);
                            }
                        } else {
                            RenderUtil.drawRect((float) (var7 - var19 - 5), (float) (var6 + 1), (float) (var7 - var19 - 3), (float) (var6 + 1 + var20), var10);
                            RenderUtil.drawRect((float) (var7 - var19 - 3), (float) (var6 + 1), (float) (var7 - var11 - 5), (float) (var6 + 3), var10);
                        }
                    }

                    RenderSystem.clearCurrentColor();
                    RenderSystem.enableBlend();
                    if (var4.equalsIgnoreCase("Slide") || var4.equalsIgnoreCase("Both")) {
                        GL11.glTranslated((float) var19 * QuadraticEasing.easeOutQuad(var15.calcPercent(), 0.0F, 1.0F, 1.0F), 0.0, 0.0);
                    }

                    RenderUtil.method11418(
                            (float) (var7 - var19 - 3),
                            (float) (var6 + 1),
                            (float) var7,
                            (float) (var6 + var20) - QuadraticEasing.easeOutQuad(var15.calcPercent(), 0.0F, 1.0F, 1.0F)
                    );
                    this.field23963.method23937((float) (var7 - var19), (float) var6, var16.getSuffix(), new Color(var9));
                    this.field23964
                            .method23937(
                                    (float) (var7 - this.field23964.getStringWidth(this.method16856(var16))),
                                    (float) var6 + 1.6F,
                                    this.method16856(var16),
                                    new Color(160, 160, 160)
                            );
                    RenderUtil.endScissor();
                    RenderSystem.disableBlend();
                    var6 += var20;
                    RenderSystem.popMatrix();
                    var11 = var19;
                    var12 = (float) ((double) var12 + 0.0196078431372549);
                    if (var12 > 1.0F) {
                        var12 = 0.0F;
                    }
                }
            }

            if (var5.equalsIgnoreCase("All") && var11 > 0) {
                RenderUtil.drawRect((float) (var7 - var11 - 5), (float) (var6 + 1), (float) (var7 + 2), (float) (var6 + 3), var10);
            }
        }
    }

    private void method16855() {
        if (this.field23962.isEmpty()) {
            this.field23962.clear();

            for (Module var4 : Client.getInstance().getModuleManager().getModuleMap().values()) {
                if (var4 != this && var4.getCategory() != ModuleCategory.GUI) {
                    Animation var5 = new Animation(200, 200, !var4.isEnabled() ? Direction.FORWARDS : Direction.BACKWARDS);
                    var5.method25318(!var4.isEnabled() ? 1.0F : 0.0F);
                    this.field23962.put(var4, var5);
                    Setting var6 = var4.getSettingMap().get("Type");
                    if (var6 == null) {
                        var6 = var4.getSettingMap().get("Mode");
                        if (var6 != null) {
                            var6.addObserver(var1 -> this.method16853());
                        }
                    } else {
                        var6.addObserver(var1 -> this.method16853());
                    }
                }
            }
        }

        for (Entry var8 : this.field23962.entrySet()) {
            Module var9 = (Module) var8.getKey();
            Animation var11 = (Animation) var8.getValue();
            var11.changeDirection(!var9.isEnabled() ? Direction.FORWARDS : Direction.BACKWARDS);
        }
    }

    private String method16856(Module var1) {
        String var4 = "";
        if (var1.getStringSettingValueByName("Type") == null) {
            if (var1.getStringSettingValueByName("Mode") != null) {
                var4 = var4 + " " + var1.getStringSettingValueByName("Mode");
            }
        } else {
            var4 = var4 + " " + var1.getStringSettingValueByName("Type");
        }

        return var4;
    }

    private int method16857(Module var1) {
        String var4 = var1.getSuffix();
        String var5 = this.method16856(var1);
        return this.field23963.getStringWidth(var4) + this.field23964.getStringWidth(var5);
    }
}

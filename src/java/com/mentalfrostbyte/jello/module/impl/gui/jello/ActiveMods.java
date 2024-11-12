package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.EventRenderGUI;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mojang.blaze3d.platform.GlStateManager;
import lol.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.*;

public class ActiveMods extends Module {
    public int animationOffset = 0;
    public int translationOffset;
    public HashMap<Module, Animation> animations = new HashMap<>();
    public TrueTypeFont fontResource = ResourceRegistry.JelloLightFont20;
    private final List<Module> activeModules = new ArrayList<>();

    public ActiveMods() {
        super(ModuleCategory.GUI, "ActiveMods", "Renders active mods");
        this.registerSetting(new ModeSetting("Size", "The font size", 0, "Normal", "Small", "Tiny"));
        this.registerSetting(new BooleanSetting("Animations", "Scale in animation", true));
        this.registerSetting(new BooleanSetting("Sound", "Toggle sound", true));
        this.getSettingMap().get("Size").addObserver(var1 -> this.setFontSize());
        this.method16005(false);
    }

    @Override
    public void onEnable() {
        this.setFontSize();
    }

    public void setFontSize() {
        String sizeSetting = this.getStringSettingValueByName("Size");
        switch (sizeSetting) {
            case "Normal":
                this.fontResource = ResourceRegistry.JelloLightFont20;
                break;
            case "Small":
                this.fontResource = ResourceRegistry.JelloLightFont18;
                break;
            default:
                this.fontResource = ResourceRegistry.JelloLightFont14;
        }
    }

    @Override
    public void initialize() {
        this.activeModules.clear();

        for (Module module : Client.getInstance().getModuleManager().getModuleMap().values()) {
            if (module.getAdjustedCategoryBasedOnClientMode() != ModuleCategory.GUI) {
                this.activeModules.add(module);
                this.animations.put(module, new Animation(150, 150, Direction.BACKWARDS));
                if (this.getBooleanValueFromSettingName("Animations")) {
                    this.animations.get(module).changeDirection(!module.isEnabled() ? Direction.BACKWARDS : Direction.FORWARDS);
                }
            }
        }

        Collections.sort(this.activeModules, new Class3602(this));
    }

    @EventTarget
    private void renderGUI(EventRenderGUI event) {
        if (this.isEnabled() && mc.player != null) {
            if (!event.method13939()) {
                GlStateManager.translatef(0.0F, (float) (-this.translationOffset), 0.0F);
            } else {
                Scoreboard scoreboard = mc.world.method6805();
                Class8375 teamEntry = null;
                ScorePlayerTeam playerTeam = scoreboard.getPlayersTeam(mc.player.method2956());
                if (playerTeam != null) {
                    int colorIndex = playerTeam.getColor().getColorIndex();
                    if (colorIndex >= 0) {
                        teamEntry = scoreboard.method20989(3 + colorIndex);
                    }
                }

                Class8375 entry = teamEntry == null ? scoreboard.method20989(1) : teamEntry;
                Collection<?> players = scoreboard.getSortedScores(entry);
                int enabledModulesCount = 0;

                for (Module module : this.activeModules) {
                    if (module.isEnabled()) {
                        enabledModulesCount++;
                    }
                }

                int requiredHeight = 23 + enabledModulesCount * (this.fontResource.getHeight() + 1);
                int screenHeight = Minecraft.getInstance().mainWindow.getHeight();
                int availableHeight = screenHeight / 2 - (9 + 5) * (players.size() - 3 + 2);
                if (requiredHeight <= availableHeight) {
                    this.translationOffset = 0;
                } else {
                    this.translationOffset = (requiredHeight - availableHeight) / 2;
                    GlStateManager.translatef(0.0F, (float) this.translationOffset, 0.0F);
                }
            }
        }
    }

    @EventTarget
    private void render(EventRender event) {
        if (this.isEnabled() && mc.player != null) {
            for (Module module : this.animations.keySet()) {
                if (this.getBooleanValueFromSettingName("Animations")) {
                    this.animations.get(module).changeDirection(!module.isEnabled() ? Direction.BACKWARDS : Direction.FORWARDS);
                }
            }

            if (!Minecraft.getInstance().gameSettings.hideGUI) {
                int offset = 10;
                float scaleFactor = 1;
                int screenWidth = Minecraft.getInstance().mainWindow.getWidth();
                TrueTypeFont font = this.fontResource;
                int baseOffset = offset - 4;
                if (this.fontResource == ResourceRegistry.JelloLightFont14) {
                    offset -= 3;
                }

                if (Minecraft.getInstance().gameSettings.showDebugInfo) {
                    baseOffset = (int) ((double) (mc.ingameGUI.field6726.debugInfoRight.size() * 9) * mc.mainWindow.getGuiScaleFactor() + 7.0);
                }

                int colorAlpha = MultiUtilities.applyAlpha(-1, 0.95F);

                for (Module module : this.activeModules) {
                    float opacity = 1.0F;
                    float scaledOpacity = 1.0F;
                    if (!this.getBooleanValueFromSettingName("Animations")) {
                        if (!module.isEnabled()) {
                            continue;
                        }
                    } else {
                        Animation animation = this.animations.get(module);
                        if (animation.calcPercent() == 0.0F) {
                            continue;
                        }

                        scaledOpacity = animation.calcPercent();
                        opacity = 0.86F + 0.14F * scaledOpacity;
                    }

                    String moduleName = module.getSuffix();
                    GL11.glAlphaFunc(519, 0.0F);
                    GL11.glPushMatrix();
                    int xPosition = screenWidth - offset - font.getWidth(moduleName) / 2;
                    int yPosition = baseOffset + 12;
                    GL11.glTranslatef((float) xPosition, (float) yPosition, 0.0F);
                    GL11.glScalef(opacity, opacity, 1.0F);
                    GL11.glTranslatef((float) (-xPosition), (float) (-yPosition), 0.0F);
                    float imageScale = (float) Math.sqrt(Math.min(1.2F, (float) font.getWidth(moduleName) / 63.0F));
                    RenderUtil.drawImage(
                            (float) screenWidth - (float) font.getWidth(moduleName) * 1.5F - (float) offset - 20.0F,
                            (float) (baseOffset - 20),
                            (float) font.getWidth(moduleName) * 3.0F,
                            font.getHeight() + scaleFactor + 40,
                            ResourceList.shadowPNG,
                            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.36F * scaledOpacity * imageScale)
                    );
                    RenderUtil.drawString(
                            font, (float) (screenWidth - offset - font.getWidth(moduleName)), (float) baseOffset, moduleName, scaledOpacity != 1.0F ? MultiUtilities.applyAlpha(-1, scaledOpacity * 0.95F) : colorAlpha
                    );
                    GL11.glPopMatrix();
                    baseOffset = (int) ((float) baseOffset + (float) (font.getHeight() + scaleFactor) * QuadraticEasing.easeInOutQuad(scaledOpacity, 0.0F, 1.0F, 1.0F));
                }

                this.animationOffset = baseOffset;
            }
        }
    }

    public int getAnimationOffset() {
        return this.animationOffset;
    }

    private Color calculateColor(int x, int y, Color baseColor) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(3);
        GL11.glPixelStorei(3317, 1);
        GL11.glReadPixels(x, Minecraft.getInstance().mainWindow.getHeight() - y, 1, 1, 6407, 5120, buffer);
        Color color = new Color(buffer.get(0) * 2, buffer.get(1) * 2, buffer.get(2) * 2, 1);
        if (baseColor != null) {
            color = MultiUtilities.method17681(color, baseColor, 0.08F);
        }

        return color;
    }
}

package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class InfoHUD extends Module {
    public float field23851 = 0.0F;

    public InfoHUD() {
        super(ModuleCategory.GUI, "Info HUD", "Shows a bunch of usefull stuff");
        this.registerSetting(new ModeSetting("Cords", "Coordinate display type", 1, "None", "Normal", "Precise"));
        this.registerSetting(new BooleanSetting("Show Player", "Renders a miniature version of your character", true));
        this.registerSetting(new BooleanSetting("Show Armor", "Shows your armor's status", true));
        this.method16005(false);
    }

    @EventTarget
    private void method16692(Class4415 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (! Minecraft.getInstance().gameSettings.hideGUI) {
                if (!(mc.currentScreen instanceof ChatScreen)) {
                    float var4 = mc.player.rotationYaw % 360.0F - this.field23851 % 360.0F;
                    this.field23851 = this.field23851 + var4 / (float) Minecraft.getFps() * 1.5F;
                    boolean var5 = false;
                    int var6 = 14;
                    if (this.getBooleanValueFromSetttingName("Show Player")) {
                        var6 += this.method16696(0, mc.mainWindow.getHeight() - 23, 114);
                    }

                    if (this.getBooleanValueFromSetttingName("Show Armor")) {
                        var6 += this.method16695(var6, mc.mainWindow.getHeight() - 14) + 10;
                    }

                    if (!this.getStringSettingValueByName("Cords").equals("None")) {
                        var6 += this.method16694(var6, 42) + 10;
                    }
                }
            }
        }
    }

    public String method16693(boolean var1) {
        return !var1
                ? Math.round(mc.player.getPosX())
                + " "
                + Math.round(mc.player.getPosY())
                + " "
                + Math.round(mc.player.getPosZ())
                : (float) Math.round(mc.player.getPosX() * 10.0) / 10.0F
                + " "
                + (float) Math.round(mc.player.getPosY() * 10.0) / 10.0F
                + " "
                + (float) Math.round(mc.player.getPosZ() * 10.0) / 10.0F;
    }

    public int method16694(int var1, int var2) {
        String var5 = "Facing South";
        String var6 = this.method16693(this.getStringSettingValueByName("Cords").equals("Precise"));
        RenderUtil.drawString(
                ResourceRegistry.JelloMediumFont20,
                (float) var1,
                (float) (mc.mainWindow.getHeight() - var2),
                var6,
                ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)
        );
        return Math.max(ResourceRegistry.JelloLightFont20.method23942(var5), ResourceRegistry.JelloMediumFont20.method23942(var6));
    }

    public int method16695(int var1, int var2) {
        int var5 = 0;

        for (int var6 = 0; var6 < mc.player.inventory.field5440.size(); var6++) {
            ItemStack var7 = mc.player.inventory.field5440.get(var6);
            if (!(var7.getItem() instanceof Class3280)) {
                var5++;
                int var8 = var2 - 32 * var5;
                RenderUtil.method11479(var7, var1, var8, 32, 32);
                GL11.glDisable(2896);
                float var9 = 1.0F - (float) var7.method32117() / (float) var7.method32119();
                if (var9 != 1.0F) {
                    RenderUtil.method11424((float) (var1 + 2), (float) (var8 + 28), 28.0F, 5.0F, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F));
                    RenderUtil.method11424(
                            (float) (var1 + 2),
                            (float) (var8 + 28),
                            28.0F * var9,
                            3.0F,
                            ColorUtils.applyAlpha(!((double) var9 <= 0.2) ? ClientColors.DARK_SLATE_GREY.getColor : ClientColors.PALE_YELLOW.getColor, 0.9F)
                    );
                }
            }
        }

        return var5 != 0 ? 32 : -7;
    }

    public int method16696(int var1, int var2, int var3) {
        return var3 - 24;
    }
}

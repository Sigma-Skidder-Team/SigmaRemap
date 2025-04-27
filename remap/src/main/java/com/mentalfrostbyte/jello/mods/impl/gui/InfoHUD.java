// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class InfoHUD extends Module
{
    public float field15926;
    
    public InfoHUD() {
        super(Category.GUI, "Info HUD", "Shows a bunch of usefull stuff");
        this.field15926 = 0.0f;
        this.addSetting(new StringSetting("Cords", "Coordinate display type", 1, "None", "Normal", "Precise"));
        this.addSetting(new BooleanSetting("Show Player", "Renders a miniature version of your character", true));
        this.addSetting(new BooleanSetting("Show Armor", "Shows your armor's status", true));
        this.method9915(false);
    }
    
    @EventListener
    private void method10537(final Class5740 class5740) {
        if (!this.isEnabled() || InfoHUD.mc.player == null) {
            return;
        }
        if (Minecraft.getInstance().gameSettings.field23464) {
            return;
        }
        if (!(InfoHUD.mc.currentScreen instanceof ChatScreen)) {
            final float n = InfoHUD.mc.player.rotationYaw % 360.0f - this.field15926 % 360.0f;
            final float field15926 = this.field15926;
            final float n2 = n;
            final Minecraft field15927 = InfoHUD.mc;
            this.field15926 = field15926 + n2 / Minecraft.method5338() * 1.5f;
            int n3 = 14;
            if (this.getBooleanValueFromSettingName("Show Player")) {
                n3 += this.method10541(0, InfoHUD.mc.window.method7695() - 23, 114);
            }
            if (this.getBooleanValueFromSettingName("Show Armor")) {
                n3 += this.method16695(n3, InfoHUD.mc.window.method7695() - 14) + 10;
            }
            if (!this.getStringSettingValueByName("Cords").equals("None")) {
                final int n4 = n3 + (this.method16694(n3, 42) + 10);
            }
        }
    }
    
    public String method10538(final boolean b) {
        if (!b) {
            return Math.round(InfoHUD.mc.player.posX) + " " + Math.round(InfoHUD.mc.player.posY) + " " + Math.round(InfoHUD.mc.player.posZ);
        }
        return Math.round(InfoHUD.mc.player.posX * 10.0) / 10.0f + " " + Math.round(InfoHUD.mc.player.posY * 10.0) / 10.0f + " " + Math.round(InfoHUD.mc.player.posZ * 10.0) / 10.0f;
    }
    
    public int method16694(final int n, final int n2) {
        final String s = "Facing South";
        final String method10538 = this.method10538(this.getStringSettingValueByName("Cords").equals("Precise"));
        RenderUtil.drawString(ClientFonts.JelloMedium20, (float)n, (float)(InfoHUD.mc.window.method7695() - n2), method10538, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.8f));
        return Math.max(ClientFonts.JelloLight20.getWidth(s), ClientFonts.JelloMedium20.getWidth(method10538));
    }
    
    public int method16695(final int n, final int n2) {
        int n3 = 0;
        for (int i = 0; i < InfoHUD.mc.player.inventory.field2740.size(); ++i) {
            final ItemStack class8321 = InfoHUD.mc.player.inventory.field2740.get(i);
            if (!(class8321.getItem() instanceof AirBlock)) {
                ++n3;
                final int n4 = n2 - 32 * n3;
                RenderUtil.method26929(class8321, n, n4, 32, 32);
                GL11.glDisable(2896);
                final float n5 = 1.0f - class8321.method27632() / (float)class8321.method27634();
                if (n5 != 1.0f) {
                    RenderUtil.method26874((float)(n + 2), (float)(n4 + 28), 28.0f, 5.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f));
                    RenderUtil.method26874((float)(n + 2), (float)(n4 + 28), 28.0f * n5, 3.0f, ColorUtils.applyAlpha((n5 > 0.2) ? ClientColors.DARK_SLATE_GREY.color : ClientColors.PALE_YELLOW.color, 0.9f));
                }
            }
        }
        return (n3 != 0) ? 32 : -7;
    }
    
    public int method10541(final int n, final int n2, final int n3) {
        return n3 - 24;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import slick2d.Texture;
import org.newdawn.slick.TrueTypeFont;

import java.io.IOException;

public class Murderer extends Module
{
    public String field15732;
    private Texture field15733;
    private boolean field15734;
    private boolean field15735;
    
    public Murderer() {
        super(Category.MISC, "Murderer", "Detects murderer in murder mystery minigame on hypixel");
        this.field15732 = "IBreakerman";
        this.field15734 = true;
        this.addSetting(new BooleanSetting("GUI", "Shows a GUI with info on the murderer", true));
        this.addSetting(new BooleanSetting("Chat Message", "Sends a message with the murderer's name", true));
    }
    
    @EventListener
    private void method10247(final EventReceivePacket eventReceivePacket) throws IOException {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof Class4402) {
                final Class4402 class5724 = (Class4402) eventReceivePacket.getPacket();
                if (class5724.method13247().getItem() instanceof SwordItem) {
                    if (Murderer.mc.world.getEntityByID(class5724.method13248()) instanceof PlayerEntity) {
                        final Entity method6741 = Murderer.mc.world.getEntityByID(class5724.method13248());
                        if (!this.field15732.equalsIgnoreCase(method6741.getName().getUnformattedComponentText())) {
                            if (this.getBooleanValueFromSettingName("Chat Message")) {
                                Murderer.mc.player.method4114("Murderer is " + method6741.getName() + ", detected by Jello client");
                            }
                            this.field15732 = method6741.getName().getUnformattedComponentText();
                            this.field15734 = true;
                            this.field15735 = true;
                        }
                        this.field15732 = method6741.getName().getUnformattedComponentText();
                    }
                }
            }
            if (eventReceivePacket.getPacket() instanceof Class4359) {
                this.field15735 = false;
            }
        }
    }
    
    @EventListener
    private void method10248(final Class5740 class5740) throws IOException {
        if (!this.isEnabled()) {
            return;
        }
        if (!this.field15735) {
            return;
        }
        if (this.getBooleanValueFromSettingName("GUI")) {
            final TrueTypeFont field40313 = ClientFonts.JelloLight20;
            final int method7694 = Minecraft.getInstance().window.method7694();
            final int method7695 = Minecraft.getInstance().window.method7695();
            if (this.field15734) {
                if (this.field15733 != null) {
                    this.field15734 = false;
                }
            }
            if (this.field15733 != null) {
                RenderUtil.method26876((float)(method7694 - field40313.getWidth(this.field15732) - 90), (float)(method7695 - 130), (float)(method7694 - 10), (float)(method7695 - 10), 1342177280);
                RenderUtil.method26905((float)(method7694 - field40313.getWidth(this.field15732) - 80), (float)(method7695 - 120), 50.0f, 100.0f, this.field15733);
                RenderUtil.drawString(field40313, (float)(method7694 - field40313.getWidth(this.field15732) - 20), (float)(method7695 - field40313.getHeight(this.field15732) - 60), this.field15732, -1);
            }
        }
    }
}

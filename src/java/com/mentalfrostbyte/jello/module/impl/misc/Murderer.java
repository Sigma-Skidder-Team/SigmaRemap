package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mojang.datafixers.util.Pair;
import mapped.RenderUtil;
import lol.Texture;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.network.play.server.SEntityEquipmentPacket;
import net.minecraft.network.play.server.SRespawnPacket;

import java.io.IOException;

public class Murderer extends Module {
    public String field23833 = "IBreakerman";
    private Texture field23834;
    private boolean field23835 = true;
    private boolean field23836;

    public Murderer() {
        super(ModuleCategory.MISC, "Murderer", "Detects murderer in murder mystery minigame on hypixel");
        this.registerSetting(new BooleanSetting("GUI", "Shows a GUI with info on the murderer", true));
        this.registerSetting(new BooleanSetting("Chat Message", "Sends a message with the murderer's name", true));
    }

    @EventTarget
    private void method16654(ReceivePacketEvent var1) throws IOException {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SEntityEquipmentPacket) {
                SEntityEquipmentPacket var4 = (SEntityEquipmentPacket) var1.getPacket();

                for (Pair var6 : var4.func_241790_c_()) {
                    if (var6.getSecond() != null
                            && ((ItemStack) var6.getSecond()).getItem() instanceof SwordItem
                            && mc.world.getEntityByID(var4.getEntityID()) instanceof PlayerEntity) {
                        Entity var7 = mc.world.getEntityByID(var4.getEntityID());
                        if (!this.field23833.equalsIgnoreCase(var7.getName().getString())) {
                            if (this.getBooleanValueFromSettingName("Chat Message")) {
                                mc.player.method5389("Murderer is " + var7.getName() + ", detected by Jello client");
                            }

                            this.field23833 = var7.getName().getUnformattedComponentText();
                            this.field23835 = true;
                            this.field23836 = true;
                        }

                        this.field23833 = var7.getName().getUnformattedComponentText();
                    }
                }
            }

            if (var1.getPacket() instanceof SRespawnPacket) {
                this.field23836 = false;
            }
        }
    }

    @EventTarget
    private void method16655(EventRender var1) throws IOException {
        if (this.isEnabled()) {
            if (this.field23836) {
                if (this.getBooleanValueFromSettingName("GUI")) {
                    TrueTypeFont var4 = ResourceRegistry.JelloLightFont20;
                    int var6 = Minecraft.getInstance().mainWindow.getWidth();
                    int var7 = Minecraft.getInstance().mainWindow.getHeight();
                    if (this.field23835 && this.field23834 != null) {
                        this.field23835 = false;
                    }

                    if (this.field23834 != null) {
                        RenderUtil.drawRect(
                                (float) (var6 - var4.getStringWidth(this.field23833) - 90), (float) (var7 - 130), (float) (var6 - 10), (float) (var7 - 10), 1342177280
                        );
                        RenderUtil.method11455((float) (var6 - var4.getStringWidth(this.field23833) - 80), (float) (var7 - 120), 50.0F, 100.0F, this.field23834);
                        RenderUtil.drawString(
                                var4, (float) (var6 - var4.getStringWidth(this.field23833) - 20), (float) (var7 - var4.getHeight(this.field23833) - 60), this.field23833, -1
                        );
                    }
                }
            }
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mojang.datafixers.util.Pair;
import mapped.RenderUtil;
import org.newdawn.slick.opengl.Texture;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.network.play.server.SEntityEquipmentPacket;
import net.minecraft.network.play.server.SRespawnPacket;

import java.io.IOException;

public class Murderer extends Module {
    public String murdererName = "IBreakerman";
    private Texture texture;
    private boolean showTexture = true;
    private boolean isMurdererDetected;

    public Murderer() {
        super(ModuleCategory.MISC, "Murderer", "Detects murderer in murder mystery minigame on Hypixel");
        this.registerSetting(new BooleanSetting("GUI", "Shows a GUI with info on the murderer", true));
        this.registerSetting(new BooleanSetting("Chat Message", "Sends a message with the murderer's name", true));
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) throws IOException {
        if (this.isEnabled()) {
            if (event.getPacket() instanceof SEntityEquipmentPacket) {
                SEntityEquipmentPacket packet = (SEntityEquipmentPacket) event.getPacket();

                for (Pair<EquipmentSlotType, ItemStack> pair : packet.func_241790_c_()) {
                    if (pair.getSecond() != null && pair.getSecond().getItem() instanceof SwordItem &&
                            mc.world.getEntityByID(packet.getEntityID()) instanceof PlayerEntity) {
                        Entity entity = mc.world.getEntityByID(packet.getEntityID());
                        String entityName = entity.getName().getString();

                        if (!this.murdererName.equalsIgnoreCase(entityName)) {
                            if (this.getBooleanValueFromSettingName("Chat Message")) {
                                mc.player.method5389("Murderer is " + entityName + ", detected by Jello client");
                            }

                            this.murdererName = entityName;
                            this.showTexture = true;
                            this.isMurdererDetected = true;
                        }
                    }
                }
            }

            if (event.getPacket() instanceof SRespawnPacket) {
                this.isMurdererDetected = false;
            }
        }
    }

    @EventTarget
    private void onRender(EventRender event) throws IOException {
        if (this.isEnabled() && this.isMurdererDetected) {
            if (this.getBooleanValueFromSettingName("GUI")) {
                TrueTypeFont fontResource = ResourceRegistry.JelloLightFont20;
                int screenWidth = Minecraft.getInstance().mainWindow.getWidth();
                int screenHeight = Minecraft.getInstance().mainWindow.getHeight();

                if (this.showTexture && this.texture != null) {
                    this.showTexture = false;
                }

                if (this.texture != null) {
                    RenderUtil.drawRect(
                            (float) (screenWidth - fontResource.getWidth(this.murdererName) - 90),
                            (float) (screenHeight - 130),
                            (float) (screenWidth - 10),
                            (float) (screenHeight - 10),
                            1342177280
                    );
                    RenderUtil.method11455(
                            (float) (screenWidth - fontResource.getWidth(this.murdererName) - 80),
                            (float) (screenHeight - 120),
                            50.0F,
                            100.0F,
                            this.texture
                    );
                    RenderUtil.drawString(
                            fontResource,
                            (float) (screenWidth - fontResource.getWidth(this.murdererName) - 20),
                            (float) (screenHeight - fontResource.getHeight(this.murdererName) - 60),
                            this.murdererName,
                            -1
                    );
                }
            }
        }
    }
}

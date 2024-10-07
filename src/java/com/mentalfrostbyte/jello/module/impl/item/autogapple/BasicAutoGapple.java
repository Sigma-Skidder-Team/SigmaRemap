package com.mentalfrostbyte.jello.module.impl.item.autogapple;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.StopUseItemEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.item.AutoGapple;
import mapped.KeyBinding;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SEntityMetadataPacket;
import net.minecraft.util.Hand;

public class BasicAutoGapple extends Module {
    private int currentGappleSlot = -1;
    private int hotbarSwitchDelay;
    private int tickCounter;

    public BasicAutoGapple() {
        super(ModuleCategory.PLAYER, "Basic", "Basic AutoGapple");
    }

    @Override
    public void onEnable() {
        this.currentGappleSlot = -1;
        this.tickCounter = 20;
    }

    @EventTarget
    public void onStopUseItem(StopUseItemEvent event) {
        if (this.isEnabled()) {
            if (this.currentGappleSlot >= 0) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onKeyPress(EventKeyPress event) {
        if (this.isEnabled()) {
            int hotbarLength = mc.gameSettings.keyBindsHotbar.length;

            for (int i = 0; i < hotbarLength; i++) {
                KeyBinding hotbarKey = mc.gameSettings.keyBindsHotbar[i];
                String keyDescription = hotbarKey.getKeyDescription();
                int keyIndex = Integer.parseInt(String.valueOf(keyDescription.charAt(keyDescription.length() - 1)));
                if (event.getKey() == hotbarKey.inputMappingsInput.keyCode && keyIndex - 1 != mc.player.inventory.currentItem) {
                    this.currentGappleSlot = -1;
                    this.tickCounter = 0;
                    break;
                }
            }
        }
    }

    @EventTarget
    public void onTick(TickEvent event) {
        if (this.isEnabled()) {
            if (this.tickCounter < 20) {
                this.tickCounter++;
            }

            int gappleSlot = -1;
            if (mc.player.getHealth() <= this.access().getNumberValueBySettingName("Health") * 2.0F) {
                gappleSlot = ((AutoGapple) this.access()).findGappleSlot(false);
                if (this.currentGappleSlot == -1 && this.tickCounter >= 20 && gappleSlot != -1) {
                    this.currentGappleSlot = 0;
                    this.tickCounter = 0;
                }
            }

            if (gappleSlot >= 0 || this.currentGappleSlot != -1) {
                if (this.currentGappleSlot >= 0) {
                    this.currentGappleSlot++;
                    if (this.currentGappleSlot != 1) {
                        if (this.currentGappleSlot > 1
                                && mc.player.getHeldItem(Hand.MAIN_HAND).getItem() != Items.GOLDEN_APPLE
                                && mc.player.getHeldItem(Hand.MAIN_HAND).getItem() != Items.ENCHANTED_GOLDEN_APPLE) {
                            mc.player.inventory.currentItem = this.hotbarSwitchDelay;
                            this.hotbarSwitchDelay = -1;
                            this.currentGappleSlot = -1;
                        }
                    } else {
                        this.hotbarSwitchDelay = mc.player.inventory.currentItem;
                        mc.player.inventory.currentItem = gappleSlot;
                        mc.playerController.syncCurrentPlayItem();
                        mc.playerController.processRightClick(mc.player, mc.world, Hand.MAIN_HAND);
                    }
                }
            }
        }
    }

    @EventTarget
    public void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled() && this.currentGappleSlot > 1) {
            IPacket<?> packet = event.getPacket();
            if (packet instanceof SEntityMetadataPacket) {
                SEntityMetadataPacket metadataPacket = (SEntityMetadataPacket) packet;
                if (metadataPacket.getEntityId() == mc.player.getEntityId()) {
                    for (EntityDataManager.DataEntry<?> dataEntry : metadataPacket.getDataManagerEntries()) {
                        DataParameter<?> parameter = dataEntry.getKey();
                        if (parameter.getId() == 14) {
                            mc.player.inventory.currentItem = this.hotbarSwitchDelay;
                            this.hotbarSwitchDelay = -1;
                            this.currentGappleSlot = -1;
                        }
                    }
                }
            }
        }
    }
}

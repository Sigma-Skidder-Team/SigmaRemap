package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import mapped.InvManagerUtils;
import mapped.InventoryScreen;
import net.minecraft.item.Item;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class AutoSoup extends Module {
    private int refillDelay;
    private int refillCounter;
    private int soupSlot;
    private int currentItem;
    private boolean isRefilling;
    private boolean isInventoryOpen;

    public AutoSoup() {
        super(ModuleCategory.ITEM, "AutoSoup", "Automatically eats soup when low life");
        this.registerSetting(new NumberSetting<Float>("Health", "Minimum health before eating soup", 13.0F, Float.class, 1.0F, 19.0F, 1.0F));
        this.registerSetting(new NumberSetting<Float>("Refill delay", "Refill delay", 4.0F, Float.class, 0.0F, 8.0F, 1.0F));
        this.registerSetting(new NumberSetting<Float>("Refill accuracy", "Refill accuracy", 100.0F, Float.class, 30.0F, 100.0F, 1.0F));
        this.registerSetting(new ModeSetting("Refill mode", "Refill mode", 0, "Basic", "FakeInv", "OpenInv"));
        this.registerSetting(new ModeSetting("Soup mode", "Soup Mode", 0, "Instant", "Legit"));
        this.registerSetting(new ModeSetting("Bowls", "Bowls managing", 0, "Drop", "Stack"));
    }

    @Override
    public void onEnable() {
        this.refillDelay = (int) this.getNumberValueBySettingName("Refill delay");
        this.refillCounter = (int) this.getNumberValueBySettingName("Refill delay");
        this.isRefilling = false;
        this.isInventoryOpen = false;
        this.currentItem = -1;
    }

    @EventTarget
    private void onUpdate(EventUpdate event) {
        if (this.isEnabled() && event.isPre()) {
            this.refillDelay++;
            this.refillCounter++;
            String refillMode = this.getStringSettingValueByName("Refill mode");
            if (!this.isRefilling) {
                if (this.getItemCount(Items.field37837) == 0) { // field37837 is Mushroom Soup -Away
                    if (refillMode.equals("OpenInv") && !(mc.currentScreen instanceof InventoryScreen)) {
                        return;
                    }
                    if (this.getItemCount(Items.field37837) > 0 && this.refillDelay > 3) { // field37837 is Mushroom Soup -Away
                        this.refillItems();
                    }
                    return;
                }
            } else if (refillMode.equals("OpenInv") && !(mc.currentScreen instanceof InventoryScreen)) {
                this.isRefilling = false;
            } else if (this.getItemCount(Items.AIR) != 0) {
                this.useSoup();
            } else {
                this.isRefilling = false;
                this.isInventoryOpen = false;
            }

            this.eatSoup();
        }
    }

    @EventTarget
    private void onSendPacket(SendPacketEvent event) {
        if (this.isEnabled()) {
            if (this.isInventoryOpen && event.getPacket() instanceof CClientStatusPacket) {
                CClientStatusPacket packet = (CClientStatusPacket) event.getPacket();
                if (packet.getStatus() == CClientStatusPacket.State.OPEN_INVENTORY) {
                    event.setCancelled(true);
                }
            }
        }
    }

    private void refillItems() {
        this.isRefilling = true;
        if (this.getStringSettingValueByName("Refill mode").equals("FakeInv") && !(mc.currentScreen instanceof InventoryScreen)) {
            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
            this.isInventoryOpen = true;
        }

        if (this.getStringSettingValueByName("Bowls").equals("Stack")) {
            int count = this.getItemCount(Items.field37836); // field37836 is "Bowl" -Away
            if (count > 0) {
                int slot = this.findEmptySlot(count);
                if (slot > 0) {
                    InvManagerUtils.fixedClick(mc.player.container.windowId, slot, 0, ClickType.PICKUP, mc.player, true);
                    InvManagerUtils.fixedClick(mc.player.container.windowId, slot, 0, ClickType.QUICK_MOVE_ALL, mc.player, true);
                    InvManagerUtils.fixedClick(mc.player.container.windowId, slot, 0, ClickType.PICKUP, mc.player, true);
                    this.refillCounter = -5;
                }
            }
        }

        this.refillDelay = 9;
    }

    private void useSoup() {
        int refillDelaySetting = (int) this.getNumberValueBySettingName("Refill delay");
        if (this.refillCounter >= refillDelaySetting && Client.getInstance().getPlayerTracker().getMode() >= refillDelaySetting) {
            while (this.refillDelay < 36) {
                boolean wasRefilled = false;
                if (InvManagerUtils.method25866(this.refillDelay).getItem() == Items.field37837 // field37837 is Mushroom Soup -Away
                        && Math.random() * 100.0 > (double) this.getNumberValueBySettingName("Refill accuracy")) {
                    InvManagerUtils.fixedClick(mc.player.container.windowId, this.refillDelay, 0, ClickType.QUICK_MOVE, mc.player, true);
                    this.refillCounter = 0;
                    wasRefilled = true;
                }

                this.refillDelay++;
                if (this.getItemCount(Items.AIR) != 0) {
                    if (!wasRefilled || refillDelaySetting <= 0) {
                        continue;
                    }
                    break;
                }

                this.isRefilling = false;
                this.isInventoryOpen = false;
                break;
            }

            if (this.refillDelay > 35) {
                this.isRefilling = false;
            }
        }
    }

    private void eatSoup() {
        int soupSlotIndex = -1;

        for (int i = 36; i < 45; i++) {
            if (mc.player.container.getSlot(i).getStack().getItem() == Items.field37837 // field37837 is Mushroom Soup -Away
                    && Client.getInstance().getSlotChangeTracker().method33238(i) > 100L) {
                soupSlotIndex = i - 36;
                break;
            }
        }

        boolean dropBowls = this.getStringSettingValueByName("Bowls").equals("Drop");
        if (!this.getStringSettingValueByName("Soup mode").equals("Instant")) {
            if (this.currentItem >= 0) {
                if (dropBowls) {
                    mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.DROP_ITEM, BlockPos.ZERO, Direction.DOWN));
                }

                mc.player.inventory.currentItem = this.currentItem;
                mc.playerController.syncCurrentPlayItem();
                this.refillDelay = 0;
                this.currentItem = -1;
            } else {
                if (soupSlotIndex < 0 || this.refillDelay <= 3 || mc.player.getHealth() > this.getNumberValueBySettingName("Health")) {
                    return;
                }

                this.currentItem = mc.player.inventory.currentItem;
                mc.player.inventory.currentItem = soupSlotIndex;
                mc.playerController.syncCurrentPlayItem();
                mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.OFF_HAND));
                mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
            }
        } else {
            if (soupSlotIndex < 0 || this.refillDelay <= 3 || mc.player.getHealth() > this.getNumberValueBySettingName("Health")) {
                return;
            }

            mc.getConnection().sendPacket(new CHeldItemChangePacket(soupSlotIndex));
            mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.OFF_HAND));
            mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
            if (dropBowls) {
                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.DROP_ITEM, BlockPos.ZERO, Direction.DOWN));
            }

            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            this.refillDelay = 0;
        }
    }

    private int findEmptySlot(int itemCount) {
        ItemStack stack = InvManagerUtils.method25866(13);
        if (stack.getItem() == Items.field37836 && stack.getCount() <= 64 - itemCount) { // field37836 is "Bowl" -Away
            return 13;
        } else {
            for (int i = 0; i < 36; i++) {
                if (InvManagerUtils.method25866(i).getItem() == Items.field37836) { // field37836 is "Bowl" -Away
                    return i;
                }
            }
            return -1;
        }
    }

    private int getItemCount(Item item) {
        int count = 0;
        for (int i = 0; i < 36; i++) {
            if (InvManagerUtils.method25866(i).getItem() == item) {
                count += InvManagerUtils.method25866(i).getCount();
            }
        }
        return count;
    }

    private int getItemCountInHotbar(Item item) {
        int count = 0;
        for (int i = 36; i < 45; i++) {
            if (mc.player.container.getSlot(i).getStack().getItem() == item) {
                count += mc.player.container.getSlot(i).getStack().getCount();
            }
        }
        return count;
    }
}

package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import mapped.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.network.play.client.CEntityActionPacket;

public class AutoArmor extends Module {
    static boolean armorEquipped;
    private boolean elytraActive;
    private boolean jumpingLastTick;
    private final TimerUtil timer = new TimerUtil();
    private boolean inventoryOpen;

    public AutoArmor() {
        super(ModuleCategory.ITEM, "AutoArmor", "Automatically equips your armor");
        registerSetting(new BooleanSetting("Fake Items", "Bypass for fake items (AAC).", false));
        registerSetting(new NumberSetting<Float>("Delay", "Inventory clicks delay", 0.3F, Float.class, 0.0F, 1.0F, 0.01F));
        registerSetting(new ModeSetting("Mode", "Movement mode for armor in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
        registerSetting(new ModeSetting("Elytra", "Elytra Equip Mode", 0, "Ignore", "Equip", "On Use"));
    }

    @Override
    public void onEnable() {
        if (!timer.isEnabled()) {
            timer.start();
        }
        inventoryOpen = mc.currentScreen instanceof InventoryScreen;
        armorEquipped = false;
    }

    @Override
    public void onDisable() {
        armorEquipped = false;
    }

    @EventTarget
    @HigherPriority
    public void onTick(TickEvent event) {
        if (isEnabled()) {
            if (!timer.isEnabled()) {
                timer.start();
            }

            if (!getStringSettingValueByName("Mode").equals("OpenInv") || mc.currentScreen instanceof InventoryScreen) {
                long delay = (long) (getNumberValueBySettingName("Delay") * 1000.0F);
                String elytraMode = getStringSettingValueByName("Elytra");

                switch (elytraMode) {
                    case "Ignore":
                        elytraActive = false;
                        break;
                    case "Equip":
                        elytraActive = true;
                        break;
                    case "On Use":
                        elytraActive = !mc.player.onGround && mc.player.isJumping && !jumpingLastTick;
                        break;
                }
                jumpingLastTick = mc.player.isJumping;

                if (mc.currentScreen instanceof InventoryScreen) {
                    inventoryOpen = false;
                }

                if ((mc.currentScreen == null || mc.currentScreen instanceof InventoryScreen || mc.currentScreen instanceof ChatScreen)
                        && timer.getElapsedTime() > delay
                        && (float) Client.getInstance().getPlayerTracker().getMode() > (float) delay / 50.0F) {
                    armorEquipped = false;
                    handleArmorMovement(getStringSettingValueByName("Mode").equalsIgnoreCase("FakeInv"));
                }

                for (EquipmentSlotType slot : EquipmentSlotType.values()) {
                    if (mc.player.container.getSlot(8 - slot.getIndex()).getHasStack()) {
                        if (InvManagerUtils.isArmor(8 - slot.getIndex())) {
                            return;
                        }
                    } else if (isArmorInInventory(slot)) {
                        return;
                    }
                }

                if (!inventoryOpen && !(mc.currentScreen instanceof InventoryScreen) && timer.getElapsedTime() > 0L) {
                    inventoryOpen = true;
                    mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                }
            }
        }
    }

    private void handleArmorMovement(boolean fakeInventory) {
        for (EquipmentSlotType slot : EquipmentSlotType.values()) {
            if (mc.player.container.getSlot(8 - slot.getIndex()).getHasStack()) {
                ItemStack currentArmor = mc.player.container.getSlot(8 - slot.getIndex()).getStack();
                if (InvManagerUtils.isBestArmorPiece(currentArmor) && (!elytraActive || slot != EquipmentSlotType.CHEST)) {
                    continue;
                }
            }

            for (int index = 9; index < 45; index++) {
                if (mc.player.container.getSlot(index).getHasStack()) {
                    ItemStack itemStack = mc.player.container.getSlot(index).getStack();
                    if (itemStack.getItem() instanceof Class3256 && elytraActive
                            && !(mc.player.inventory.getStackInSlot(36 + EquipmentSlotType.CHEST.getIndex()).getItem() instanceof Class3256)) {
                        Class3256 item = (Class3256) itemStack.getItem();
                        if (EquipmentSlotType.CHEST == slot
                                && (!Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getBooleanValueFromSettingName("Fake Items")
                                || Client.getInstance().getSlotChangeTracker().method33238(index) >= 1500L)) {
                            processArmorClick(fakeInventory);
                            if (!(mc.player.inventory.getStackInSlot(36 + slot.getIndex()).getItem() instanceof Class3280)) {
                                InvManagerUtils.click(8 - slot.getIndex(), 0, true);
                            }
                            InvManagerUtils.fixedClick(mc.player.container.windowId, index, 0, ClickType.QUICK_MOVE, mc.player, true);
                            timer.reset();
                            armorEquipped = true;

                            if (getStringSettingValueByName("Elytra").equals("On Use")) {
                                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.START_FALL_FLYING));
                                mc.player.setFlag(7, true);
                            }
                            if (getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    } else if (itemStack.getItem() instanceof ArmorItem && !elytraActive) {
                        ArmorItem armorItem = (ArmorItem) itemStack.getItem();
                        if (armorItem.getType() == slot
                                && InvManagerUtils.isBestArmorPiece(itemStack)
                                && InvManagerUtils.getArmorProtectionValue(itemStack) > 0
                                && (!Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getBooleanValueFromSettingName("Fake Items")
                                || Client.getInstance().getSlotChangeTracker().method33238(index) >= 1500L)) {
                            processArmorClick(fakeInventory);
                            Item equippedItem = mc.player.inventory.getStackInSlot(36 + armorItem.getType().getIndex()).getItem();
                            if (!(equippedItem instanceof Class3256)) {
                                if (!(equippedItem instanceof Class3280)) {
                                    InvManagerUtils.method25871(8 - armorItem.getType().getIndex());
                                }
                            } else {
                                InvManagerUtils.click(8 - slot.getIndex(), 0, true);
                            }
                            InvManagerUtils.fixedClick(mc.player.container.windowId, index, 0, ClickType.QUICK_MOVE, mc.player, true);
                            timer.reset();
                            armorEquipped = true;

                            if (Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void processArmorClick(boolean fakeInventory) {
        if (fakeInventory && inventoryOpen && !(mc.currentScreen instanceof InventoryScreen)) {
            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
            inventoryOpen = false;
        }
    }

    private boolean isArmorInInventory(EquipmentSlotType slot) {
        for (int index = 9; index < 45; index++) {
            if (mc.player.container.getSlot(index).getHasStack()) {
                ItemStack itemStack = mc.player.container.getSlot(index).getStack();
                Item item = itemStack.getItem();
                if (item instanceof ArmorItem) {
                    ArmorItem armorItem = (ArmorItem) item;
                    if (slot == armorItem.getType()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

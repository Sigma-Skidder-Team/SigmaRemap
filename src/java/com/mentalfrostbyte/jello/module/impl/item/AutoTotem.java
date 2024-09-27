package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class AutoTotem extends Module {
    public int previousSlot = -1;

    public AutoTotem() {
        super(ModuleCategory.ITEM, "AutoTotem", "Automatically equips a totem in your second hand");
    }

    @EventTarget
    private void onTick(TickEvent var1) {
        this.equipTotem();
    }

    @EventTarget
    private void onUpdate(EventUpdate var1) {
        if (!var1.isPre()) {
            this.equipTotem();
        }
    }

    @Override
    public String getSuffix() {
        return this.getName();
    }

    private void equipTotem() {
        if (this.isEnabled() && mc.player != null && !mc.player.abilities.isCreativeMode) {
            ItemStack offHandItem = mc.player.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
            if (offHandItem.getItem() != Items.TOTEM_OF_UNDYING) {
                int totemSlot = InvManagerUtils.findItemSlot(Items.TOTEM_OF_UNDYING);
                if (totemSlot != -1) {
                    mc.playerController.windowClick(0, totemSlot >= 9 ? totemSlot : totemSlot + 36, 0, ClickType.PICKUP, mc.player);
                    mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, mc.player);
                    mc.playerController.windowClick(0, totemSlot >= 9 ? totemSlot : totemSlot + 36, 0, ClickType.PICKUP, mc.player);
                }
            }
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class AutoTotem extends Module {
    public int field23503 = -1;

    public AutoTotem() {
        super(ModuleCategory.ITEM, "AutoTotem", "Automatically equips a totem in your second hand");
    }

    @EventTarget
    private void method16175(TickEvent var1) {
        this.method16177();
    }

    @EventTarget
    private void method16176(EventUpdate var1) {
        if (!var1.isPre()) {
            this.method16177();
        }
    }

    @Override
    public String getSuffix() {
        return this.getName();
    }

    private void method16177() {
        if (this.isEnabled() && mc.player != null && !mc.player.abilities.isCreativeMode) {
            ItemStack var3 = mc.player.getItemStackFromSlot(EquipmentSlotType.field13732);
            if (var3.getItem() != Items.field38126) {
                int var4 = InvManagerUtils.method25822(Items.field38126);
                if (var4 != -1) {
                    mc.playerController.windowClickFixed(0, var4 >= 9 ? var4 : var4 + 36, 0, ClickType.field14694, mc.player);
                    mc.playerController.windowClickFixed(0, 45, 0, ClickType.field14694, mc.player);
                    mc.playerController.windowClickFixed(0, var4 >= 9 ? var4 : var4 + 36, 0, ClickType.field14694, mc.player);
                }
            }
        }
    }
}

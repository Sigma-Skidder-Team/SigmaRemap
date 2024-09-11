package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import mapped.*;
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
    private int field23428;
    private int field23429;
    private int field23430;
    private int field23431;
    private boolean field23432;
    private boolean field23433;

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
        this.field23428 = (int) this.getNumberValueBySettingName("Refill delay");
        this.field23431 = (int) this.getNumberValueBySettingName("Refill delay");
        this.field23432 = false;
        this.field23433 = false;
        this.field23430 = -1;
    }

    @EventTarget
    private void method16057(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23428++;
            this.field23431++;
            String var4 = this.getStringSettingValueByName("Refill mode");
            if (!this.field23432) {
                if (this.method16063(Items.field37837) == 0) {
                    if (var4.equals("OpenInv") && !(mc.currentScreen instanceof InventoryScreen)) {
                        return;
                    }

                    if (this.method16064(Items.field37837) > 0 && this.field23428 > 3) {
                        this.method16059();
                    }

                    return;
                }
            } else if (var4.equals("OpenInv") && !(mc.currentScreen instanceof InventoryScreen)) {
                this.field23432 = false;
            } else if (this.method16063(Items.field37222) != 0) {
                this.method16060();
            } else {
                this.field23432 = false;
                this.field23433 = false;
            }

            this.method16061();
        }
    }

    @EventTarget
    private void method16058(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (this.field23433 && var1.getPacket() instanceof CClientStatusPacket) {
                CClientStatusPacket var4 = (CClientStatusPacket) var1.getPacket();
                if (var4.getStatus() == CClientStatusPacketState.field14279) {
                    var1.setCancelled(true);
                }
            }
        }
    }

    private void method16059() {
        this.field23432 = true;
        if (this.getStringSettingValueByName("Refill mode").equals("FakeInv")
                && !(mc.currentScreen instanceof InventoryScreen)
                && JelloPortal.method27349() <= ViaVerList.field26136.method18582()) {
            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
            this.field23433 = true;
        }

        if (this.getStringSettingValueByName("Bowls").equals("Stack")) {
            int var3 = this.method16063(Items.field37836);
            if (var3 > 0) {
                int var4 = this.method16062(var3);
                if (var4 > 0) {
                    InvManagerUtils.fixedClick(mc.player.container.field25471, var4, 0, ClickType.field14694, mc.player, true);
                    InvManagerUtils.fixedClick(mc.player.container.field25471, var4, 0, ClickType.field14700, mc.player, true);
                    InvManagerUtils.fixedClick(mc.player.container.field25471, var4, 0, ClickType.field14694, mc.player, true);
                    this.field23431 = -5;
                }
            }
        }

        this.field23429 = 9;
    }

    private void method16060() {
        int var3 = (int) this.getNumberValueBySettingName("Refill delay");
        if (this.field23431 >= var3 && Client.getInstance().getPlayerTracker().method31333() >= var3) {
            while (this.field23429 < 36) {
                boolean var4 = false;
                if (InvManagerUtils.method25866(this.field23429).getItem() == Items.field37837
                        && Math.random() * 100.0 > (double) this.getNumberValueBySettingName("Refill accuracy")) {
                    InvManagerUtils.fixedClick(mc.player.container.field25471, this.field23429, 0, ClickType.field14695, mc.player, true);
                    this.field23431 = 0;
                    var4 = true;
                }

                this.field23429++;
                if (this.method16063(Items.field37222) != 0) {
                    if (!var4 || var3 <= 0) {
                        continue;
                    }
                    break;
                }

                this.field23432 = false;
                this.field23433 = false;
                break;
            }

            if (this.field23429 > 35) {
                this.field23432 = false;
            }
        }
    }

    private void method16061() {
        int var3 = -1;

        for (int var4 = 36; var4 < 45; var4++) {
            if (mc.player.container.getSlot(var4).getStack().getItem() == Items.field37837
                    && Client.getInstance().getSlotChangeTracker().method33238(var4) > 100L) {
                var3 = var4 - 36;
                break;
            }
        }

        boolean var5 = this.getStringSettingValueByName("Bowls").equals("Drop");
        if (!this.getStringSettingValueByName("Soup mode").equals("Instant")) {
            if (this.field23430 >= 0) {
                if (var5) {
                    mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.DROP_ITEM, BlockPos.ZERO, Direction.DOWN));
                }

                mc.player.inventory.currentItem = this.field23430;
                mc.playerController.syncCurrentPlayItem();
                this.field23428 = 0;
                this.field23430 = -1;
            } else {
                if (var3 < 0 || this.field23428 <= 3 || mc.player.getHealth() > this.getNumberValueBySettingName("Health")) {
                    return;
                }

                this.field23430 = mc.player.inventory.currentItem;
                mc.player.inventory.currentItem = var3;
                mc.playerController.syncCurrentPlayItem();
                mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.field183));
                mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
            }
        } else {
            if (var3 < 0 || this.field23428 <= 3 || mc.player.getHealth() > this.getNumberValueBySettingName("Health")) {
                return;
            }

            mc.getConnection().sendPacket(new CHeldItemChangePacket(var3));
            mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.field183));
            mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
            if (var5) {
                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.DROP_ITEM, BlockPos.ZERO, Direction.DOWN));
            }

            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            this.field23428 = 0;
        }
    }

    private int method16062(int var1) {
        ItemStack var4 = InvManagerUtils.method25866(13);
        if (var4.getItem() == Items.field37836 && var4.getCount() <= 64 - var1) {
            return 13;
        } else {
            for (int var5 = 9; var5 < 36; var5++) {
                var4 = InvManagerUtils.method25866(var5);
                if (var4.getItem() == Items.field37836 && var4.getCount() <= 64 - var1) {
                    return var5;
                }
            }

            var4 = InvManagerUtils.method25866(13);
            if (var4.getItem() == Items.field37836 && var4.getCount() < 64) {
                return 13;
            } else {
                for (int var12 = 9; var12 < 36; var12++) {
                    var4 = InvManagerUtils.method25866(var12);
                    if (var4.getItem() == Items.field37836 && var4.getCount() < 64) {
                        return var12;
                    }
                }

                var4 = InvManagerUtils.method25866(13);
                if (var4.getItem() == Items.field37222) {
                    for (int var13 = 36; var13 < 45; var13++) {
                        if (mc.player.container.getSlot(var13).getStack().getItem() == Items.field37836) {
                            InvManagerUtils.moveItemToHotbar(13, var13 - 36);
                            return 13;
                        }
                    }
                }

                for (int var14 = 9; var14 < 36; var14++) {
                    var4 = InvManagerUtils.method25866(var14);
                    if (var4.getItem() == Items.field37222) {
                        for (int var6 = 36; var6 < 45; var6++) {
                            if (mc.player.container.getSlot(var6).getStack().getItem() == Items.field37836) {
                                InvManagerUtils.moveItemToHotbar(var14, var6 - 36);
                                return -1;
                            }
                        }
                    }
                }

                for (int var15 = 36; var15 < 45; var15++) {
                    if (mc.player.container.getSlot(var15).getStack().getItem() == Items.field37836) {
                        InvManagerUtils.moveItemToHotbar(13, var15 - 36);
                        return -1;
                    }
                }

                return -1;
            }
        }
    }

    private int method16063(Item var1) {
        int var4 = 0;

        for (int var5 = 36; var5 < 45; var5++) {
            if (mc.player.container.getSlot(var5).getStack().getItem() == var1) {
                var4++;
            }
        }

        return var4;
    }

    private int method16064(Item var1) {
        int var4 = 0;

        for (int var5 = 9; var5 < 36; var5++) {
            if (mc.player.container.getSlot(var5).getStack().getItem() == var1) {
                var4++;
            }
        }

        return var4;
    }
}

package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import mapped.*;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.network.play.client.CEntityActionPacket;

public class AutoArmor extends Module {
    public static boolean field23798;
    public boolean field23799 = false;
    public boolean field23800 = false;
    private final TimerUtil timer = new TimerUtil();
    private boolean isInventoryOpen;

    public AutoArmor() {
        super(ModuleCategory.ITEM, "AutoArmor", "Automaticly equips your armor");
        this.registerSetting(new BooleanSetting("Fake Items", "Bypass for fake items (AAC).", false));
        this.registerSetting(new NumberSetting<Float>("Delay", "Inventory clicks delay", 0.3F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new ModeSetting("Mode", "The way it will move armor in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
        this.registerSetting(new ModeSetting("Elytra", "Elytra Equip Mode", 0, "Ignore", "Equip", "On Use"));
    }

    @Override
    public void onEnable() {
        if (!this.timer.isEnabled()) {
            this.timer.start();
        }

        this.isInventoryOpen = mc.currentScreen instanceof InventoryScreen;
        field23798 = false;
    }

    @Override
    public void onDisable() {
        field23798 = false;
    }

    @EventTarget
    @HigherPriority
    public void method16615(TickEvent var1) {
        if (this.isEnabled()) {
            if (!this.timer.isEnabled()) {
                this.timer.start();
            }

            if (!this.getStringSettingValueByName("Mode").equals("OpenInv") || mc.currentScreen instanceof InventoryScreen) {
                long var4 = (long) (this.getNumberValueBySettingName("Delay") * 1000.0F);
                String var6 = this.getStringSettingValueByName("Elytra");
                switch (var6) {
                    case "Ignore":
                        this.field23799 = false;
                        break;
                    case "Equip":
                        this.field23799 = true;
                        break;
                    case "On Use":
                        if (!mc.player.onGround && mc.player.field4999 == 0 && mc.player.field4981 && !this.field23800) {
                            this.field23799 = true;
                        } else if (mc.player.onGround) {
                            this.field23799 = false;
                        }
                }

                this.field23800 = mc.player.field4981;
                if (mc.currentScreen instanceof InventoryScreen) {
                    this.isInventoryOpen = false;
                }

                if ((mc.currentScreen == null || mc.currentScreen instanceof InventoryScreen || mc.currentScreen instanceof ChatScreen)
                        && this.timer.method27121() > var4
                        && (float) Client.getInstance().method19939().method31333() > (float) var4 / 50.0F) {
                    field23798 = false;
                    this.method16616(this.getStringSettingValueByName("Mode").equalsIgnoreCase("FakeInv"));
                }

                for (Class2106 var9 : Class2106.values()) {
                    if (mc.player.field4904.method18131(8 - var9.method8773()).method18266()) {
                        if (Class7789.method25847(8 - var9.method8773())) {
                            return;
                        }
                    } else if (this.method16618(var9)) {
                        return;
                    }
                }

                if (!this.isInventoryOpen && !(mc.currentScreen instanceof InventoryScreen) && this.timer.method27121() > 0L) {
                    this.isInventoryOpen = true;
                    mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                }
            }
        }
    }

    private void method16616(boolean var1) {
        for (Class2106 var7 : Class2106.values()) {
            if (mc.player.field4904.method18131(8 - var7.method8773()).method18266()) {
                ItemStack var8 = mc.player.field4904.method18131(8 - var7.method8773()).method18265();
                if (Class7789.method25872(var8) && (!this.field23799 || var7 != Class2106.field13735)) {
                    continue;
                }
            }

            for (int var12 = 9; var12 < 45; var12++) {
                if (mc.player.field4904.method18131(var12).method18266()) {
                    ItemStack var9 = mc.player.field4904.method18131(var12).method18265();
                    if (var9.getItem() instanceof Class3256
                            && this.field23799
                            && !(mc.player.inventory.method3618(36 + Class2106.field13735.method8773()).getItem() instanceof Class3256)) {
                        Class3256 var13 = (Class3256) var9.getItem();
                        if (Class2106.field13735 == var7
                                && (
                                !Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getBooleanValueFromSetttingName("Fake Items")
                                        || Client.getInstance().getSlotChangeTracker().method33238(var12) >= 1500L
                        )) {
                            this.method16617(var1);
                            if (!(mc.player.inventory.method3618(36 + var7.method8773()).getItem() instanceof Class3280)) {
                                Class7789.method25826(8 - var7.method8773(), 0, true);
                            }

                            Class7789.method25870(mc.player.field4904.field25471, var12, 0, ClickType.field14695, mc.player, true);
                            this.timer.method27120();
                            field23798 = true;
                            if (this.getStringSettingValueByName("Elytra").equals("On Use")) {
                                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.START_FALL_FLYING));
                                mc.player.method3349(7, true);
                            }

                            if (Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    } else if (var9.getItem() instanceof Class3279 && !this.field23799) {
                        Class3279 var10 = (Class3279) var9.getItem();
                        if (var10.method11805() == var7
                                && Class7789.method25872(var9)
                                && Class7789.method25850(var9) > 0
                                && (
                                !Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getBooleanValueFromSetttingName("Fake Items")
                                        || Client.getInstance().getSlotChangeTracker().method33238(var12) >= 1500L
                        )) {
                            this.method16617(var1);
                            Item var11 = mc.player.inventory.method3618(36 + var10.method11805().method8773()).getItem();
                            if (!(var11 instanceof Class3256)) {
                                if (!(var11 instanceof Class3280)) {
                                    Class7789.method25871(8 - var10.method11805().method8773());
                                }
                            } else {
                                Class7789.method25826(8 - var7.method8773(), 0, true);
                            }

                            Class7789.method25870(mc.player.field4904.field25471, var12, 0, ClickType.field14695, mc.player, true);
                            this.timer.method27120();
                            field23798 = true;
                            if (Client.getInstance().getModuleManager().getModuleByClass(AutoArmor.class).getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void method16617(boolean var1) {
        if (var1 && this.isInventoryOpen && !(mc.currentScreen instanceof InventoryScreen) && JelloPortal.method27349() <= ViaVerList.field26136.method18582()) {
            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
            this.isInventoryOpen = false;
        }
    }

    private boolean method16618(Class2106 var1) {
        for (int var4 = 9; var4 < 45; var4++) {
            if (mc.player.field4904.method18131(var4).method18266()) {
                ItemStack var5 = mc.player.field4904.method18131(var4).method18265();
                Item var6 = var5.getItem();
                if (var6 instanceof Class3279) {
                    Class3279 var7 = (Class3279) var6;
                    if (var1 == var7.method11805()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

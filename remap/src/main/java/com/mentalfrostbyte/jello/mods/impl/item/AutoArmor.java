// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;

public class AutoArmor extends Module
{
    private Class7617 field15964;
    private boolean field15965;
    public static boolean field15966;
    public boolean field15967;
    public boolean field15968;
    
    public AutoArmor() {
        super(Category.ITEM, "AutoArmor", "Automaticly equips your armor");
        this.field15964 = new Class7617();
        this.field15967 = false;
        this.field15968 = false;
        this.addSetting(new BooleanSetting("Fake Items", "Bypass for fake items (AAC).", false));
        this.addSetting(new NumberSetting("Delay", "Inventory clicks delay", 0.3f, Float.class, 0.0f, 1.0f, 0.01f));
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Basic", "OpenInv", "FakeInv" }));
        this.addSetting(new StringSetting("Elytra", "Elytra Equip Mode", 0, new String[] { "Ignore", "Equip", "On Use" }));
    }
    
    @Override
    public void onEnable() {
        if (!this.field15964.method23937()) {
            this.field15964.method23932();
        }
        this.field15965 = (AutoArmor.mc.currentScreen instanceof Class518);
        AutoArmor.field15966 = false;
    }
    
    @Override
    public void onDisable() {
        AutoArmor.field15966 = false;
    }
    
    @EventListener
    @Class6757
    public void method10601(final Class5743 class5743) {
        if (!this.isEnabled()) {
            return;
        }
        if (!this.field15964.method23937()) {
            this.field15964.method23932();
        }
        if (this.getStringSettingValueByName("Mode").equals("OpenInv") && !(AutoArmor.mc.currentScreen instanceof Class518)) {
            return;
        }
        final long n = (long)(this.getNumberSettingValueByName("Delay") * 1000.0f);
        final String method9887 = this.getStringSettingValueByName("Elytra");
        switch (method9887) {
            case "Ignore": {
                this.field15967 = false;
                break;
            }
            case "Equip": {
                this.field15967 = true;
                break;
            }
            case "On Use": {
                if (!AutoArmor.mc.player.onGround && AutoArmor.mc.player.field2985 == 0 && AutoArmor.mc.player.field2967 && !this.field15968) {
                    this.field15967 = true;
                    break;
                }
                if (AutoArmor.mc.player.onGround) {
                    this.field15967 = false;
                    break;
                }
                break;
            }
        }
        this.field15968 = AutoArmor.mc.player.field2967;
        if (AutoArmor.mc.currentScreen instanceof Class518) {
            this.field15965 = false;
        }
        if ((AutoArmor.mc.currentScreen == null || AutoArmor.mc.currentScreen instanceof Class518 || AutoArmor.mc.currentScreen instanceof ChatScreen) && this.field15964.method23935() > n) {
            AutoArmor.field15966 = false;
            this.method10602(this.getStringSettingValueByName("Mode").equalsIgnoreCase("FakeInv"));
        }
        for (final Class2215 class5744 : Class2215.values()) {
            if (AutoArmor.mc.player.container.getSlot(8 - class5744.getIndex()).method20054()) {
                if (InvManagerUtil.method29344(8 - class5744.getIndex())) {
                    return;
                }
            }
            else if (this.method10604(class5744)) {
                return;
            }
        }
        if (!this.field15965 && !(AutoArmor.mc.currentScreen instanceof Class518) && this.field15964.method23935() > 0L) {
            this.field15965 = true;
            AutoArmor.mc.method5269().method17292(new Class4389(-1));
        }
    }
    
    private void method10602(final boolean b) {
        for (final Class2215 class2215 : Class2215.values()) {
            Label_0107: {
                if (AutoArmor.mc.player.container.getSlot(8 - class2215.getIndex()).method20054()) {
                    if (InvManagerUtil.method29369(AutoArmor.mc.player.container.getSlot(8 - class2215.getIndex()).method20053())) {
                        if (!this.field15967) {
                            break Label_0107;
                        }
                        if (class2215 != Class2215.field13604) {
                            break Label_0107;
                        }
                    }
                }
                for (int j = 9; j < 45; ++j) {
                    if (AutoArmor.mc.player.container.getSlot(j).method20054()) {
                        final ItemStack method20053 = AutoArmor.mc.player.container.getSlot(j).method20053();
                        if (method20053.getItem() instanceof Class4080) {
                            if (this.field15967) {
                                if (!(AutoArmor.mc.player.inventory.getStackInSlot(36 + Class2215.field13604.getIndex()).getItem() instanceof Class4080)) {
                                    final Class4080 class2216 = (Class4080)method20053.getItem();
                                    if (Class2215.field13604 == class2215) {
                                        if (!Client.getInstance().method35189().getModuleByClass(AutoArmor.class).method9883("Fake Items") || Client.getInstance().method35195().method28162(j) >= 1500L) {
                                            this.method10603(b);
                                            if (!(AutoArmor.mc.player.inventory.getStackInSlot(36 + class2215.getIndex()).getItem() instanceof AirBlock)) {
                                                InvManagerUtil.method29323(8 - class2215.getIndex(), 0, true);
                                            }
                                            InvManagerUtil.method29367(AutoArmor.mc.player.container.field16154, j, 0, Class2133.field12438, AutoArmor.mc.player, true);
                                            this.field15964.method23934();
                                            AutoArmor.field15966 = true;
                                            if (this.getStringSettingValueByName("Elytra").equals("On Use")) {
                                                AutoArmor.mc.method5269().method17292(new Class4336(AutoArmor.mc.player, Class287.field1599));
                                                AutoArmor.mc.player.setFlag(7, true);
                                            }
                                            if (Client.getInstance().method35189().getModuleByClass(AutoArmor.class).getNumberSettingValueByName("Delay") > 0.0f) {
                                                return;
                                            }
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                        if (method20053.getItem() instanceof Class4055) {
                            if (!this.field15967) {
                                final Class4055 class2217 = (Class4055)method20053.getItem();
                                if (class2217.method12257() == class2215) {
                                    if (InvManagerUtil.method29369(method20053)) {
                                        if (InvManagerUtil.method29347(method20053) > 0) {
                                            if (!Client.getInstance().method35189().getModuleByClass(AutoArmor.class).method9883("Fake Items") || Client.getInstance().method35195().method28162(j) >= 1500L) {
                                                this.method10603(b);
                                                final Item method20054 = AutoArmor.mc.player.inventory.getStackInSlot(36 + class2217.method12257().getIndex()).getItem();
                                                if (!(method20054 instanceof Class4080)) {
                                                    if (!(method20054 instanceof AirBlock)) {
                                                        InvManagerUtil.method29368(8 - class2217.method12257().getIndex());
                                                    }
                                                }
                                                else {
                                                    InvManagerUtil.method29323(8 - class2215.getIndex(), 0, true);
                                                }
                                                System.out.println("swap" + method20054);
                                                InvManagerUtil.method29367(AutoArmor.mc.player.container.field16154, j, 0, Class2133.field12438, AutoArmor.mc.player, true);
                                                this.field15964.method23934();
                                                AutoArmor.field15966 = true;
                                                if (Client.getInstance().method35189().getModuleByClass(AutoArmor.class).getNumberSettingValueByName("Delay") > 0.0f) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10603(final boolean b) {
        if (b) {
            if (this.field15965) {
                if (!(AutoArmor.mc.currentScreen instanceof Class518)) {
                    AutoArmor.mc.method5269().method17292(new Class4323(Class2218.field13623));
                    this.field15965 = false;
                }
            }
        }
    }
    
    private boolean method10604(final Class2215 class2215) {
        for (int i = 9; i < 45; ++i) {
            if (AutoArmor.mc.player.container.getSlot(i).method20054()) {
                final Item method27622 = AutoArmor.mc.player.container.getSlot(i).method20053().getItem();
                if (method27622 instanceof Class4055) {
                    if (class2215 == ((Class4055)method27622).method12257()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

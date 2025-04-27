// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.Criticals;
import com.mentalfrostbyte.jello.mods.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutoPotion extends Module
{
    private int field15979;
    private int field15980;
    private int field15981;
    private int field15982;
    
    public AutoPotion() {
        super(Category.ITEM, "AutoPotion", "Automatically throws potion to regen or speed up");
        this.addSetting(new NumberSetting("Health", "Maximum health before healing.", 6.0f, Float.class, 0.5f, 10.0f, 0.5f));
        this.addSetting(new BooleanSetting("Predict", "Predicts where to pot when moving.", true));
        this.addSetting(new BooleanSetting("Instant", "Instant potting (more packets).", false));
        this.addSetting(new BooleanSetting("Speed", "Uses Speed pots.", true));
        this.addSetting(new BooleanSetting("Regen", "Uses Regen pots.", true));
        this.addSetting(new BooleanSetting("Custom potion", "Allow the use of custom potions", false));
        this.addSetting(new BooleanSetting("In fight", "Allows using autopot with killaura", true));
    }
    
    @Override
    public void onEnable() {
        this.field15982 = 0;
    }
    
    @EventListener
    @LowestPriority
    private void method10613(final UpdateWalkingEventI updateWalkingEvent) {
        if (!this.isEnabled() || !updateWalkingEvent.isPre()) {
            return;
        }
        if (!this.getBooleanValueFromSettingName("In fight") && (KillAura.field16061 != null || KillAura.targetEntity != null)) {
            return;
        }
        final int method10615 = this.method10615();
        ++this.field15979;
        final int[] array = { 6, -1, -1 };
        if (this.getBooleanValueFromSettingName("Regen")) {
            array[1] = 10;
        }
        if (this.getBooleanValueFromSettingName("Speed")) {
            array[2] = 1;
        }
        if (!AutoPotion.mc.player.onGround) {
            this.field15980 = 0;
        }
        else {
            ++this.field15980;
        }
        if (this.field15982 != 1) {
            if (this.field15982 >= 2) {
                AutoPotion.mc.player.inventory.field2743 = this.field15981;
                AutoPotion.mc.playerController.method27318();
                this.field15982 = 0;
            }
            if (this.field15980 > 1) {
                for (int i = 0; i < array.length; ++i) {
                    if (array[i] != -1) {
                        if (array[i] != 6 && array[i] != 10) {
                            if (this.field15979 > 60) {
                                this.method10618(updateWalkingEvent, method10615, array[i]);
                            }
                        }
                        else if (this.field15979 > 18) {
                            if (!AutoPotion.mc.player.method2653(Class5328.method16450(array[i]))) {
                                if (AutoPotion.mc.player.method2664() < this.getNumberSettingValueByName("Health") * 2.0f) {
                                    this.method10618(updateWalkingEvent, method10615, array[i]);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        ++this.field15982;
        AutoPotion.mc.method5269().method17292(new Class4307(Class316.field1877));
    }
    
    public float[] method10614() {
        final double n = AutoPotion.mc.player.posX + AutoPotion.mc.player.getMotion().x * 26.0;
        final double n2 = AutoPotion.mc.player.boundingBox.minY - 3.6;
        final double n3 = AutoPotion.mc.player.posZ + AutoPotion.mc.player.getMotion().z * 26.0;
        if (!this.getBooleanValueFromSettingName("Predict")) {
            return new float[] { AutoPotion.mc.player.rotationYaw, 90.0f };
        }
        return Class8845.method30919(n, n3, n2);
    }
    
    public int method10615() {
        int n = 5;
        for (int i = 36; i < 45; ++i) {
            if (!AutoPotion.mc.player.container.getSlot(i).method20054()) {
                n = i - 36;
                break;
            }
        }
        return n;
    }
    
    public int method10616(final int n) {
        final int n2 = 0;
        final int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        for (int i = 9; i < 45; ++i) {
            if (AutoPotion.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = AutoPotion.mc.player.container.getSlot(i).method20053();
                if (method20053.getItem() instanceof Class4089) {
                    final List<Class1948> method20054 = InvManagerUtil.method29355(method20053);
                    final int method20055 = this.method10617(method20054);
                    if (method20054 != null) {
                        if (!method20054.isEmpty()) {
                            if (this.getBooleanValueFromSettingName("Custom potion") || method20055 == 1) {
                                for (final Class1948 class1948 : method20054) {
                                    final int method20056 = Class5328.method16451(class1948.method7906());
                                    final int method20057 = class1948.method7908();
                                    final int method20058 = class1948.method7907();
                                    if (method20056 != n) {
                                        continue;
                                    }
                                    if (!InvManagerUtil.method29356(method20053)) {
                                        continue;
                                    }
                                    if (method20057 <= n2) {
                                        if (method20057 == n2 && method20058 > n3) {
                                            n4 = i;
                                            n5 = method20055;
                                        }
                                        else {
                                            if (n5 <= method20055) {
                                                continue;
                                            }
                                            if (method20057 < n2) {
                                                continue;
                                            }
                                            n5 = method20055;
                                        }
                                    }
                                    else {
                                        n4 = i;
                                        n5 = method20055;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (AutoPotion.mc.player.method2653(Class5328.method16450(n)) && AutoPotion.mc.player.method2654(Class5328.method16450(n)).method7908() >= n2) {
            return -1;
        }
        return n4;
    }
    
    private int method10617(final List<Class1948> list) {
        final ArrayList list2 = new ArrayList();
        int n = 0;
        final Iterator<Class1948> iterator = list.iterator();
        while (iterator.hasNext()) {
            final int method16451 = Class5328.method16451(iterator.next().method7906());
            if (list2.contains(method16451)) {
                continue;
            }
            ++n;
            list2.add(method16451);
        }
        return n;
    }
    
    public void method10618(final UpdateWalkingEventI updateWalkingEvent, final int n, final int n2) {
        final int method10616 = this.method10616(n2);
        if (method10616 != -1) {
            if (method10616 < 36) {
                InvManagerUtil.method29370(method10616, n);
            }
            else {
                this.field15979 = 0;
                final int field2743 = AutoPotion.mc.player.inventory.field2743;
                final boolean b = Client.getInstance().moduleManager().getModuleByClass(Criticals.class).isEnabled() && Client.getInstance().moduleManager().getModuleByClass(Criticals.class).getStringSettingValueByName("Type").equalsIgnoreCase("NoGround");
                final float[] method10617 = this.method10614();
                AutoPotion.mc.player.inventory.field2743 = method10616 - 36;
                AutoPotion.mc.playerController.method27318();
                if (!this.getBooleanValueFromSettingName("Instant")) {
                    this.field15982 = 1;
                    updateWalkingEvent.method17043(method10617[0]);
                    updateWalkingEvent.method17041(method10617[1]);
                }
                else {
                    AutoPotion.mc.method5269().method17292(new Class4356(method10617[0], method10617[1], !b && AutoPotion.mc.player.onGround));
                    AutoPotion.mc.method5269().method17292(new Class4307(Class316.field1877));
                    AutoPotion.mc.method5269().method17292(new Class4307(Class316.field1878));
                    AutoPotion.mc.player.inventory.field2743 = field2743;
                    AutoPotion.mc.playerController.method27318();
                    KillAura.field16066 = 1;
                }
                this.field15981 = field2743;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class AutoSoup extends Module
{
    private int field15721;
    private int field15722;
    private int field15723;
    private int field15724;
    private boolean field15725;
    private boolean field15726;
    
    public AutoSoup() {
        super(Category.ITEM, "AutoSoup", "Automatically eats soup when low life");
        this.addSetting(new NumberSetting("Health", "Minimum health before eating soup", 13.0f, Float.class, 1.0f, 19.0f, 1.0f));
        this.addSetting(new NumberSetting("Refill delay", "Refill delay", 4.0f, Float.class, 0.0f, 8.0f, 1.0f));
        this.addSetting(new NumberSetting("Refill accuracy", "Refill accuracy", 100.0f, Float.class, 30.0f, 100.0f, 1.0f));
        this.addSetting(new StringSetting("Refill mode", "Refill mode", 0, new String[] { "Basic", "FakeInv", "OpenInv" }));
        this.addSetting(new StringSetting("Soup mode", "Soup Mode", 0, new String[] { "Instant", "Legit" }));
        this.addSetting(new StringSetting("Bowls", "Bowls managing", 0, new String[] { "Drop", "Stack" }));
    }
    
    @Override
    public void onEnable() {
        this.field15721 = (int)this.getNumberSettingValueByName("Refill delay");
        this.field15724 = (int)this.getNumberSettingValueByName("Refill delay");
        this.field15725 = false;
        this.field15726 = false;
        this.field15723 = -1;
    }
    
    @EventListener
    private void method10219(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.method17046()) {
            ++this.field15721;
            ++this.field15724;
            final String method9887 = this.getStringSettingValueByName("Refill mode");
            if (!this.field15725) {
                if (this.method10225(Items.field31301) == 0) {
                    if (method9887.equals("OpenInv") && !(AutoSoup.mc.currentScreen instanceof Class518)) {
                        return;
                    }
                    if (this.method10226(Items.field31301) > 0) {
                        if (this.field15721 > 3) {
                            this.method10221();
                        }
                    }
                    return;
                }
            }
            else if (method9887.equals("OpenInv") && !(AutoSoup.mc.currentScreen instanceof Class518)) {
                this.field15725 = false;
            }
            else if (this.method10225(Items.AIR) != 0) {
                this.method10222();
            }
            else {
                this.field15725 = false;
                this.field15726 = false;
            }
            this.method10223();
        }
    }
    
    @EventListener
    private void method10220(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (this.field15726) {
                if (class5721.method16990() instanceof Class4323) {
                    if (((Class4323)class5721.method16990()).method12987() == Class2218.field13623) {
                        class5721.setCancelled(true);
                    }
                }
            }
        }
    }
    
    private void method10221() {
        this.field15725 = true;
        if (this.getStringSettingValueByName("Refill mode").equals("FakeInv")) {
            if (!(AutoSoup.mc.currentScreen instanceof Class518)) {
                AutoSoup.mc.method5269().method17292(new Class4323(Class2218.field13623));
                this.field15726 = true;
            }
        }
        if (this.getStringSettingValueByName("Bowls").equals("Stack")) {
            final int method10225 = this.method10225(Items.field31300);
            if (method10225 > 0) {
                final int method10226 = this.method10224(method10225);
                if (method10226 > 0) {
                    InvManagerUtil.method29367(AutoSoup.mc.player.container.field16154, method10226, 0, Class2133.field12437, AutoSoup.mc.player, true);
                    InvManagerUtil.method29367(AutoSoup.mc.player.container.field16154, method10226, 0, Class2133.field12443, AutoSoup.mc.player, true);
                    InvManagerUtil.method29367(AutoSoup.mc.player.container.field16154, method10226, 0, Class2133.field12437, AutoSoup.mc.player, true);
                    this.field15724 = -5;
                }
            }
        }
        this.field15722 = 9;
    }
    
    private void method10222() {
        final int n = (int)this.getNumberSettingValueByName("Refill delay");
        if (this.field15724 >= n) {
            while (this.field15722 < 36) {
                boolean b = false;
                if (InvManagerUtil.method29363(this.field15722).getItem() == Items.field31301) {
                    if (Math.random() * 100.0 > this.getNumberSettingValueByName("Refill accuracy")) {
                        InvManagerUtil.method29367(AutoSoup.mc.player.container.field16154, this.field15722, 0, Class2133.field12438, AutoSoup.mc.player, true);
                        this.field15724 = 0;
                        b = true;
                    }
                }
                ++this.field15722;
                if (this.method10225(Items.AIR) == 0) {
                    this.field15725 = false;
                    this.field15726 = false;
                    break;
                }
                if (b && n > 0) {
                    break;
                }
            }
            if (this.field15722 > 35) {
                this.field15725 = false;
            }
        }
    }
    
    private void method10223() {
        int field2743 = -1;
        for (int i = 36; i < 45; ++i) {
            if (AutoSoup.mc.player.container.getSlot(i).method20053().getItem() == Items.field31301 && Client.getInstance().method35195().method28162(i) > 100L) {
                field2743 = i - 36;
                break;
            }
        }
        final boolean equals = this.getStringSettingValueByName("Bowls").equals("Drop");
        if (this.getStringSettingValueByName("Soup mode").equals("Instant")) {
            if (field2743 >= 0) {
                if (this.field15721 > 3) {
                    if (AutoSoup.mc.player.method2664() <= this.getNumberSettingValueByName("Health")) {
                        AutoSoup.mc.method5269().method17292(new Class4321(field2743));
                        AutoSoup.mc.method5269().method17292(new Class4307(Class316.field1878));
                        AutoSoup.mc.method5269().method17292(new Class4307(Class316.field1877));
                        if (equals) {
                            AutoSoup.mc.method5269().method17292(new Class4399(Class2003.field11244, BlockPos.ZERO, Direction.DOWN));
                        }
                        AutoSoup.mc.method5269().method17292(new Class4321(AutoSoup.mc.player.inventory.field2743));
                        this.field15721 = 0;
                    }
                }
            }
            return;
        }
        if (this.field15723 < 0) {
            if (field2743 >= 0) {
                if (this.field15721 > 3) {
                    if (AutoSoup.mc.player.method2664() <= this.getNumberSettingValueByName("Health")) {
                        this.field15723 = AutoSoup.mc.player.inventory.field2743;
                        AutoSoup.mc.player.inventory.field2743 = field2743;
                        AutoSoup.mc.playerController.method27318();
                        AutoSoup.mc.method5269().method17292(new Class4307(Class316.field1878));
                        AutoSoup.mc.method5269().method17292(new Class4307(Class316.field1877));
                    }
                }
            }
            return;
        }
        if (equals) {
            AutoSoup.mc.method5269().method17292(new Class4399(Class2003.field11244, BlockPos.ZERO, Direction.DOWN));
        }
        AutoSoup.mc.player.inventory.field2743 = this.field15723;
        AutoSoup.mc.playerController.method27318();
        this.field15721 = 0;
        this.field15723 = -1;
    }
    
    private int method10224(final int n) {
        final ItemStack method29363 = InvManagerUtil.method29363(13);
        if (method29363.getItem() == Items.field31300 && method29363.method27690() <= 64 - n) {
            return 13;
        }
        for (int i = 9; i < 36; ++i) {
            final ItemStack method29364 = InvManagerUtil.method29363(i);
            if (method29364.getItem() == Items.field31300 && method29364.method27690() <= 64 - n) {
                return i;
            }
        }
        final ItemStack method29365 = InvManagerUtil.method29363(13);
        if (method29365.getItem() == Items.field31300 && method29365.method27690() < 64) {
            return 13;
        }
        for (int j = 9; j < 36; ++j) {
            final ItemStack method29366 = InvManagerUtil.method29363(j);
            if (method29366.getItem() == Items.field31300 && method29366.method27690() < 64) {
                return j;
            }
        }
        if (InvManagerUtil.method29363(13).getItem() == Items.AIR) {
            for (int k = 36; k < 45; ++k) {
                if (AutoSoup.mc.player.container.getSlot(k).method20053().getItem() == Items.field31300) {
                    InvManagerUtil.method29370(13, k - 36);
                    return 13;
                }
            }
        }
        for (int l = 9; l < 36; ++l) {
            if (InvManagerUtil.method29363(l).getItem() == Items.AIR) {
                for (int n2 = 36; n2 < 45; ++n2) {
                    if (AutoSoup.mc.player.container.getSlot(n2).method20053().getItem() == Items.field31300) {
                        InvManagerUtil.method29370(l, n2 - 36);
                        return -1;
                    }
                }
            }
        }
        for (int n3 = 36; n3 < 45; ++n3) {
            if (AutoSoup.mc.player.container.getSlot(n3).method20053().getItem() == Items.field31300) {
                InvManagerUtil.method29370(13, n3 - 36);
                return -1;
            }
        }
        return -1;
    }
    
    private int method10225(final Item class3820) {
        int n = 0;
        for (int i = 36; i < 45; ++i) {
            if (AutoSoup.mc.player.container.getSlot(i).method20053().getItem() == class3820) {
                ++n;
            }
        }
        return n;
    }
    
    private int method10226(final Item class3820) {
        int n = 0;
        for (int i = 9; i < 36; ++i) {
            if (AutoSoup.mc.player.container.getSlot(i).method20053().getItem() == class3820) {
                ++n;
            }
        }
        return n;
    }
}

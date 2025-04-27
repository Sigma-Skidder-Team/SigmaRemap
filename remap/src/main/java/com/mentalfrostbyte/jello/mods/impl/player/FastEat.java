// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;

public class FastEat extends Module
{
    public FastEat() {
        super(Category.PLAYER, "FastEat", "Allows you to eat faster");
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Basic", "Hypixel" }).setPremiumMode("Hypixel"));
        this.addSetting(new NumberSetting("Speed", "Eating speed.", 0.55f, Float.class, 0.0f, 1.0f, 0.01f));
    }
    
    @EventListener
    public void method10319(final EventPlayerTick eventPlayerTick) {
        if (!this.isEnabled() || FastEat.mc.player == null) {
            return;
        }
        if (FastEat.mc.player.method2756()) {
            final ItemStack method2766 = FastEat.mc.player.method2766();
            if (method2766 != null && (method2766.method27653() == Class1992.field11156 || method2766.method27653() == Class1992.field11155) && FastEat.mc.player.method2767() < this.getNumberSettingValueByName("Speed") * 32.0f) {
                final String method2767 = this.getStringSettingValueByName("Mode");
                switch (method2767) {
                    case "Basic": {
                        for (int n2 = FastEat.mc.player.method2767() + 2, i = 0; i < n2; ++i) {
                            FastEat.mc.method5269().method17292(new Class4353(FastEat.mc.player.onGround));
                            FastEat.mc.player.method2769();
                        }
                        break;
                    }
                    case "Hypixel": {
                        FastEat.mc.method5269().method17292(new Class4321((FastEat.mc.player.inventory.field2743 + 1 >= 9) ? 0 : (FastEat.mc.player.inventory.field2743 + 1)));
                        FastEat.mc.method5269().method17292(new Class4321(FastEat.mc.player.inventory.field2743));
                        break;
                    }
                }
            }
        }
    }
}

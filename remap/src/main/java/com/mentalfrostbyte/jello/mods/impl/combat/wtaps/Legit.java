// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.wtaps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.Class8341;
import mapped.EventListener;
import mapped.Minecraft;

public class Legit extends Module
{
    public Legit() {
        super(Category.COMBAT, "Legit", "Increase the knockback you give to players");
    }
    
    @EventListener
    private void method10546(final Class5743 class5743) {
        if (this.isEnabled()) {
            Legit.mc.gameSettings.field23441.field2162 = true;
            if (Legit.mc.player.field2935 != 1) {
                if (Legit.mc.player.field2935 == 0) {
                    Legit.mc.gameSettings.field23435.field2162 = Class8341.method27798(Minecraft.method5277().field4632.method7690(), Legit.mc.gameSettings.field23435.field2161.field32860);
                }
            }
            else {
                Legit.mc.gameSettings.field23435.field2162 = false;
            }
        }
    }
}

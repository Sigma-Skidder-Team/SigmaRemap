// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.EventListener;

public class FastBreak extends Module
{
    public FastBreak() {
        super(Category.WORLD, "FastBreak", "Break blocks faster");
    }
    
    @EventListener
    private void method10017(final Class5743 class5743) {
        if (this.method9906()) {
            if (FastBreak.mc.field4682.field33867 > 0.7f) {
                FastBreak.mc.field4682.field33867 = 1.0f;
            }
            FastBreak.mc.field4682.field33869 = 0;
        }
    }
}

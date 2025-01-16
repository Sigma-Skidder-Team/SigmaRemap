// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.Class9439;
import mapped.EventListener;

public class AntiLevitation extends Module
{
    public AntiLevitation() {
        super(Category.MISC, "AntiLevitation", "Removes levitation effects");
    }
    
    @EventListener
    public void method10139(final Class5743 class5743) {
        if (this.method9906()) {
            AntiLevitation.mc.player.method2659(Class9439.field40498);
        }
    }
}

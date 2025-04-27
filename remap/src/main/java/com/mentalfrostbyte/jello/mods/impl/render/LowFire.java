// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.EventRenderFire;
import mapped.EventListener;

public class LowFire extends Module
{
    public LowFire() {
        super(Category.RENDER, "LowFire", "Makes the fire transparent when you're burning");
    }
    
    @EventListener
    public void method10802(final EventRenderFire eventRenderFire) {
        if (this.isEnabled()) {
            eventRenderFire.method17053(0.14f);
        }
    }
}

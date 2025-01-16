// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5741;
import mapped.EventListener;

public class NoHurtCam extends Module
{
    public NoHurtCam() {
        super(Category.RENDER, "NoHurtCam", "Disables the hurt animation");
    }
    
    @EventListener
    private void method10176(final Class5741 class5741) {
        if (this.method9906()) {
            NoHurtCam.mc.player.field2938 = 0;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5741;
import mapped.Class9439;
import mapped.EventListener;

public class AntiBlind extends Module
{
    public AntiBlind() {
        super(Category.RENDER, "AntiBlind", "Disables bad visual potion effects");
    }
    
    @EventListener
    private void method10249(final Class5741 class5741) {
        if (this.method9906()) {
            AntiBlind.mc.player.method2659(Class9439.field40482);
            AntiBlind.mc.player.method2659(Class9439.field40488);
        }
    }
}

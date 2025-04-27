// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class OldKeyStrokes extends Module
{
    public OldKeyStrokes() {
        super(Category.GUI, "KeyStrokes", "Shows what keybind you are pressing");
    }
    
    @EventListener
    private void method10534(final Class5740 class5740) {
        if (this.isEnabled() && OldKeyStrokes.mc.player != null) {
        }
    }
    
    @EventListener
    private void method10535(final Class5752 class5752) {
        if (this.isEnabled() && OldKeyStrokes.mc.player != null) {
        }
    }
    
    @EventListener
    private void method10536(final Class5748 class5748) {
        if (this.isEnabled() && OldKeyStrokes.mc.player != null) {
            if (class5748.method17055() != Class1958.field10671) {
                if (class5748.method17055() != Class1958.field10672) {}
            }
        }
    }
}

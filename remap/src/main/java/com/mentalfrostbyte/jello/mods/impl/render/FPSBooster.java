// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;

public class FPSBooster extends Module
{
    public static boolean field16048;
    
    public FPSBooster() {
        super(Category.RENDER, "FPSBooster", "Disables Armor Stand and particle rendering");
    }
    
    @Override
    public void method9917() {
        super.method9917();
        FPSBooster.field16048 = this.method9906();
    }
    
    @Override
    public void onDisable() {
        FPSBooster.field16048 = false;
    }
    
    @Override
    public void method9879() {
        FPSBooster.field16048 = true;
    }
    
    static {
        FPSBooster.field16048 = false;
    }
}

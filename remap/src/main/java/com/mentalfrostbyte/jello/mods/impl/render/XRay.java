// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class3992;
import mapped.Class5719;
import mapped.EventListener;

public class XRay extends Module
{
    public static XRay field15720;
    
    public XRay() {
        super(Category.RENDER, "XRay", "Shows ores");
        XRay.field15720 = this;
    }
    
    @Override
    public void method9879() {
        XRay.mc.field4636.method5701();
    }
    
    @Override
    public void onDisable() {
        XRay.mc.field4636.method5701();
    }
    
    @EventListener
    public void method10218(final Class5719 class5719) {
        if (this.method9906()) {
            if (!(class5719.method16986().getBlock() instanceof Class3992)) {
                class5719.method16961(true);
            }
            else {
                class5719.method16988(true);
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.BlockThing;
import mapped.EventRenderBlocks;
import mapped.EventListener;

public class XRay extends Module
{
    public static XRay xrayModule;
    
    public XRay() {
        super(Category.RENDER, "XRay", "Shows ores");
        XRay.xrayModule = this;
    }
    
    @Override
    public void onEnable() {
        XRay.mc.worldRenderer.loadRenderers();
    }
    
    @Override
    public void onDisable() {
        XRay.mc.worldRenderer.loadRenderers();
    }
    
    @EventListener
    public void onRenderBlocks(final EventRenderBlocks eventRenderBlocks) {
        if (this.isEnabled()) {
            if (!(eventRenderBlocks.getBlockState().getBlock() instanceof BlockThing)) {
                eventRenderBlocks.setCancelled(true);
            }
            else {
                eventRenderBlocks.method16988(true);
            }
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRenderBlocks;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class3420;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;

public class XRay extends Module {
    public static XRay field23483;

    public XRay() {
        super(ModuleCategory.RENDER, "XRay", "Shows ores");
        field23483= this;
    }

    @Override
    public void onEnable() {
        mc.worldRenderer.loadRenderers();
        Fullbright fullbright = (Fullbright) Client.getInstance().getModuleManager().getModuleByClass(Fullbright.class);
        if (!fullbright.isEnabled()) {
            fullbright.setState(true);
        }
    }

    @Override
    public void onDisable() {
        mc.worldRenderer.loadRenderers();
    }

    @EventTarget
    public void EventRenderBlocks(EventRenderBlocks event) {
        if (this.isEnabled()) {
            AbstractBlock.AbstractBlockState getBlock = event.method13970();
            if (!(getBlock.getBlock() instanceof Class3420) && getBlock.getBlock() != Blocks.field37121) {
                event.setCancelled(true);
            } else {
                event.method13972(true);
            }
        }
    }
}

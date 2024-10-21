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
    public static XRay instance;

    public XRay() {
        super(ModuleCategory.RENDER, "XRay", "Shows ores");
        instance = this;
    }

    @Override
    public void onEnable() {
        mc.worldRenderer.loadRenderers();
        Fullbright fullbrightModule = (Fullbright) Client.getInstance().getModuleManager().getModuleByClass(Fullbright.class);
        if (!fullbrightModule.isEnabled()) {
            fullbrightModule.setState(true);
        }
    }

    @Override
    public void onDisable() {
        mc.worldRenderer.loadRenderers();
    }

    @EventTarget
    public void onRenderBlocks(EventRenderBlocks event) {
        if (this.isEnabled()) {
            AbstractBlock.AbstractBlockState blockState = event.method13970();
            if (!(blockState.getBlock() instanceof Class3420) && blockState.getBlock() != Blocks.field37121) {
                event.setCancelled(true);
            } else {
                event.method13972(true);
            }
        }
    }
}

package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRenderBlocks;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.block.Blocks;
import mapped.Class3420;
import mapped.Class7377;

public class XRay extends Module {
    public static XRay field23483;

    public XRay() {
        super(ModuleCategory.RENDER, "XRay", "Shows ores");
        field23483 = this;
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
    public void method16141(EventRenderBlocks var1) {
        if (this.isEnabled()) {
            Class7377 var4 = var1.method13970();
            if (!(var4.getBlock() instanceof Class3420) && var4.getBlock() != Blocks.field37121) {
                var1.setCancelled(true);
            } else {
                var1.method13972(true);
            }
        }
    }
}

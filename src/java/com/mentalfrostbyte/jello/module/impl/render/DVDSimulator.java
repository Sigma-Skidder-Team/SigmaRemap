package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import mapped.ColorUtils;
import mapped.Class8513;
import mapped.Class9108;
import mapped.RenderUtil;

import java.awt.Color;
import java.io.IOException;

public class DVDSimulator extends Module {
    public Class8513 field23720 = new Class8513(1.0F, 1.0F);
    public float field23721;
    public float field23722 = 0.0F;
    public float field23723 = 1.0F;
    public float field23724 = 1.0F;
    public Class9108 field23725 = new Class9108(201, 90);
    public int field23726 = 0;

    public DVDSimulator() {
        super(ModuleCategory.RENDER, "DVD Simulator", "wtf");
        this.method16513();
    }

    @Override
    
    public void onEnable() {
        this.field23721 = (float) ((double) (mc.mainWindow.getWidth() - this.field23725.field41839) * Math.random());
        this.field23722 = (float) ((double) (mc.mainWindow.getHeight() - this.field23725.field41840) * Math.random());
        this.method16513();
    }

    @EventTarget
    private void method16512(Class4415 var1) throws IOException {
        if (this.isEnabled() && mc.player != null && mc.world != null) {
            int var4 = mc.mainWindow.getHeight();
            int var5 = mc.mainWindow.getWidth();
            byte var6 = 2;
            if (!(this.field23722 <= (float) var6)) {
                if (this.field23722 + (float) this.field23725.field41840 > (float) var4) {
                    this.field23724 = -1.0F;
                    this.method16513();
                }
            } else {
                this.field23724 = 1.0F;
                this.method16513();
            }

            if (!(this.field23721 <= (float) var6)) {
                if (this.field23721 + (float) this.field23725.field41839 > (float) var5) {
                    this.field23723 = -1.0F;
                    this.method16513();
                }
            } else {
                this.field23723 = 1.0F;
                this.method16513();
            }

            this.field23721 = this.field23721 + this.field23723 * (float) var6;
            this.field23722 = this.field23722 + this.field23724 * (float) var6;
            RenderUtil.method11449(
                    this.field23721,
                    this.field23722,
                    (float) this.field23725.field41839,
                    (float) this.field23725.field41840,
                    ResourcesDecrypter.dvdPNG,
                    ColorUtils.applyAlpha(this.field23726, 0.8F)
            );
        }
    }

    private void method16513() {
        this.field23726 = Color.getHSBColor((float) Math.random(), 0.6F, 1.0F).getRGB();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import net.minecraft.util.math.BlockPos;
import mapped.Class5743;
import mapped.EventListener;
import net.minecraft.world.chunk.IChunk;

public class Fullbright extends Module
{
    public float field15533;
    
    public Fullbright() {
        super(Category.RENDER, "Fullbright", "Makes you see in the dark");
        this.field15533 = 1.0f;
        this.addSetting(new StringSetting("Type", "Fullbright type", 0, new String[] { "Normal" }));
    }
    
    @Override
    public void method9917() {
        if (!this.method9906()) {
            Fullbright.mc.gameSettings.field23472 = 1.0;
        }
    }
    
    @Override
    public void method9879() {
        if (this.method9887("Type").equals("Normal")) {
            Fullbright.mc.gameSettings.field23472 = 999.0;
        }
    }
    
    @EventListener
    public void method9938(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        Fullbright.mc.gameSettings.field23472 = 999.0;
        if (Fullbright.mc.world == null) {
            return;
        }
        if (this.method9887("Type").equals("Normal")) {
            return;
        }
        int n = 16;
        final BlockPos method1137 = new BlockPos(Fullbright.mc.player.posX, Fullbright.mc.player.posY, Fullbright.mc.player.posZ).method1137();
        final IChunk method1138 = Fullbright.mc.world.method6965(method1137);
        if (method1138 != null) {
            if (method1137.getY() >= 0) {
                if (method1137.getY() < 256) {
                    if (!method1138.method7043()) {
                        n -= method1138.getLightValue(method1137);
                    }
                }
            }
        }
        this.field15533 += (n - this.field15533) * 0.2f;
        if (this.field15533 >= 1.5f) {
            Fullbright.mc.gameSettings.field23472 = Math.min(Math.max(1.0f, this.field15533), 10.0f);
        }
    }
    
    @Override
    public void onDisable() {
        Fullbright.mc.gameSettings.field23472 = 1.0;
    }
}

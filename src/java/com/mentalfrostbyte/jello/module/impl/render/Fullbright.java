package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.IChunk;
import mapped.ModeSetting;
import net.minecraft.util.math.BlockPos;

public class Fullbright extends Module {
    public float field23850 = 1.0F;

    public Fullbright() {
        super(ModuleCategory.RENDER, "Fullbright", "Makes you see in the dark");
        this.registerSetting(new ModeSetting("Type", "Fullbright type", 0, "Normal"));
    }

    @Override
    public void method15953() {
        if (!this.isEnabled()) {
            mc.gameSettings.gamma = 1.0;
        }
    }

    @Override
    public void onEnable() {
        if (this.getStringSettingValueByName("Type").equals("Normal")) {
            mc.gameSettings.gamma = 999.0;
        }
    }

    @EventTarget
    public void method16691(TickEvent var1) {
        if (this.isEnabled()) {
            mc.gameSettings.gamma = 999.0;
            if (mc.world != null) {
                if (!this.getStringSettingValueByName("Type").equals("Normal")) {
                    int var4 = 16;
                    BlockPos var5 = new BlockPos(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ())
                            .up();
                    IChunk var6 = mc.world.method7011(var5);
                    if (var6 != null && var5.getY() >= 0 && var5.getY() < 256 && !var6.method7095()) {
                        var4 -= var6.getLightValue(var5);
                    }

                    this.field23850 = this.field23850 + ((float) var4 - this.field23850) * 0.2F;
                    if (!(this.field23850 < 1.5F)) {
                        mc.gameSettings.gamma = Math.min(Math.max(1.0F, this.field23850), 10.0F);
                    }
                }
            }
        }
    }

    @Override
    public void onDisable() {
        mc.gameSettings.gamma = 1.0;
    }
}

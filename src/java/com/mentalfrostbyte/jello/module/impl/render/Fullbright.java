package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.world.chunk.IChunk;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import net.minecraft.util.math.BlockPos;

public class Fullbright extends Module {
    public float currentGamma = 1.0F;

    public Fullbright() {
        super(ModuleCategory.RENDER, "Fullbright", "Makes you see in the dark");
        this.registerSetting(new ModeSetting("Type", "Fullbright type", 0, "Normal"));
    }

    @Override
    public void initialize() {
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
    public void onTick(TickEvent event) {
        if (this.isEnabled()) {
            mc.gameSettings.gamma = 999.0;
            if (mc.world != null) {
                if (!this.getStringSettingValueByName("Type").equals("Normal")) {
                    int lightAdjustment = 16;
                    BlockPos playerPos = new BlockPos(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ()).up();
                    IChunk currentChunk = mc.world.getChunk(playerPos);

                    if (currentChunk != null && playerPos.getY() >= 0 && playerPos.getY() < 256 && !currentChunk.hasLight()) {
                        lightAdjustment -= currentChunk.getLightValue(playerPos);
                    }

                    this.currentGamma += (lightAdjustment - this.currentGamma) * 0.2F;
                    if (this.currentGamma >= 1.5F) {
                        mc.gameSettings.gamma = Math.min(Math.max(1.0F, this.currentGamma), 10.0F);
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

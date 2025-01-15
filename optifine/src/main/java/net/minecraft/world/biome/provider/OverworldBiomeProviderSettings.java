package net.minecraft.world.biome.provider;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.storage.WorldInfo;

public class OverworldBiomeProviderSettings implements IBiomeProviderSettings
{
    private final long field_226848_a_;
    private final WorldType field_226849_b_;
    private OverworldGenSettings generatorSettings = new OverworldGenSettings();

    public OverworldBiomeProviderSettings(WorldInfo p_i3282_1_)
    {
        this.field_226848_a_ = p_i3282_1_.getSeed();
        this.field_226849_b_ = p_i3282_1_.getGenerator();
    }

    public OverworldBiomeProviderSettings setGeneratorSettings(OverworldGenSettings p_205441_1_)
    {
        this.generatorSettings = p_205441_1_;
        return this;
    }

    public long func_226850_a_()
    {
        return this.field_226848_a_;
    }

    public WorldType func_226851_b_()
    {
        return this.field_226849_b_;
    }

    public OverworldGenSettings getGeneratorSettings()
    {
        return this.generatorSettings;
    }
}

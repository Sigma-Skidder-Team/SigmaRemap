package net.minecraft.block;

import net.minecraft.item.DyeColor;

public class StainedGlassBlock extends AbstractGlassBlock implements IBeaconBeamColorProvider
{
    private final DyeColor color;

    public StainedGlassBlock(DyeColor p_i286_1_, Block.Properties p_i286_2_)
    {
        super(p_i286_2_);
        this.color = p_i286_1_;
    }

    public DyeColor getColor()
    {
        return this.color;
    }
}

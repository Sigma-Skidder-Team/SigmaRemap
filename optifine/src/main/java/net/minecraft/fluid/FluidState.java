package net.minecraft.fluid;

import com.google.common.collect.ImmutableMap;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateHolder;

public class FluidState extends StateHolder<Fluid, IFluidState> implements IFluidState
{
    public FluidState(Fluid p_i3280_1_, ImmutableMap < IProperty<?>, Comparable<? >> p_i3280_2_)
    {
        super(p_i3280_1_, p_i3280_2_);
    }

    public Fluid getFluid()
    {
        return this.object;
    }
}

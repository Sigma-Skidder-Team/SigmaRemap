package net.minecraft.util.math.shapes;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class OffsetDoubleList extends AbstractDoubleList
{
    private final DoubleList delegate;
    private final double offset;

    public OffsetDoubleList(DoubleList p_i2095_1_, double p_i2095_2_)
    {
        this.delegate = p_i2095_1_;
        this.offset = p_i2095_2_;
    }

    public double getDouble(int p_getDouble_1_)
    {
        return this.delegate.getDouble(p_getDouble_1_) + this.offset;
    }

    public int size()
    {
        return this.delegate.size();
    }
}

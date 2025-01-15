package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum SlabType implements IStringSerializable
{
    TOP("top"),
    BOTTOM("bottom"),
    DOUBLE("double");

    private final String name;

    private SlabType(String p_i2308_3_)
    {
        this.name = p_i2308_3_;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }
}

package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum Half implements IStringSerializable
{
    TOP("top"),
    BOTTOM("bottom");

    private final String name;

    private Half(String p_i2784_3_)
    {
        this.name = p_i2784_3_;
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

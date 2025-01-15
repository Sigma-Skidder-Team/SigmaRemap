package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum RedstoneSide implements IStringSerializable
{
    UP("up"),
    SIDE("side"),
    NONE("none");

    private final String name;

    private RedstoneSide(String p_i474_3_)
    {
        this.name = p_i474_3_;
    }

    public String toString()
    {
        return this.getName();
    }

    public String getName()
    {
        return this.name;
    }
}

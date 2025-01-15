package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum ComparatorMode implements IStringSerializable
{
    COMPARE("compare"),
    SUBTRACT("subtract");

    private final String name;

    private ComparatorMode(String p_i2569_3_)
    {
        this.name = p_i2569_3_;
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

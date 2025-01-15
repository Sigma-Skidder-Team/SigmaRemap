package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum BambooLeaves implements IStringSerializable
{
    NONE("none"),
    SMALL("small"),
    LARGE("large");

    private final String name;

    private BambooLeaves(String p_i3213_3_)
    {
        this.name = p_i3213_3_;
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

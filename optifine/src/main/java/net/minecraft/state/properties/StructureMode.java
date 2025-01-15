package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum StructureMode implements IStringSerializable
{
    SAVE("save"),
    LOAD("load"),
    CORNER("corner"),
    DATA("data");

    private final String name;

    private StructureMode(String p_i3349_3_)
    {
        this.name = p_i3349_3_;
    }

    public String getName()
    {
        return this.name;
    }
}

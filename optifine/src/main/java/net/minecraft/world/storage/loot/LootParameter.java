package net.minecraft.world.storage.loot;

import net.minecraft.util.ResourceLocation;

public class LootParameter<T>
{
    private final ResourceLocation id;

    public LootParameter(ResourceLocation p_i2216_1_)
    {
        this.id = p_i2216_1_;
    }

    public ResourceLocation getId()
    {
        return this.id;
    }

    public String toString()
    {
        return "<parameter " + this.id + ">";
    }
}

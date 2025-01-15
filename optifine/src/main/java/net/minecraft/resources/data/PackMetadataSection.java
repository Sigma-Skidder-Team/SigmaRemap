package net.minecraft.resources.data;

import net.minecraft.util.text.ITextComponent;

public class PackMetadataSection
{
    public static final PackMetadataSectionSerializer SERIALIZER = new PackMetadataSectionSerializer();
    private final ITextComponent description;
    private final int packFormat;

    public PackMetadataSection(ITextComponent p_i2368_1_, int p_i2368_2_)
    {
        this.description = p_i2368_1_;
        this.packFormat = p_i2368_2_;
    }

    public ITextComponent getDescription()
    {
        return this.description;
    }

    public int getPackFormat()
    {
        return this.packFormat;
    }
}

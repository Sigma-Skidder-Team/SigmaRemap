package net.minecraft.world;

public enum LightType
{
    SKY(15),
    BLOCK(0);

    public final int defaultLightValue;

    private LightType(int p_i3502_3_)
    {
        this.defaultLightValue = p_i3502_3_;
    }
}

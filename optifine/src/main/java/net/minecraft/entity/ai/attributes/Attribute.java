package net.minecraft.entity.ai.attributes;

import javax.annotation.Nullable;

public abstract class Attribute implements IAttribute
{
    private final IAttribute parent;
    private final String translationKey;
    private final double defaultValue;
    private boolean shouldWatch;

    protected Attribute(@Nullable IAttribute p_i735_1_, String p_i735_2_, double p_i735_3_)
    {
        this.parent = p_i735_1_;
        this.translationKey = p_i735_2_;
        this.defaultValue = p_i735_3_;

        if (p_i735_2_ == null)
        {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    public String getName()
    {
        return this.translationKey;
    }

    public double getDefaultValue()
    {
        return this.defaultValue;
    }

    public boolean getShouldWatch()
    {
        return this.shouldWatch;
    }

    public Attribute setShouldWatch(boolean shouldWatchIn)
    {
        this.shouldWatch = shouldWatchIn;
        return this;
    }

    @Nullable
    public IAttribute getParent()
    {
        return this.parent;
    }

    public int hashCode()
    {
        return this.translationKey.hashCode();
    }

    public boolean equals(Object p_equals_1_)
    {
        return p_equals_1_ instanceof IAttribute && this.translationKey.equals(((IAttribute)p_equals_1_).getName());
    }
}

package net.minecraft.entity;

public class EntitySize
{
    public final float width;
    public final float height;
    public final boolean fixed;

    public EntitySize(float p_i708_1_, float p_i708_2_, boolean p_i708_3_)
    {
        this.width = p_i708_1_;
        this.height = p_i708_2_;
        this.fixed = p_i708_3_;
    }

    public EntitySize scale(float factor)
    {
        return this.scale(factor, factor);
    }

    public EntitySize scale(float widthFactor, float heightFactor)
    {
        return !this.fixed && (widthFactor != 1.0F || heightFactor != 1.0F) ? flexible(this.width * widthFactor, this.height * heightFactor) : this;
    }

    public static EntitySize flexible(float widthIn, float heightIn)
    {
        return new EntitySize(widthIn, heightIn, false);
    }

    public static EntitySize fixed(float widthIn, float heightIn)
    {
        return new EntitySize(widthIn, heightIn, true);
    }

    public String toString()
    {
        return "EntityDimensions w=" + this.width + ", h=" + this.height + ", fixed=" + this.fixed;
    }
}

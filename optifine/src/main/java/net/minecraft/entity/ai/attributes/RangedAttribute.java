package net.minecraft.entity.ai.attributes;

import javax.annotation.Nullable;
import net.minecraft.util.math.MathHelper;

public class RangedAttribute extends Attribute
{
    private final double minimumValue;
    private final double maximumValue;
    private String description;

    public RangedAttribute(@Nullable IAttribute p_i2052_1_, String p_i2052_2_, double p_i2052_3_, double p_i2052_5_, double p_i2052_7_)
    {
        super(p_i2052_1_, p_i2052_2_, p_i2052_3_);
        this.minimumValue = p_i2052_5_;
        this.maximumValue = p_i2052_7_;

        if (p_i2052_5_ > p_i2052_7_)
        {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        else if (p_i2052_3_ < p_i2052_5_)
        {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        else if (p_i2052_3_ > p_i2052_7_)
        {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public RangedAttribute setDescription(String descriptionIn)
    {
        this.description = descriptionIn;
        return this;
    }

    public String getDescription()
    {
        return this.description;
    }

    public double clampValue(double value)
    {
        value = MathHelper.clamp(value, this.minimumValue, this.maximumValue);
        return value;
    }
}

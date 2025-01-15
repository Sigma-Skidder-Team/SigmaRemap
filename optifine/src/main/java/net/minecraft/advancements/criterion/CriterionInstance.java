package net.minecraft.advancements.criterion;

import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.util.ResourceLocation;

public class CriterionInstance implements ICriterionInstance
{
    private final ResourceLocation criterion;

    public CriterionInstance(ResourceLocation p_i2228_1_)
    {
        this.criterion = p_i2228_1_;
    }

    public ResourceLocation getId()
    {
        return this.criterion;
    }

    public String toString()
    {
        return "AbstractCriterionInstance{criterion=" + this.criterion + '}';
    }
}

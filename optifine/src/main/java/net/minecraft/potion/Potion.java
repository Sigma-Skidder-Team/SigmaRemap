package net.minecraft.potion;

import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class Potion
{
    private final String baseName;
    private final ImmutableList<EffectInstance> effects;

    public static Potion getPotionTypeForName(String name)
    {
        return Registry.POTION.getOrDefault(ResourceLocation.tryCreate(name));
    }

    public Potion(EffectInstance... p_i1475_1_)
    {
        this((String)null, p_i1475_1_);
    }

    public Potion(@Nullable String p_i1476_1_, EffectInstance... p_i1476_2_)
    {
        this.baseName = p_i1476_1_;
        this.effects = ImmutableList.copyOf(p_i1476_2_);
    }

    public String getNamePrefixed(String prefix)
    {
        return prefix + (this.baseName == null ? Registry.POTION.getKey(this).getPath() : this.baseName);
    }

    public List<EffectInstance> getEffects()
    {
        return this.effects;
    }

    public boolean hasInstantEffect()
    {
        if (!this.effects.isEmpty())
        {
            for (EffectInstance effectinstance : this.effects)
            {
                if (effectinstance.getPotion().isInstant())
                {
                    return true;
                }
            }
        }

        return false;
    }
}

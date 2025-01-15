package net.minecraft.item;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.potion.EffectInstance;
import org.apache.commons.lang3.tuple.Pair;

public class Food
{
    private final int value;
    private final float saturation;
    private final boolean meat;
    private final boolean canEatWhenFull;
    private final boolean fastToEat;
    private final List<Pair<EffectInstance, Float>> effects;

    private Food(int p_i3060_1_, float p_i3060_2_, boolean p_i3060_3_, boolean p_i3060_4_, boolean p_i3060_5_, List<Pair<EffectInstance, Float>> p_i3060_6_)
    {
        this.value = p_i3060_1_;
        this.saturation = p_i3060_2_;
        this.meat = p_i3060_3_;
        this.canEatWhenFull = p_i3060_4_;
        this.fastToEat = p_i3060_5_;
        this.effects = p_i3060_6_;
    }

    public int getHealing()
    {
        return this.value;
    }

    public float getSaturation()
    {
        return this.saturation;
    }

    public boolean isMeat()
    {
        return this.meat;
    }

    public boolean canEatWhenFull()
    {
        return this.canEatWhenFull;
    }

    public boolean isFastEating()
    {
        return this.fastToEat;
    }

    public List<Pair<EffectInstance, Float>> getEffects()
    {
        return this.effects;
    }

    public static class Builder
    {
        private int value;
        private float saturation;
        private boolean meat;
        private boolean alwaysEdible;
        private boolean fastToEat;
        private final List<Pair<EffectInstance, Float>> effects = Lists.newArrayList();

        public Food.Builder hunger(int hungerIn)
        {
            this.value = hungerIn;
            return this;
        }

        public Food.Builder saturation(float saturationIn)
        {
            this.saturation = saturationIn;
            return this;
        }

        public Food.Builder meat()
        {
            this.meat = true;
            return this;
        }

        public Food.Builder setAlwaysEdible()
        {
            this.alwaysEdible = true;
            return this;
        }

        public Food.Builder fastToEat()
        {
            this.fastToEat = true;
            return this;
        }

        public Food.Builder effect(EffectInstance effectIn, float probability)
        {
            this.effects.add(Pair.of(effectIn, probability));
            return this;
        }

        public Food build()
        {
            return new Food(this.value, this.saturation, this.meat, this.alwaysEdible, this.fastToEat, this.effects);
        }
    }
}

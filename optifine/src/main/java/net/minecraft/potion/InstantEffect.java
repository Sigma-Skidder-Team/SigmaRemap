package net.minecraft.potion;

public class InstantEffect extends Effect
{
    public InstantEffect(EffectType worldIn, int shooter)
    {
        super(worldIn, shooter);
    }

    public boolean isInstant()
    {
        return true;
    }

    public boolean isReady(int duration, int amplifier)
    {
        return duration >= 1;
    }
}

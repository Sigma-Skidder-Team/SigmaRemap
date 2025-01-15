package net.minecraft.util.text;

public class TranslationTextComponentFormatException extends IllegalArgumentException
{
    public TranslationTextComponentFormatException(TranslationTextComponent p_i659_1_, String p_i659_2_)
    {
        super(String.format("Error parsing: %s: %s", p_i659_1_, p_i659_2_));
    }

    public TranslationTextComponentFormatException(TranslationTextComponent p_i660_1_, int p_i660_2_)
    {
        super(String.format("Invalid index %d requested for %s", p_i660_2_, p_i660_1_));
    }

    public TranslationTextComponentFormatException(TranslationTextComponent p_i661_1_, Throwable p_i661_2_)
    {
        super(String.format("Error while parsing: %s", p_i661_1_), p_i661_2_);
    }
}

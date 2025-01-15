package net.minecraft.util;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum HandSide
{
    LEFT(new TranslationTextComponent("options.mainHand.left")),
    RIGHT(new TranslationTextComponent("options.mainHand.right"));

    private final ITextComponent handName;

    private HandSide(ITextComponent p_i2338_3_)
    {
        this.handName = p_i2338_3_;
    }

    public HandSide opposite()
    {
        return this == LEFT ? RIGHT : LEFT;
    }

    public String toString()
    {
        return this.handName.getString();
    }
}

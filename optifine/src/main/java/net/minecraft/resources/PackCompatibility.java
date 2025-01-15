package net.minecraft.resources;

import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum PackCompatibility
{
    TOO_OLD("old"),
    TOO_NEW("new"),
    COMPATIBLE("compatible");

    private final ITextComponent description;
    private final ITextComponent confirmMessage;

    private PackCompatibility(String p_i275_3_)
    {
        this.description = new TranslationTextComponent("resourcePack.incompatible." + p_i275_3_);
        this.confirmMessage = new TranslationTextComponent("resourcePack.incompatible.confirm." + p_i275_3_);
    }

    public boolean isCompatible()
    {
        return this == COMPATIBLE;
    }

    public static PackCompatibility getCompatibility(int packVersionIn)
    {
        if (packVersionIn < SharedConstants.getVersion().getPackVersion())
        {
            return TOO_OLD;
        }
        else
        {
            return packVersionIn > SharedConstants.getVersion().getPackVersion() ? TOO_NEW : COMPATIBLE;
        }
    }

    public ITextComponent getDescription()
    {
        return this.description;
    }

    public ITextComponent getConfirmMessage()
    {
        return this.confirmMessage;
    }
}

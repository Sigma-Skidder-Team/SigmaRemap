package net.minecraft.client.gui.widget.button;

import net.minecraft.client.settings.AbstractOption;
import net.optifine.gui.IOptionControl;

public class OptionButton extends Button implements IOptionControl
{
    private final AbstractOption enumOptions;

    public OptionButton(int p_i211_1_, int p_i211_2_, int p_i211_3_, int p_i211_4_, AbstractOption p_i211_5_, String p_i211_6_, Button.IPressable p_i211_7_)
    {
        super(p_i211_1_, p_i211_2_, p_i211_3_, p_i211_4_, p_i211_6_, p_i211_7_);
        this.enumOptions = p_i211_5_;
    }

    public AbstractOption getControlOption()
    {
        return this.enumOptions;
    }
}
